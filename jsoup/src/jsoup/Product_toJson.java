package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Product_toJson {
public static void main(String[]args)
{
	try {
		
		Document doc=Jsoup.connect("https://www.pdpaola.com/collections/earrings").get();
		
		//Get SKU no
		String sku=doc.select(".product-description.f-12 span[description-sku.grey-uppercase]").text();
		System.out.println(sku);
		
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
