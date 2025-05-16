package excelFiles;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelFile {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Students");

		XSSFRow header = sheet.createRow(0);
		header.createCell(0).setCellValue("ID");
		header.createCell(1).setCellValue("Name");

		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue(1);
		row1.createCell(1).setCellValue("Manish");

		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue(2);
		row2.createCell(1).setCellValue("maya");

		try {
			String filepath = System.getProperty("user.dir") + "\\data\\student.xlsx";
			FileOutputStream outputStream = new FileOutputStream(filepath);

			workbook.write(outputStream);

			System.out.println("file created successfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
