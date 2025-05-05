package jsoup;

import java.util.*;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Pdpaula_website_parsing {
public static void main(String []args)
{
	
	try {
//		Document doc=Jsoup.connect("https://www.pdpaola.com").get();
//		System.out.println(doc.title());
//		System.out.println(doc.selectFirst("h2").text());
		
		Document doc1=Jsoup.connect("https://www.pdpaola.com/collections/rings").get();
		
		Elements productlinks=doc1.select("a.product-link");
		
		ArrayList<String> urls=new ArrayList<String>();
		for(Element link:productlinks)
		{
			String producturl=link.absUrl("href");
			urls.add(producturl);
		}
		
		for(String p:urls)
		{
//			System.out.println(p);
			productAllDetails(p);
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
	
	
}
public static void productAllDetails(String url)
{
	try {
		Document doc2=Jsoup.connect(url).get();
		
		String productName=doc2.select("h1.product-title").text();
		
		String productPrice=doc2.select("div.product-price span[data-product-price]").text();
		
		String productDescription=doc2.select("div.product_seo_description.f-12>h2").text();
		
		Elements productSize=doc2.select("button.variant-option");
		Set<String> uniqueSize=new LinkedHashSet<String>();
		for(Element sizeElement: productSize)
		{
			uniqueSize.add(sizeElement.text());
		}
		String allSize=String.join(" ", uniqueSize);

		
		String productmaterail=doc2.select("div.product-description.f-12 ").text();
		
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+productPrice);
		System.out.println("Product description : "+productDescription);
		System.out.println("Product Size : "+allSize);
		System.out.println("Product Material : "+productmaterail);
		System.out.println("===========================");
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
