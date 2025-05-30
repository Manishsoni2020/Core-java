package com.tousWatches.tousWatches;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tousWatches.tousWatches.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TousParsing {
	public static class Product {
		public String sku;
		public String price;
		public String date;
		public String domain = "michaelkors";
		public String domain_url = "https://www.michaelkors.global";
		public String collection_name = "Watchs";
		public String brand = "MICHAEL KORS";
		public String manufacturer = "MICHAEL";
		public List<String> images = new ArrayList<>();
		public String color;
		public String main_material;
		public Map<String, Map<String, String>> specification = new LinkedHashMap<>();
		public Map<String, String> specifications = new HashMap<>();
		public Map<String, LanguageContent> content = new HashMap<>();

		public Product(String sku,String price) {
			this.sku = sku;
			this.price=price;
		}

		public void addTranslation(String langCode, LanguageContent content2) {
			content.put(langCode, content2);
		}
	}

	public static class LanguageContent {
		public String productName;
		public String description;

		public LanguageContent(String productName, String description) {
			this.productName = productName;
			this.description = description;

		}
	}

	public static void main(String[] args) throws IOException {
		String baseurl = "https://www.tous.com/us-en/watches/c/18?page=";
		int page = 1;
		Set<String> productUrls = new HashSet<>();
		try {
			while (true) {

				String url = baseurl + page;

				Connection.Response resp = Jsoup.connect(url).header("accept",
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
						.header("Cookie",
								"userPrefLanguage=en_IN; cookieLanguage=en_IN; GlobalE_Data=%7B%22countryISO%22%3A%22IN%22%2C%22cultureCode%22%3A%22en-GB%22%2C%22currencyCode%22%3A%22INR%22%2C%22apiVersion%22%3A%222.1.4%22%7D; dwanonymous_9d3498ed8c576a769d46af560fad82cf=abFkFa21MiY76ZONS7z5AInEPF; UUID=ce99622f-e235-4748-b80b-44b6bdeca254; syte_uuid=2c2faf70-36f7-11f0-a355-395cb8d36000; syteVisualSearch=true; _taggstar_vid=345a4ba4-36f7-11f0-9105-61e9f204e7f0; _taggstar_exp=v:3|id:|group:; LPVID=VkMTFiNGRjNjI5OTkyM2Vh; _aeaid=e69b94ff-e1fc-4d5b-884c-f65644ab2cfa; aelastsite=Nt4ZN%2ByfIEtzytEp7wFkLyiiXohcepJIadVuXNw9vC%2FTtNqBT34BccbAZxYPaKG%2B; aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D; _dyid=4706261848573279311; _dy_geo=IN.AS.IN_RJ.IN_RJ_Jaipur; _dy_df_geo=India..Jaipur; OptanonAlertBoxClosed=2025-05-22T10:29:17.710Z; _pin_unauth=dWlkPU5UZ3dZelZrTVRFdE5UZzRaQzAwTkRsa0xXSm1aREF0WW1KaE9XVm1Zek5pTWpnMg; _fbp=fb.1.1747909759798.234267227409638694; _gcl_au=1.1.1292120045.1747909761; _dyid_server=4706261848573279311; sid=YtKdYgGOmL8vUNB3AahjzoW0Pgx0mjo1HSk; __cq_dnt=1; dw_dnt=1; dwsid=1dnFe5Bmhq7anuPYu-fDmTK_ZhXlciQk6OeWxY4UNiIz9C-wVFcM8BY4ZyBpOTnjGdlocWHKonTYaKADWoyBhw==; AKA_A2=A; _dyjsession=evmqajfi546fs297ycy8yo3801dh4bkg; dy_fs_page=www.michaelkors.global%2Fin%2Fen%2Fmen; AMCVS_3D6068F454E7858C0A4C98A6%40AdobeOrg=1; AMCV_3D6068F454E7858C0A4C98A6%40AdobeOrg=179643557%7CMCMID%7C58871669217793705733260550862207815446%7CMCAAMLH-1748836885%7C12%7CMCAAMB-1748836885%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1748239285s%7CNONE%7CvVersion%7C5.5.0%7CMCIDTS%7C20235; bm_mi=92AFBA5B9684308E5BD5AB67B1FBCAE4~YAAQJQVaaAJots2WAQAA0afAChstNnqp1khrpRUkAxbs1F6Y8wyjpBgXS6vtQo82NTS9uohIm/q8OtB2dJxdjUJnXOx5dCNpqEBetLE78yuorfTcsO9n7C38uuWxpdxunNEQOPw2vftOODVI4nrm0sXLaoZ3gvf00zwEzyct63V8sdWdrG/CxKoUCSJ4oEKEk1/e0dYZnyQJMG610QcD07cdM85y+fo5nwHc7doDaiEmlh4lcD5sRarlB6BULV5H0STetfkn/zRswFYHbXZ9cz11EpTRrZw+1LNs9u1Aeog/GX0y/ebCQdu4KoDkCbwCLnY0dqCXcEVsn2YwPT0Ywm6pZ5EHFov6OW92/tmtSInSoVINNlzKNij9FEL7KmfRiqVmVF1JgVkgREudpdxjh1NC/R4j~1; GlobalE_Full_Redirect=false; ak_bmsc=73CE4BA4FFFDF9A0FD1117168D7E647C~000000000000000000000000000000~YAAQJQVaaFpots2WAQAArazAChvwpBxA7la34W8XIts365ogWcyNglakm7yFnKM7v3sOly4LlgJdbT5Ov0l8qpHyJ4+MfQlexB7UQfecAhUcrQpHO6O/4W+w4YGVtrWcB40hr/tGr7flqB79U8i6Sxq55RhCIhFx5+HDUVANbYivL1FqEWATVFpqx6t7p9BfV/XotKWxOpTPP1D62lbXXBAI1MYsFVDBQStXeq8dOo60WiNO0kbNrdjNEkJc5wd6tHZtdKT89mz4w1JYj4frnj8lCsKBLt8XBCjlQF49eT7Ihke4UazPrcC1pERBwWFSdpvzznMKNvEjOa5AMOTkBdZxpc+hpVseTFE9pVBsxELzdwRNiNwen/7IuYOphY8qFUVn/VfFdVgOPn5FvRQXw/fz/BFnzvn5bO9Ueh22knRGnAMlKVd7y9vr12URYJv5gu+sgDSdoEkJs4YMtY0eM+WkpZAYQQ8BVcHdtbB9TfM77fRv6wTMYSq+mvwmFIYoVyyvAagCgGS547l+mCRBhJgWz6mksSMzNgVV9ScUXUWAwhLWIr9GZw==; isConsented=true; _taggstar_ses=1e0bd3a6-39e6-11f0-9254-257bb39b11eb; taggstar_analytics=true; s_vs=1; s_cc=true; ats-cid-AM-141090-sid=31398982; stimgs={%22sessionId%22:38214901%2C%22didReportCameraImpression%22:true%2C%22newUser%22:false}; taggstarPreventRefire=true; LPSID-53297895=x8ep3LUvSd25o0J0-h8KUA; _abck=2CCA4D9D44BBD1DB020F775030C50694~0~YAAQJQVaaEqCts2WAQAAOpjDCg08SuO+lLEVGGiMUw+MxpxEdHcSIAeGxuVm38ah0c8DZFqJjhm28X8CwqzI29R6TxLJTHUlwJxBIOlta9Z+imx8dZCepmr5nPLIveMzyGotcqydbwu0e9Et//5hoR24AxwNo8wKHsHIX6crAXbioHI+gYYClHhU1Ni0JRpb34GCeM0QjLWPm8wPKoxXwcnpcphxWs8RlUqpA86w+QwVTLh/BV1SZw5DKiZ08GkNbfRkSbKUfoZgKELhwNScU81uX6ETpC06/+OI7LqQWm0Lqp4U5g8yfdS4y4x/vhevK1OhO5015kOEFCP5Y77uLG+PngaFL4O1AAqd8BNT9nz8Qs1ja5yATyxMX12J2XbIc4PXE3Ru5h0zk0C0BZuiPahXOGcAgX6VtM1e9WLP0wn+1BYrSj/7T52AzELZ0sr7hCZxZ9RfsKNr21MEHNFViaO4nBgghf0JZuPO5AF7t+BlorppXBaR0100Uw41DAbl8AnWz9qSX+40bY2MwLcM40s1AIoK1JvPJX/HoFV1CC/rWVO2Wc3RbNkD8VY6nsXfywEJbumfAt5jbt1V+JoJzhUUgdc3LqhWfXVXLfuOOmpEanGH6x3RdITe+SuAZw==~-1~-1~1748235686; gpv_pn=Home%20%3E%20Men; gpv_purl=%2Fin%2Fen%2Fmen%2F; gpv_ptyp=SubCategory; s_sq=%5B%5BB%5D%5D; bm_sz=6DB1D55D9EBA9AB313BCFC59AB331F93~YAAQJQVaaJ/et82WAQAABrnkChtXu2hBzN+zN7j87AaLOpmITUJMLbGhY1eKJAwXm6Yfo6s3+CpBNA9ug7s9wclh71TbeJJI9l1+uhR7wk4nxHxhwVobvxoiKCuLyOvrybECau/sQaR5HnpAYpmBLLywd0HQyuJs5FMmXFDtOgR7J8TgqxMJBzEc+wMhgl6mP7nQSELg8EjzuyutWntngmbE/Nbn62i0m1g2n8fhzg9v8hFUa4mhH8dN1C9e/Kih9JiimiHRYVXiCnE0MNtuwGpbXTTK4eAsbjSharC+D9JchQ2vMvW4Ztgv+Zm8zZjqk/LjdwmusKAOfNMklG30jfkvxEAGIkicGyL7G7yc+ck21QylDLuPDoWMv1kKfKqe6RzviOlDT2M/T0vZZ+mdga8k93Sh5T9oE0EBzhKn8qBVkFtUuIQluXrwS/+wcuKSj6D76TShCVrhVHmI+7Y9kMDVQTy2/pg=~4600129~3355954; _dy_soct=1748234450!2245278.-324633'2290725.0'2293359.0'2293371.0'2293374.0'2293382.0'2293403.0'2593547.0'2593550.0'2962642.0'2971385.0!; _dy_toffset=-1; GlobalE_CT_Data=%7B%22CUID%22%3A%7B%22id%22%3A%22573337966.755204296.1052%22%2C%22expirationDate%22%3A%22Mon%2C%2026%20May%202025%2005%3A10%3A53%20GMT%22%7D%2C%22CHKCUID%22%3Anull%2C%22GA4SID%22%3A578205542%2C%22GA4TS%22%3A1748234453671%2C%22Domain%22%3A%22www.michaelkors.global%22%7D; OptanonConsent=isGpcEnabled=0&datestamp=Mon+May+26+2025+10%3A10%3A54+GMT%2B0530+(India+Standard+Time)&version=202403.2.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=bbd38d26-2f59-4a2a-a67d-b189672307ef&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0004%3A1%2CC0003%3A1%2CC0001%3A1%2CC0002%3A1&intType=1&geolocation=IN%3BRJ&AwaitingReconsent=false; _cs_mk_aa=0.31632334718797506_1748234457618; _derived_epik=dj0yJnU9ODBfRGF2dGJWTzhJMVpodXdhbUpocUFQbUstYTJ4SVgmbj1pOUp5OUFnQkRYT1VtZFN2ak9NdjRnJm09MSZ0PUFBQUFBR2d6OE5vJnJtPTEmcnQ9QUFBQUFHZ3o4Tm8mc3A9Mg; _uetsid=21b99fc039e611f081e08fe362269b5b; _uetvid=9f0fb66036f711f09207e1990cd2edf7; RT=\"z=1&dm=michaelkors.global&si=7effd6e7-944d-433a-9140-4e19012e60df&ss=mb4kuqgb&sl=3&tt=1xbt&bcn=%2F%2F684d0d4b.akstat.io%2F&ld=tgqd\"; bm_sv=3E0ED7A11FE651CF8F2641A1EE11711C~YAAQJQVaaKXlt82WAQAAWDflChsYv4TIA4tsh5n281cjV4kBZch7+8LmNdpJPZ4knZvzKod/+CBgO+d4M7k2RFDhGfaVZrfZUweDJ8oALfb/GwMRJhiBtQEr3GIE3+SxeBj+2WAi/P6eiDkFXXK0HJfVAgFT9Yj/Iy67tv/vBCx0oAQ1XpLUcA33dBxMODJto1r2IQUt3p2xVnk79qVhfF04cqXpIPos2lXhOZ/OZ6dgeFLFfwdnkb5WN0cnPvHVqXgmYfXIWJeT~1; tp=4828; s_ppv=Home%2520%253E%2520Men%2C19%2C19%2C921; BLUE_GREEN=0; DEVICE_TYPE=desktop")
						.timeout(30000).followRedirects(true).ignoreHttpErrors(true).method(Connection.Method.GET)
						.execute();

				Document doc = resp.parse();
//			System.out.println(doc.title());

				Elements productLinks = doc.select("div.product-link-container>a");
				for (Element link : productLinks) {
					String productUrl = link.absUrl("href");
					productUrls.add(productUrl);
				}
				page++;

//				for (String p : productUrls) {
//					System.out.println(p);
//				}

				List<Product> allProducts = new ArrayList<>();
				for (String productUrl : productUrls) {
					System.out.println("Scarping: " + productUrl);
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
			System.out.println(e.getMessage());
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
					.header("Cookie",
							"userPrefLanguage=en_IN; cookieLanguage=en_IN; GlobalE_Data=%7B%22countryISO%22%3A%22IN%22%2C%22cultureCode%22%3A%22en-GB%22%2C%22currencyCode%22%3A%22INR%22%2C%22apiVersion%22%3A%222.1.4%22%7D; dwanonymous_9d3498ed8c576a769d46af560fad82cf=abFkFa21MiY76ZONS7z5AInEPF; UUID=ce99622f-e235-4748-b80b-44b6bdeca254; syte_uuid=2c2faf70-36f7-11f0-a355-395cb8d36000; syteVisualSearch=true; _taggstar_vid=345a4ba4-36f7-11f0-9105-61e9f204e7f0; _taggstar_exp=v:3|id:|group:; LPVID=VkMTFiNGRjNjI5OTkyM2Vh; _aeaid=e69b94ff-e1fc-4d5b-884c-f65644ab2cfa; aelastsite=Nt4ZN%2ByfIEtzytEp7wFkLyiiXohcepJIadVuXNw9vC%2FTtNqBT34BccbAZxYPaKG%2B; aelreadersettings=%7B%22c_big%22%3A0%2C%22rg%22%3A0%2C%22memph%22%3A0%2C%22contrast_setting%22%3A0%2C%22colorshift_setting%22%3A0%2C%22text_size_setting%22%3A0%2C%22space_setting%22%3A0%2C%22font_setting%22%3A0%2C%22k%22%3A0%2C%22k_disable_default%22%3A0%2C%22hlt%22%3A0%2C%22disable_animations%22%3A0%2C%22display_alt_desc%22%3A0%7D; _dyid=4706261848573279311; _dy_geo=IN.AS.IN_RJ.IN_RJ_Jaipur; _dy_df_geo=India..Jaipur; OptanonAlertBoxClosed=2025-05-22T10:29:17.710Z; _pin_unauth=dWlkPU5UZ3dZelZrTVRFdE5UZzRaQzAwTkRsa0xXSm1aREF0WW1KaE9XVm1Zek5pTWpnMg; _fbp=fb.1.1747909759798.234267227409638694; _gcl_au=1.1.1292120045.1747909761; _dyid_server=4706261848573279311; sid=YtKdYgGOmL8vUNB3AahjzoW0Pgx0mjo1HSk; __cq_dnt=1; dw_dnt=1; dwsid=1dnFe5Bmhq7anuPYu-fDmTK_ZhXlciQk6OeWxY4UNiIz9C-wVFcM8BY4ZyBpOTnjGdlocWHKonTYaKADWoyBhw==; AKA_A2=A; _dyjsession=evmqajfi546fs297ycy8yo3801dh4bkg; dy_fs_page=www.michaelkors.global%2Fin%2Fen%2Fmen; AMCVS_3D6068F454E7858C0A4C98A6%40AdobeOrg=1; AMCV_3D6068F454E7858C0A4C98A6%40AdobeOrg=179643557%7CMCMID%7C58871669217793705733260550862207815446%7CMCAAMLH-1748836885%7C12%7CMCAAMB-1748836885%7CRKhpRz8krg2tLO6pguXWp5olkAcUniQYPHaMWWgdJ3xzPWQmdj0y%7CMCOPTOUT-1748239285s%7CNONE%7CvVersion%7C5.5.0%7CMCIDTS%7C20235; bm_mi=92AFBA5B9684308E5BD5AB67B1FBCAE4~YAAQJQVaaAJots2WAQAA0afAChstNnqp1khrpRUkAxbs1F6Y8wyjpBgXS6vtQo82NTS9uohIm/q8OtB2dJxdjUJnXOx5dCNpqEBetLE78yuorfTcsO9n7C38uuWxpdxunNEQOPw2vftOODVI4nrm0sXLaoZ3gvf00zwEzyct63V8sdWdrG/CxKoUCSJ4oEKEk1/e0dYZnyQJMG610QcD07cdM85y+fo5nwHc7doDaiEmlh4lcD5sRarlB6BULV5H0STetfkn/zRswFYHbXZ9cz11EpTRrZw+1LNs9u1Aeog/GX0y/ebCQdu4KoDkCbwCLnY0dqCXcEVsn2YwPT0Ywm6pZ5EHFov6OW92/tmtSInSoVINNlzKNij9FEL7KmfRiqVmVF1JgVkgREudpdxjh1NC/R4j~1; GlobalE_Full_Redirect=false; ak_bmsc=73CE4BA4FFFDF9A0FD1117168D7E647C~000000000000000000000000000000~YAAQJQVaaFpots2WAQAArazAChvwpBxA7la34W8XIts365ogWcyNglakm7yFnKM7v3sOly4LlgJdbT5Ov0l8qpHyJ4+MfQlexB7UQfecAhUcrQpHO6O/4W+w4YGVtrWcB40hr/tGr7flqB79U8i6Sxq55RhCIhFx5+HDUVANbYivL1FqEWATVFpqx6t7p9BfV/XotKWxOpTPP1D62lbXXBAI1MYsFVDBQStXeq8dOo60WiNO0kbNrdjNEkJc5wd6tHZtdKT89mz4w1JYj4frnj8lCsKBLt8XBCjlQF49eT7Ihke4UazPrcC1pERBwWFSdpvzznMKNvEjOa5AMOTkBdZxpc+hpVseTFE9pVBsxELzdwRNiNwen/7IuYOphY8qFUVn/VfFdVgOPn5FvRQXw/fz/BFnzvn5bO9Ueh22knRGnAMlKVd7y9vr12URYJv5gu+sgDSdoEkJs4YMtY0eM+WkpZAYQQ8BVcHdtbB9TfM77fRv6wTMYSq+mvwmFIYoVyyvAagCgGS547l+mCRBhJgWz6mksSMzNgVV9ScUXUWAwhLWIr9GZw==; isConsented=true; _taggstar_ses=1e0bd3a6-39e6-11f0-9254-257bb39b11eb; taggstar_analytics=true; s_vs=1; s_cc=true; ats-cid-AM-141090-sid=31398982; stimgs={%22sessionId%22:38214901%2C%22didReportCameraImpression%22:true%2C%22newUser%22:false}; taggstarPreventRefire=true; LPSID-53297895=x8ep3LUvSd25o0J0-h8KUA; _abck=2CCA4D9D44BBD1DB020F775030C50694~0~YAAQJQVaaEqCts2WAQAAOpjDCg08SuO+lLEVGGiMUw+MxpxEdHcSIAeGxuVm38ah0c8DZFqJjhm28X8CwqzI29R6TxLJTHUlwJxBIOlta9Z+imx8dZCepmr5nPLIveMzyGotcqydbwu0e9Et//5hoR24AxwNo8wKHsHIX6crAXbioHI+gYYClHhU1Ni0JRpb34GCeM0QjLWPm8wPKoxXwcnpcphxWs8RlUqpA86w+QwVTLh/BV1SZw5DKiZ08GkNbfRkSbKUfoZgKELhwNScU81uX6ETpC06/+OI7LqQWm0Lqp4U5g8yfdS4y4x/vhevK1OhO5015kOEFCP5Y77uLG+PngaFL4O1AAqd8BNT9nz8Qs1ja5yATyxMX12J2XbIc4PXE3Ru5h0zk0C0BZuiPahXOGcAgX6VtM1e9WLP0wn+1BYrSj/7T52AzELZ0sr7hCZxZ9RfsKNr21MEHNFViaO4nBgghf0JZuPO5AF7t+BlorppXBaR0100Uw41DAbl8AnWz9qSX+40bY2MwLcM40s1AIoK1JvPJX/HoFV1CC/rWVO2Wc3RbNkD8VY6nsXfywEJbumfAt5jbt1V+JoJzhUUgdc3LqhWfXVXLfuOOmpEanGH6x3RdITe+SuAZw==~-1~-1~1748235686; gpv_pn=Home%20%3E%20Men; gpv_purl=%2Fin%2Fen%2Fmen%2F; gpv_ptyp=SubCategory; s_sq=%5B%5BB%5D%5D; bm_sz=6DB1D55D9EBA9AB313BCFC59AB331F93~YAAQJQVaaJ/et82WAQAABrnkChtXu2hBzN+zN7j87AaLOpmITUJMLbGhY1eKJAwXm6Yfo6s3+CpBNA9ug7s9wclh71TbeJJI9l1+uhR7wk4nxHxhwVobvxoiKCuLyOvrybECau/sQaR5HnpAYpmBLLywd0HQyuJs5FMmXFDtOgR7J8TgqxMJBzEc+wMhgl6mP7nQSELg8EjzuyutWntngmbE/Nbn62i0m1g2n8fhzg9v8hFUa4mhH8dN1C9e/Kih9JiimiHRYVXiCnE0MNtuwGpbXTTK4eAsbjSharC+D9JchQ2vMvW4Ztgv+Zm8zZjqk/LjdwmusKAOfNMklG30jfkvxEAGIkicGyL7G7yc+ck21QylDLuPDoWMv1kKfKqe6RzviOlDT2M/T0vZZ+mdga8k93Sh5T9oE0EBzhKn8qBVkFtUuIQluXrwS/+wcuKSj6D76TShCVrhVHmI+7Y9kMDVQTy2/pg=~4600129~3355954; _dy_soct=1748234450!2245278.-324633'2290725.0'2293359.0'2293371.0'2293374.0'2293382.0'2293403.0'2593547.0'2593550.0'2962642.0'2971385.0!; _dy_toffset=-1; GlobalE_CT_Data=%7B%22CUID%22%3A%7B%22id%22%3A%22573337966.755204296.1052%22%2C%22expirationDate%22%3A%22Mon%2C%2026%20May%202025%2005%3A10%3A53%20GMT%22%7D%2C%22CHKCUID%22%3Anull%2C%22GA4SID%22%3A578205542%2C%22GA4TS%22%3A1748234453671%2C%22Domain%22%3A%22www.michaelkors.global%22%7D; OptanonConsent=isGpcEnabled=0&datestamp=Mon+May+26+2025+10%3A10%3A54+GMT%2B0530+(India+Standard+Time)&version=202403.2.0&browserGpcFlag=0&isIABGlobal=false&hosts=&consentId=bbd38d26-2f59-4a2a-a67d-b189672307ef&interactionCount=1&isAnonUser=1&landingPath=NotLandingPage&groups=C0004%3A1%2CC0003%3A1%2CC0001%3A1%2CC0002%3A1&intType=1&geolocation=IN%3BRJ&AwaitingReconsent=false; _cs_mk_aa=0.31632334718797506_1748234457618; _derived_epik=dj0yJnU9ODBfRGF2dGJWTzhJMVpodXdhbUpocUFQbUstYTJ4SVgmbj1pOUp5OUFnQkRYT1VtZFN2ak9NdjRnJm09MSZ0PUFBQUFBR2d6OE5vJnJtPTEmcnQ9QUFBQUFHZ3o4Tm8mc3A9Mg; _uetsid=21b99fc039e611f081e08fe362269b5b; _uetvid=9f0fb66036f711f09207e1990cd2edf7; RT=\"z=1&dm=michaelkors.global&si=7effd6e7-944d-433a-9140-4e19012e60df&ss=mb4kuqgb&sl=3&tt=1xbt&bcn=%2F%2F684d0d4b.akstat.io%2F&ld=tgqd\"; bm_sv=3E0ED7A11FE651CF8F2641A1EE11711C~YAAQJQVaaKXlt82WAQAAWDflChsYv4TIA4tsh5n281cjV4kBZch7+8LmNdpJPZ4knZvzKod/+CBgO+d4M7k2RFDhGfaVZrfZUweDJ8oALfb/GwMRJhiBtQEr3GIE3+SxeBj+2WAi/P6eiDkFXXK0HJfVAgFT9Yj/Iy67tv/vBCx0oAQ1XpLUcA33dBxMODJto1r2IQUt3p2xVnk79qVhfF04cqXpIPos2lXhOZ/OZ6dgeFLFfwdnkb5WN0cnPvHVqXgmYfXIWJeT~1; tp=4828; s_ppv=Home%2520%253E%2520Men%2C19%2C19%2C921; BLUE_GREEN=0; DEVICE_TYPE=desktop")
					.timeout(30000).followRedirects(true).ignoreHttpErrors(true).method(Connection.Method.GET)
					.execute();

			Document Doc1 = response.parse();

			String sku = Doc1.select("div.details-reference").text();
			
			String price = Doc1.select("div.primary-prices>span.price").first().text().trim();
//
//			String color = enDoc.select("div.color.color-label.cursor-default>span.display-color-name").text();
//
			Product product = new Product(sku,price);

			System.out.println(" Sku: " + product.sku);
			System.out.println(" Price: " + product.price);
//			System.out.println(" color: " + product.color);
//			System.out.println(" Date: " + product.date);
//			System.out.println(" Domain: " + product.domain);
//			System.out.println(" Domain URL: " + product.domain_url);
//			System.out.println(" Collection: " + product.collection_name);
//			System.out.println("️ Brand: " + product.brand);
//			System.out.println(" Manufacturer: " + product.manufacturer);
//
//			if (!product.color.isEmpty()) {
//				System.out.println("Color: " + product.color);
//			}

//			Elements images = enDoc.select("img");
//			Set<String> imageUrls = new LinkedHashSet<>();
//			for (Element img : images) {
//				String imgurl = img.absUrl("src");
//				if (!imgurl.contains("/default/")) {
//					imageUrls.add(imgurl);
//				}
//			}
//
//			product.images.addAll(imageUrls);
//			System.out.println(" Image_Urls:");
//			for (String img : product.images) {
//				System.out.println(" - " + img);
//			}
//
//			String baseSlug = "/product/medium-logo-stripe-crossbody/_/R-MK_35F3G7ZC5B";
//																						
//			String[] languages = { "fr", "de", "it" };
//			String[] countries = { "fr", "de", "it" };
//
//			Map<String, String> baseDomainMap = new HashMap<>();
//			baseDomainMap.put("fr_fr", "https://www.michaelkors.fr/homme/");
//			baseDomainMap.put("de_de", "https://www.michaelkors.de/herren/");
//			baseDomainMap.put("it_it", "https://www.michaelkors.it/uomo/");
//
//			// English version (global base URL, optional)
//			String productUrlEn = "https://www.michaelkors.global/mt/en" + baseSlug;
//
//			try {
//				Pair<LanguageContent, List<String>> result = extractLanguageContent(enDoc, "en");
//				product.addTranslation("en", result.getKey());
//
//				for (int i = 0; i < languages.length; i++) {
//					String lang = languages[i];
//					String country = countries[i];
//					String key = country + "_" + lang;
//
//					String base = baseDomainMap.get(key);
//					if (base == null) {
//						System.out.println("❌ Men category URL mapping missing for: " + key);
//						continue;
//					}
//
//					// Use only category URL, no product slug appended
//					String langUrl = base;
//					System.out.println("Fetching category URL: " + langUrl);
//
//					try {
//						Connection.Response response1 = Jsoup.connect(langUrl).header("accept",
//								"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
//								.header("accept-language", "en-US,en;q=0.9,hi;q=0.8")
//								.header("cache-control", "max-age=0").header("dnt", "1").header("priority", "u=0, i")
//								.header("sec-ch-ua",
//										"\"Chromium\";v=\"136\", \"Google Chrome\";v=\"136\", \"Not.A/Brand\";v=\"99\"")
//								.header("sec-ch-ua-mobile", "?0").header("sec-ch-ua-platform", "\"Windows\"")
//								.header("sec-fetch-dest", "document").header("sec-fetch-mode", "navigate")
//								.header("sec-fetch-site", "none").header("sec-fetch-user", "?1")
//								.header("upgrade-insecure-requests", "1")
//								.header("user-agent",
//										"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/136.0.0.0 Safari/537.36")
//								.timeout(60000).followRedirects(true).ignoreHttpErrors(true)
//								.method(Connection.Method.GET).execute();
//
//						Document endoc2 = response1.parse();
//						Pair<LanguageContent, List<String>> langResult = extractLanguageContent(endoc2, lang);
//						LanguageContent content = langResult.getKey();
//						List<String> sizes = langResult.getValue();
//
//						product.addTranslation(lang, content);
//
//						Map<String, String> langSpec = new LinkedHashMap<>();
//						langSpec.put("lang", lang);
//						langSpec.put("domain_country_code", country);
//						langSpec.put("currency", "EUR");
//						langSpec.put("base_price", product.price);
//						langSpec.put("sales_price", product.price);
//						langSpec.put("active_price", product.price);
//						langSpec.put("stock_quantity", "");
//						langSpec.put("availability", "Yes");
//						langSpec.put("availability_message", "AVAILABLE");
//						langSpec.put("shipping_lead_time", "");
//						langSpec.put("shipping_expenses", "");
//						langSpec.put("marketplace_retailer_name", "");
//						langSpec.put("condition", "NEW");
//						langSpec.put("reviews_rating_value", "");
//						langSpec.put("reviews_number", "");
//						langSpec.put("size_available", String.join(", ", sizes));
//						langSpec.put("sku_link", langUrl);
//
//						product.specification.put(lang, langSpec);
//
//					} catch (IOException e) {
//						System.out.println("⚠️ Language page not found: " + langUrl);
//					}
//				}
//			} catch (Exception e) {
//				System.out.println("❌ Error: " + e.getMessage());
//			}
//			for (Map.Entry<String, LanguageContent> entry : product.content.entrySet()) {
//				String lang = entry.getKey();
//				LanguageContent content1 = entry.getValue();
//
//				System.out.println("\n [" + lang + "]");
//				System.out.println(" Name: " + content1.productName);
//				System.out.println(" Long Desc: " + content1.description);
//
//			}

			System.out.println("------------------------------------------------------");

			return product;

		} catch (IOException e) {
			System.out.println(" Error loading product: " + productUrl);
			return null;
		}
	}

	private static String formatPrice(String priceRaw) {
		return priceRaw.replaceAll("[^\\d.,]", "").trim();
	}
}
