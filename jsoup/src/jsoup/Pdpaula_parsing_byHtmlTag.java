package jsoup;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Pdpaula_parsing_byHtmlTag {
	public static List<Product> pl=new ArrayList<>();
public static void main(String[]args)
{
	try {
		Document doc=Jsoup.connect("https://www.pdpaola.com/collections/rings").get();
		
		Elements links=doc.select("div#products > article > div > a.product-link");
		
		ArrayList<String>ls=new ArrayList<>();
		for(Element link:links)
		{
			String productUrl=link.absUrl("href");	
			if(productUrl.contains("/products/"))
			{
				ls.add(productUrl);
			}
			
		}
		
		for(String p:ls)
		{
			productDetails(p);
		}
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\Users\\hp\\Desktop\\products.json"),pl);
		System.out.println("file created successfully");
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
public static void productDetails(String a)
{
	try {
		Document doc1=Jsoup.connect(a).get();
		
		//getproductname
		Elements h1Tags=doc1.getElementsByTag("h1");
		String productName="";
		
		for(Element h1:h1Tags)
		{
			if(h1.className().contains("product-title"))
			{
				productName=h1.text();	
			}
		}
		
		//getProductprice
		String productPrice=doc1.select("div#title-price>div.product-price >span").text();
		
		//getproductdiscription
		String productDecs=doc1.select("div.product-info-container>div.product-info-content>a>div.product-item-subtitle>span").text();
		
		Product product=new Product(productName, productPrice, productDecs);
		pl.add(product);
		
//		System.out.println("Product name is : "+productName );
//		System.out.println("Product Price is : "+productPrice);
//		System.out.println("Product Description : "+productDecs);
//		System.out.println("=================================");
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
