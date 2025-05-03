package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTML_String {
public static void main(String[]args)
{
	try
	{
		String html="<p>Hello <b> World </b></p>";
		Document doc=Jsoup.parse(html);
		System.out.println(doc.text());
		System.out.println(doc.select("b").text());
	}
	catch(Exception e) 
	{
		System.out.println(e.getMessage());
	}
}
}
