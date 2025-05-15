package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Weather_Jaipur {
public static void main(String[]args)
{
	try {
		Document d=Jsoup.connect("https://www.timeanddate.com/weather/india/jaipur").get();
		
		Element tempElement=d.selectFirst(".h2");
		
		Element focusElement=d.selectFirst(".bk-focus_qlook");
		
		Element ptag=focusElement.selectFirst("p");
		
		System.out.println(tempElement.text());
		System.out.println(ptag.text());
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
}
}
