package docFIles;

import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class Create_Word_file {
	public static void main(String[] args) {
		// Create a new Document
		XWPFDocument document = new XWPFDocument();

		// Create A paragraph
		XWPFParagraph paragraph = document.createParagraph();

		XWPFRun run = paragraph.createRun();

		run.setText("Welcome to Doc File...");
		run.setBold(true);
		run.setFontSize(14);
		run.addBreak();
		run.setText("Hello I am file which is created by filehandling ");

		try {
			FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + "\\data\\demo.docx");
			document.write(out);
			out.close();
			document.close();
			System.out.println("File created successfully");
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
