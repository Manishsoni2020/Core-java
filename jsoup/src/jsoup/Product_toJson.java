package jsoup;


import com.fasterxml.jackson.*;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Product_toJson {
public static void main(String[]args)
{
	try {
		
		Document doc=Jsoup.connect("https://www.pdpaola.com/products/la-perla-mini-hoops").get();
		
		//Get SKU no
		String sku=doc.select("div.product-description.f-12 span.description-sku.grey-uppercase").first().text();
		
		//Get Price
		String price=doc.select("div.product-price span[data-product-price]").first().text();
		
		//image
		Elements images=doc.select("div.img-wrapper img");
		
		Set<String> imageurls=new LinkedHashSet<>();
		for(Element img:images)
		{
			String imgurl=img.absUrl("src");
			if(!imgurl.isEmpty())
			{
				imageurls.add(imgurl);
			}
		}
		List<String> imageList=new ArrayList<>(imageurls);
		
		//Metarial
		String metarial=doc.select("div.product-description.f-12>ul>li>a>u").first().text();
		
		//Hardcoded values
		LocalDate date=LocalDate.now();
		String domin="pdpaula.com";
		String dominurl="https://www.pdpaola.com";
		String collection="earrings";
		String brand="PDPAULA";
		String manufacturer="PDPAULA";
		List<String> colors=Arrays.asList("Silver","Gold");
		
		
				
				
				
				
		ProductAllinformation product=new ProductAllinformation(sku, price, dominurl, domin, domin, collection, brand, manufacturer, imageList, colors, metarial);
		ObjectMapper mapper =new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		String jsonOutput=mapper.writeValueAsString(product);
		
		System.out.println(jsonOutput);
		
		
		mapper.writeValue(new File("C:\\Users\\hp\\Desktop\\productallinformation.json"), product);
		
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
