import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args){
		// Location of Excel File
		String path= "G:\\Seleniumread.xlsx";
		String SheetName= "Sheet1";
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		
		try {
			FileInputStream file= new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(file);
			ExcelWSheet= ExcelWBook.getSheet(SheetName);
			Cell = ExcelWSheet.getRow(1).getCell(0);
			String CellData= Cell.getStringCellValue();
			//String getValue= ExcelWSheet.getRow(0).getCell(1).getStringCellValue();
			System.out.println(CellData);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
