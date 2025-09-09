package utilities;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler {

    public static String getExcelData(String sheetname,int row, int column){
        FileInputStream fis;
        try {
             fis = new FileInputStream(new File("src/main/resources/data/TestData.xlsx"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        XSSFWorkbook workbook;
        try {
             workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        XSSFSheet sheet = workbook.getSheet(sheetname);
      return  sheet.getRow(row).getCell(column).getStringCellValue();
    }
}
