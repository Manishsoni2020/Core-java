package pdfFiles;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadPdf {

	public static void main(String[] args) throws IOException {
		File pdfFile=new File(System.getProperty("user.dir")+"\\data\\React.pdf");
		
		PDDocument pdDoucment=Loader.loadPDF(pdfFile);
		
		PDFTextStripper stp= new PDFTextStripper();
		
		String text=stp.getText(pdDoucment);
		
		pdDoucment.close();
		
		System.out.println(text);

	}

}
