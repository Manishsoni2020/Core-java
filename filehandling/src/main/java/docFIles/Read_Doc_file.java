package docFIles;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class Read_Doc_file {
public static void main(String[]args)
{
	try {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir") + "\\data\\demo.docx");
		XWPFDocument document=new XWPFDocument(file);
		List <XWPFParagraph> paragraph=document.getParagraphs();
		
		for(XWPFParagraph para:paragraph)
		{
			System.out.println(para.getText());
		}
		document.close();
		file.close();
			
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
