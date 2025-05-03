package jsoup;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Basic_Jsoup_creation {
public static void main(String[]args)
{
	try {
		//get html from website
		Document doc=Jsoup.connect("http://google.com").get();
		
		//website title printing
		System.out.println(doc.title());
		
		//get all <a> tag 
		Elements links=doc.select("a");
		
		
		for(Element link: links)
		{
			//get text and attributes
			System.out.println("Text : "+link.text().toUpperCase());
			System.out.println("URL: "+link.attr("href"));
		}
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
