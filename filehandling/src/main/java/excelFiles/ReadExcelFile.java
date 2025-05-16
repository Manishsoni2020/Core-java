package excelFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFile {
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir") + "\\data\\Book1.xlsx";
		FileInputStream file = new FileInputStream(filePath);

		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheetAt(0);
		
		// Using For each loop
//		for (Row row : sheet) {
//            for (Cell cell : row) {
//                switch (cell.getCellType()) {
//                    case STRING -> System.out.print(cell.getStringCellValue());
//                    case NUMERIC -> System.out.print(cell.getNumericCellValue());
//                }
//                System.out.print(" | ");
//            }
//            System.out.println();
//        }


		// Using for loop

//		int rows = sheet.getLastRowNum();
//
//		int column = sheet.getRow(1).getLastCellNum();
//
//		for (int r = 0; r <= rows; r++) {
//			
//			XSSFRow row = sheet.getRow(r);
//			
//			for (int c = 0; c < column; c++) {
//				
//				XSSFCell cell = row.getCell(c);
//				
//				switch (cell.getCellType()) {
//				case STRING: {
//					System.out.print(cell.getStringCellValue());
//					break;
//				}
//				case NUMERIC: {
//					System.out.print(cell.getNumericCellValue());
//					break;
//				}
//				default:
//					throw new IllegalArgumentException("Unexpected value: " + cell.getCellType());
//					
//				}
//				System.out.print(" | ");
//			}
//			System.out.println();
//		}

	}
}
