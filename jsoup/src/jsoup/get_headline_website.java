package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class get_headline_website {
public static void main(String[]args)
{
	try {
		Document doc=Jsoup.connect("https://www.aajtak.in").get();
		Elements headlines=doc.select("a");
		System.out.println(doc.title());
		System.out.println("=========");
		System.out.println(doc.id("login-area").text());
		for(Element heading:headlines)
		{
		
			System.out.println(heading.attr("a"));
		}
		
	} catch (Exception e) {
	
		System.out.println(e.getMessage());
	}
}
}
