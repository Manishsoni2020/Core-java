package com.jsoupdatafatching.jsoupdatafatching;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.commons.math3.util.Pair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ProductToJson {

	public static class LanguageContent {
		public String productName;
		public String description;
		public String shortDescription;

		public LanguageContent(String productName, String description, String shortDescription) {
			this.productName = productName;
			this.description = description;
			this.shortDescription = shortDescription;

		}
	}

	public static class Product {
		public String sku;
		public String price;
		public String date;
		public String domain = "pdpaola.com";
		public String domain_url = "https://www.pdpaola.com";
		public String collection_name = "rings";
		public String brand = "PDPAOLA";
		public String manufacturer = "PDPAOLA";
		public List<String> images = new ArrayList<>();
		public List<String> color = new ArrayList<>();
		public String main_material;
		public Map<String, Map<String, String>> specification = new LinkedHashMap<>();
		public Map<String, String> specifications = new HashMap<>();
		public Map<String, LanguageContent> content = new HashMap<>();

		public Product(String sku, String price) {
			this.sku = sku;
			this.price = price;
			this.date = java.time.LocalDate.now().toString();
		}

		public void addTranslation(String langCode, LanguageContent content2) {
			content.put(langCode, content2);
		}
	}

	public static void main(String[] args) {
		try {
			String baseUrl = "https://www.pdpaola.com/collections/rings?page=";
			int page = 1;
			int totalProducts = 0;
			
			Set<String> allProductUrls = new HashSet<>();

			while (true) {
				String url = baseUrl + page;
				Document doc = Jsoup.connect(url).userAgent(
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64)")
						.header("Accept", "text/html").header("Accept-Language", "en-US,en;q=0.5")
						.header("Connection", "keep-alive").timeout(20000).get();

				Elements productLinks = doc.select("a.product-link");

				if (productLinks.isEmpty())
					break;

				for (Element link : productLinks) {
					String productUrl = link.absUrl("href");
					allProductUrls.add(productUrl);
				}
				
				//check kr liya yaha tk sahi h
//				for(String s:allProductUrls)
//				{
//					System.out.println(s);
//				}
				totalProducts += productLinks.size();
				page++;
			}
			System.out.println(" Total Products: " + totalProducts);
			System.out.println(" Total Pages: " + (page - 1));

			List<Product> allProducts = new ArrayList<>();
			
			for (String productUrl : allProductUrls) {
				System.out.println(" Scraping: " + productUrl);
				Product product = scrapeProductData(productUrl);
				
				if (product != null) {

					LanguageContent en = product.content.get("en");
					if (en != null && en.productName != null && !en.productName.trim().isEmpty()) {
						allProducts.add(product);
					} else {
						System.out.println(" Skipped: Product name missing for SKU: " + product.sku);
					}
				}
			
			}
		
				

			File outputDir = new File("output2");
			if (!outputDir.exists())
				outputDir.mkdirs();
			try {
				ObjectMapper mapper = new ObjectMapper();
				for (Product product : allProducts) {
					File jsonFile = new File(outputDir, product.sku + ".json");

					System.out.println("hello " + product);

					mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, product);
					System.out.println(" Saved: " + jsonFile.getName());
				}
			} catch (Exception e) {
				System.out.println(e);
			}

		}
			catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Product scrapeProductData(String productUrl) {
		try {
			Document enDoc = Jsoup.connect(productUrl).get();
			String priceRaw = enDoc.select("span[data-product-price]").text().trim();
			String price = formatPrice(priceRaw);

			Elements skuElements = enDoc.select("div.product-description.f-12 span.description-sku.grey-uppercase");
			String sku = skuElements.isEmpty() ? "N/A" : skuElements.first().text().trim().replace("SKU: ", "");

			Product product = new Product(sku, price);

			Element materialInput = enDoc.selectFirst("input#datalayer-material-finishing");

			if (materialInput != null) {
				String finishingValue = materialInput.attr("value").trim();
				if (!finishingValue.isEmpty()) {
					String[] colors = finishingValue.split("/");
					for (String color : colors) {
						product.color.add(capitalize(color.trim()));
					}
				}
			}

			Elements specItems = enDoc.select("div.product-description.f-12 ul li");
			for (Element item : specItems) {
				String label = item.select("span.spec-class").text().trim().replace(":", "");
				String value = item.select("u").text().trim();
				if (!label.isEmpty() && !value.isEmpty()) {
					if (label.equalsIgnoreCase("Material") || label.equalsIgnoreCase("Metal")) {
						product.main_material = value; // 👈 store karo bahar
					} else {
						product.specifications.put(label, value);
					}
				} else if (label.equalsIgnoreCase("Stones")) {
					String stoneText = item.ownText().trim();
					if (!stoneText.isEmpty()) {
						product.specifications.put("Stones", stoneText.replace("\"", ""));
					}
				} else if (label.equalsIgnoreCase("Height") || label.equalsIgnoreCase("Width")
						|| label.equalsIgnoreCase("Weight")) {
					String otherText = item.ownText().trim();
					if (!otherText.isEmpty()) {
						product.specifications.put(label, otherText.replace("\"", ""));
					}
				}
			}

			System.out.println(" Date: " + product.date);
			System.out.println(" Domain: " + product.domain);
			System.out.println(" Domain URL: " + product.domain_url);
			System.out.println(" Collection: " + product.collection_name);
			System.out.println("️ Brand: " + product.brand);
			System.out.println(" Manufacturer: " + product.manufacturer);

			if (!product.color.isEmpty()) {
				System.out.println("Color: " + product.color);
			}

			if (product.main_material != null) {
				System.out.println("Main Material: " + product.main_material);
			}

			System.out.println("Specifications:");
			for (Map.Entry<String, String> spec : product.specifications.entrySet()) {
				System.out.println(spec.getKey() + ": " + spec.getValue());
			}

			Elements images = enDoc.select("div.img-wrapper img");
			Set<String> imageUrls = new LinkedHashSet<>();
			for (Element img : images) {
				String imageUrl = "";
				String srcset = img.attr("srcset");
				if (!srcset.isEmpty()) {
					imageUrl = getHighestResolutionImage(srcset);
				}
				if (imageUrl.isEmpty()) {
					imageUrl = img.absUrl("data-src");
				}
				if (imageUrl.isEmpty()) {
					imageUrl = img.absUrl("src");
				}
				if (!imageUrl.isEmpty() && (imageUrl.contains(".jpg") || imageUrl.contains(".png"))) {
					if (imageUrl.startsWith("//")) {
						imageUrl = "https:" + imageUrl;
					}
					imageUrls.add(imageUrl);
				}

			}
			product.images.addAll(imageUrls);
			System.out.println(" Image_Urls:");
			for (String img : product.images) {
				System.out.println(" - " + img);
			}

			Pair<LanguageContent, List<String>> result = extractLanguageContent(enDoc, "en");
			LanguageContent enContent = result.getKey();
			product.addTranslation("en", enContent);

			String slug = productUrl.substring(productUrl.lastIndexOf("/") + 1);

			String[] languages = { "fr", "de", "it", "es" };
			for (String lang : languages) {
				String langUrl = "https://www.pdpaola.com/" + lang + "/products/" + slug;
				try {
					Document doc = Jsoup.connect(langUrl).get();

					Pair<LanguageContent, List<String>> result1 = extractLanguageContent(doc, lang);
					LanguageContent content1 = result1.getKey();

					product.addTranslation(lang, content1);
				} catch (IOException e) {
					System.out.println("⚠️ Language page not found: " + langUrl);
				}
			}

			for (String lang : languages) {
				String langUrl = "https://www.pdpaola.com/" + lang + "/products/" + slug + "?lang=en&country=" + lang;
				try {
					Document doc = Jsoup.connect(langUrl).get();

					Pair<LanguageContent, List<String>> result2 = extractLanguageContent(doc, lang);
					LanguageContent content1 = result2.getKey();
					List<String> sizes = result.getValue();

					product.addTranslation(lang, content1);
					Map<String, String> langSpec = new LinkedHashMap<>();

					langSpec.put("lang", "en");
					langSpec.put("domain_country_code", lang);
					langSpec.put("currency", "EUR");
					langSpec.put("base_price", product.price);
					langSpec.put("sales_price", product.price);
					langSpec.put("active_price", product.price);
					langSpec.put("stock_quantity", "");
					langSpec.put("availability", "Yes");
					langSpec.put("availability_message", "AVAILABLE");
					langSpec.put("shipping_lead_time", "");
					langSpec.put("shipping_expenses", "");
					langSpec.put("marketplace_retailer_name", "");
					langSpec.put("condition", "NEW");
					langSpec.put("reviews_rating_value", "");
					langSpec.put("reviews_number", "");
					langSpec.put("size_available", new Gson().toJson(sizes));

					langSpec.put("sku_link", langUrl);

					product.specification.put(lang, langSpec);

				} catch (IOException e) {
					System.out.println("⚠️ Language page not found: " + langUrl);
				}
			}

			System.out.println(" SKU: " + product.sku + " | Price: " + product.price);
			for (Map.Entry<String, LanguageContent> entry : product.content.entrySet()) {
				String lang = entry.getKey();
				LanguageContent content1 = entry.getValue();

				System.out.println("\n [" + lang + "]");
				System.out.println(" Name: " + content1.productName);
				System.out.println(" Short Desc: " + content1.shortDescription);
				System.out.println(" Long Desc: " + content1.description);

			}
			System.out.println("------------------------------------------------------");

			return product;

		} catch (IOException e) {
			System.out.println(" Error loading product: " + productUrl);
			return null;
		}
	}

	private static String capitalize(String input) {
		if (input == null || input.isEmpty())
			return input;
		return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
	}

	private static Pair<LanguageContent, List<String>> extractLanguageContent(Document doc, String lang) {
		String productName = doc.select("h1.product-title").text().trim();
		String shortDesc = doc.select("div.product_seo_description.f-12 h2").text().trim();
		String longDesc = doc.select("div.accordion-wrapper-display p").text().trim();

		Elements sizeElements = doc.select("button.variant-option");
		Set<String> uniqueSizes = new LinkedHashSet<>();
		for (Element sizeElement : sizeElements) {
			uniqueSizes.add(sizeElement.text().trim());
		}
		List<String> sizeList = new ArrayList<>(uniqueSizes);

		LanguageContent content = new LanguageContent(productName, longDesc, shortDesc);
		return new Pair<>(content, sizeList);
	}

	private static String getHighestResolutionImage(String srcset) {
		String[] sources = srcset.split(",");
		String maxUrl = "";
		int maxWidth = 0;
		for (String source : sources) {
			String[] parts = source.trim().split("\\s+");
			if (parts.length == 2) {
				String url = parts[0];
				String widthPart = parts[1].replace("w", "");
				try {
					int width = Integer.parseInt(widthPart);
					if (width > maxWidth) {
						maxWidth = width;
						maxUrl = url;
					}
				} catch (NumberFormatException ignored) {
				}
			}
		}
		return maxUrl;
	}

	private static String formatPrice(String priceRaw) {
		return priceRaw.replaceAll("[^\\d.,]", "").trim();
	}
}
