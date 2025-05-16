package xmlFiles;

import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class Parsing_xml {
public static void main(String[]args) throws ParserConfigurationException, SAXException, IOException
{
	DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=factory.newDocumentBuilder();
	Document document=builder.parse(System.getProperty("user.dir")+"\\data\\books.xml");
	
	//extract root node
	Element root=document.getDocumentElement();
	
	//extract child nodes
	NodeList childNodes=root.getChildNodes();
	
	for(int i=0;i<childNodes.getLength();i++)
	{
		Node node=childNodes.item(i);	
		if(node.getNodeType()==node.ELEMENT_NODE)
		{
			Element element=(Element) node;
			String tagName=element.getTagName();
			String taxtContent=element.getTextContent();
			System.out.println("Tag name: "+tagName);
			System.out.println("Taxt Content: "+taxtContent);
		}
	}
}
}
