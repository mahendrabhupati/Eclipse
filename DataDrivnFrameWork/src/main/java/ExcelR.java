import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelR {
	static String getEValue1, getEValue2;
	static String path = "";
	static String sheetName = "sheet1";
	static XSSFWorkbook ExcelWBook;
	static XSSFSheet ExcelSheet;

	public static void ExcelRead_username() throws IOException {

		FileInputStream file = new FileInputStream(path);
		ExcelWBook = new XSSFWorkbook(file);
		ExcelSheet = ExcelWBook.getSheet(sheetName);
		getEValue1 = ExcelSheet.getRow(1).getCell(0).getStringCellValue();

	}

	public static String ExcelRead_password() throws IOException {

		FileInputStream file = new FileInputStream(path);
		ExcelWBook = new XSSFWorkbook(file);
		ExcelSheet = ExcelWBook.getSheet(sheetName);
		getEValue2 = ExcelSheet.getRow(1).getCell(0).getStringCellValue();
		return getEValue2;
	}

}
