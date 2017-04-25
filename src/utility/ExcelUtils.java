package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	
	
				public static void setExcelFile(String Path, String SheetName) throws Exception{
					FileInputStream fis = new FileInputStream(Path);
					ExcelWBook = new XSSFWorkbook(fis);
					ExcelWSheet = ExcelWBook.getSheet(SheetName);					
				}
				
				
				public static String getCellData(int RowNum, int ColNum){
					Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
					return Cell.getStringCellValue();
					
				}

}
