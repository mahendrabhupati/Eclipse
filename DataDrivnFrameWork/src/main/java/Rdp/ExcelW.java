package Rdp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelW {

	static String Readpath = "resources/credentials.xlsx";
	static String Writepath = "resources/testData.xlsx";
	String sheetName = "sheet1";
	XSSFWorkbook ExcelWBook;
	XSSFSheet ExcelSheet;
	XSSFRow Row;
	XSSFCell Cell;

	public void setCellData(String Result, int RowNum, int colNum) throws IOException {
		FileInputStream file = new FileInputStream(Writepath);
		ExcelWBook = new XSSFWorkbook(file);
		ExcelSheet = ExcelWBook.getSheet(sheetName);
		Row = ExcelSheet.getRow(RowNum);
		Cell = Row.getCell(colNum);
		if (Cell == null) {
			Cell = Row.createCell(colNum);
			Cell.setCellValue(Result);
		} else {
			Cell.setCellValue(Result);
		}

		// opoen the file to write the results

		FileOutputStream fileOut = new FileOutputStream(Writepath);
		ExcelWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}
}
