package Rdp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelR {
	static String Readpath = "resources/salesForce.xlsx";
	// static String Writepath = "resources/testData.xlsx";
	String sheetName = "sheet1";
	XSSFWorkbook ExcelWBook;
	XSSFSheet ExcelSheet;
	XSSFRow Row;
	XSSFCell Cell;

	public String ExcelRead_Email() throws IOException {

		FileInputStream file = new FileInputStream(Readpath);
		ExcelWBook = new XSSFWorkbook(file);
		ExcelSheet = ExcelWBook.getSheet(sheetName);
		String email = ExcelSheet.getRow(1).getCell(0).getStringCellValue();
		return email;
	}

	public String ExcelRead_country() throws IOException {

		FileInputStream file = new FileInputStream(Readpath);
		ExcelWBook = new XSSFWorkbook(file);
		ExcelSheet = ExcelWBook.getSheet(sheetName);
		String country = ExcelSheet.getRow(1).getCell(0).getStringCellValue();
		return country;
	}

}
