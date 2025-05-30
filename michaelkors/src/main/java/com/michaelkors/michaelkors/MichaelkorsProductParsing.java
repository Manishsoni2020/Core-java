package com.michaelkors.michaelkors;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.math3.util.Pair;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.jsoupdatafatching.jsoupdatafatching.ProductToJson.LanguageContent;

public class MichaelkorsProductParsing {
	public static class LanguageContent {
		public String productName;
		public String description;

		public LanguageContent(String productName, String description) {
			this.productName = productName;
			this.description = description;

		}
	}

	public static class Product {
		public String sku;
		public String price;
		public String date;
		public String domain = "michaelkors";
		public String domain_url = "https://www.michaelkors.global";
		public String collection_name = "clothing";
		public String brand = "MICHAEL KORS";
		public String manufacturer = "MICHAEL";
		public List<String> images = new ArrayList<>();
		public String color;
		public String main_material;
		public Map<String, Map<String, String>> specification = new LinkedHashMap<>();
		public Map<String, String> specifications = new HashMap<>();
		public Map<String, LanguageContent> content = new HashMap<>();

		public Product(String sku, String price, String color) {
			this.sku = sku;
			this.price = price;
			this.color = color;
			this.date = java.time.LocalDate.now().toString();
		}

		public void addTranslation(String langCode, LanguageContent content2) {
			content.put(langCode, content2);
		}
	}

	public static void main(String[] args) {
		try {
			String baseUrl = "https://www.michaelkors.global/in/en/men/?pmin=1%2C00&prefn1=priceStatus&prefv1=fp&start=";
			int start = 0;
			int pageSize = 24;
			int totalProducts = 0;
			Set<String> allProductUrls = new HashSet<>();

			while (baseUrl != null) {
				String paginatedUrl = baseUrl + start + "&sz=" + pageSize;
				Connection.Response response = Jsoup.connect(paginatedUrl).header("accept",
						"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
						.header("accept-language", "en-US,en;q=0.9,hi;q=0.8").header("cache-control", "max-age=0")
						.header("dnt", "1").header("priority", "u=0, i")
						.header("sec-ch-ua",
								"\"Chromium\";v=\"136\", \"Google Chrome\";v=\"136\", \"Not.A/Brand\";v=\"99\"")
						.header("sec-ch-ua-mobile", "?0").header("sec-ch-ua-platform", "\"Windows\"")
						.header("sec-fetch-dest", "document").header("sec-fetch-mode", "navigate")
						.header("sec-fetch-site", "none").header("sec-fetch-user", "?1")
						.header("upgrade-insecure-requests", "1")
						.header("user-agent",
								"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36")
						.timeout(30000).followRedirects(true).ignoreHttpErrors(true).method(Connection.Method.GET)
						.execute();

				Document doc = response.parse();

				// All product url get
				Elements productLinks = doc.select("a.altImageAvailable");

				if (productLinks.isEmpty())
					break;

				for (Element link : productLinks) {
					String productUrl = link.absUrl("href");
					allProductUrls.add(productUrl);
				}
				totalProducts += productLinks.size();
				System.out.println("Page Start: " + start + " - Products Found: " + productLinks.size());

				start += pageSize; // Move to next page

//				 check kr liya yaha tk sahi h
//				for(String s:allProductUrls)
//				{
//					System.out.println(s);
//				}
//
//			}

				// single product url getting
				List<Product> allProducts = new ArrayList<>();

				for (String productUrl : allProductUrls) {
					System.out.println(" Scraping: " + productUrl);
					Product product = scrapeProductData(productUrl);
					allProducts.add(product);
				}

//				// json file creation
//				File outputDir = new File("output");
//				if (!outputDir.exists())
//					outputDir.mkdirs();
//				try {
//					ObjectMapper mapper = new ObjectMapper();
//					for (Product product : allProducts) {
//
//						File jsonFile = new File(outputDir, product.sku + ".json");
//
//						System.out.println("hello " + product);
//
//						mapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, product);
//						System.out.println(" Saved: " + jsonFile.getName());
//					}
//				} catch (Exception e) {
//					System.out.println(e);
//				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Product scrapeProductData(String productUrl) {
		try {
			Connection.Response response = Jsoup.connect(productUrl).header("accept",
					"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
					.header("accept-language", "en-US,en;q=0.9,hi;q=0.8").header("cache-control", "max-age=0")
					.header("dnt", "1").header("priority", "u=0, i")
					.header("sec-ch-ua",
							"\"Chromium\";v=\"136\", \"Google Chrome\";v=\"136\", \"Not.A/Brand\";v=\"99\"")
					.header("sec-ch-ua-mobile", "?0").header("sec-ch-ua-platform", "\"Windows\"")
					.header("sec-fetch-dest", "document").header("sec-fetch-mode", "navigate")
					.header("sec-fetch-site", "none").header("sec-fetch-user", "?1")
					.header("upgrade-insecure-requests", "1")
					.header("user-agent",
							"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36")
					.timeout(30000).followRedirects(true).ignoreHttpErrors(true).method(Connection.Method.GET)
					.execute();

			Document enDoc = response.parse();

			Element productDiv1 = enDoc.selectFirst(
					"div.product-detail.product-detail--js.product-wrapper.position-relative > span#analytics-productDetails-event");
			String sku = "";
			if (productDiv1 != null) {
				String jsonData = productDiv1.attr("data-tracking-event");

				ObjectMapper mapper = new ObjectMapper();
				try {
					ProductDetails[] products = mapper.readValue(jsonData, ProductDetails[].class);
					if (products.length > 0) {
						ProductDetails product = products[0];
						sku = product.getProductID();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			String priceRaw = enDoc.select("div.product-prices>h3>span>span>span.value").text().trim();
			String price = formatPrice(priceRaw);

			String color = enDoc.select("div.color.color-label.cursor-default>span.display-color-name").text();

			Product product = new Product(sku, price, color);

			System.out.println(" Sku: " + product.sku);
			System.out.println(" Price: " + product.price);
			System.out.println(" color: " + product.color);
			System.out.println(" Date: " + product.date);
			System.out.println(" Domain: " + product.domain);
			System.out.println(" Domain URL: " + product.domain_url);
			System.out.println(" Collection: " + product.collection_name);
			System.out.println("️ Brand: " + product.brand);
			System.out.println(" Manufacturer: " + product.manufacturer);

			if (!product.color.isEmpty()) {
				System.out.println("Color: " + product.color);
			}

			Elements images = enDoc.select("img");
			Set<String> imageUrls = new LinkedHashSet<>();
			for (Element img : images) {
				String imgurl = img.absUrl("src");
				if (!imgurl.contains("/default/")) {
					imageUrls.add(imgurl);
				}
			}

			product.images.addAll(imageUrls);
			System.out.println(" Image_Urls:");
			for (String img : product.images) {
				System.out.println(" - " + img);
			}

			String baseSlug = "/product/medium-logo-stripe-crossbody/_/R-MK_35F3G7ZC5B";
																						
			String[] languages = { "fr", "de", "it" };
			String[] countries = { "fr", "de", "it" };

			Map<String, String> baseDomainMap = new HashMap<>();
			baseDomainMap.put("fr_fr", "https://www.michaelkors.fr/homme/");
			baseDomainMap.put("de_de", "https://www.michaelkors.de/herren/");
			baseDomainMap.put("it_it", "https://www.michaelkors.it/uomo/");

			// English version (global base URL, optional)
			String productUrlEn = "https://www.michaelkors.global/mt/en" + baseSlug;

			try {
				Pair<LanguageContent, List<String>> result = extractLanguageContent(enDoc, "en");
				product.addTranslation("en", result.getKey());

				for (int i = 0; i < languages.length; i++) {
					String lang = languages[i];
					String country = countries[i];
					String key = country + "_" + lang;

					String base = baseDomainMap.get(key);
					if (base == null) {
						System.out.println("❌ Men category URL mapping missing for: " + key);
						continue;
					}

					// Use only category URL, no product slug appended
					String langUrl = base;
					System.out.println("Fetching category URL: " + langUrl);

					try {
						Connection.Response response1 = Jsoup.connect(langUrl).header("accept",
								"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
								.header("accept-language", "en-US,en;q=0.9,hi;q=0.8")
								.header("cache-control", "max-age=0").header("dnt", "1").header("priority", "u=0, i")
								.header("sec-ch-ua",
										"\"Chromium\";v=\"136\", \"Google Chrome\";v=\"136\", \"Not.A/Brand\";v=\"99\"")
								.header("sec-ch-ua-mobile", "?0").header("sec-ch-ua-platform", "\"Windows\"")
								.header("sec-fetch-dest", "document").header("sec-fetch-mode", "navigate")
								.header("sec-fetch-site", "none").header("sec-fetch-user", "?1")
								.header("upgrade-insecure-requests", "1")
								.header("user-agent",
										"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36")
								.timeout(60000).followRedirects(true).ignoreHttpErrors(true)
								.method(Connection.Method.GET).execute();

						Document endoc2 = response1.parse();
						Pair<LanguageContent, List<String>> langResult = extractLanguageContent(endoc2, lang);
						LanguageContent content = langResult.getKey();
						List<String> sizes = langResult.getValue();

						product.addTranslation(lang, content);

						Map<String, String> langSpec = new LinkedHashMap<>();
						langSpec.put("lang", lang);
						langSpec.put("domain_country_code", country);
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
						langSpec.put("size_available", String.join(", ", sizes));
						langSpec.put("sku_link", langUrl);

						product.specification.put(lang, langSpec);

					} catch (IOException e) {
						System.out.println("⚠️ Language page not found: " + langUrl);
					}
				}
			} catch (Exception e) {
				System.out.println("❌ Error: " + e.getMessage());
			}
			for (Map.Entry<String, LanguageContent> entry : product.content.entrySet()) {
				String lang = entry.getKey();
				LanguageContent content1 = entry.getValue();

				System.out.println("\n [" + lang + "]");
				System.out.println(" Name: " + content1.productName);
				System.out.println(" Long Desc: " + content1.description);

			}

			System.out.println("------------------------------------------------------");

			return product;

		} catch (IOException e) {
			System.out.println(" Error loading product: " + productUrl);
			return null;
		}
	}

	private static Pair<LanguageContent, List<String>> extractLanguageContent(Document doc, String lang) {
		String productName = doc.select("h1.product-name.overflow-hidden").text().trim();
		String shortDesc = doc.select("div.product-details-tabs__item>p").text().trim();

		Elements sizeElements = doc.select("div.size-selector__sizes button");
		Set<String> uniqueSizes = new LinkedHashSet<>();
		for (Element sizeElement : sizeElements) {
			uniqueSizes.add(sizeElement.text().trim());
		}
		List<String> sizeList = new ArrayList<>(uniqueSizes);

		LanguageContent content = new LanguageContent(productName, shortDesc);
		return new Pair<>(content, sizeList);
	}

	private static String formatPrice(String priceRaw) {
		return priceRaw.replaceAll("[^\\d.,]", "").trim();
	}
}
