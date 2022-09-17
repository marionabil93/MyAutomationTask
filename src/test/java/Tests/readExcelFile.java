package Tests;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelFile {

    XSSFWorkbook work_book;
    XSSFSheet sheet;

    public readExcelFile(String excelFilePath) {
        try {
            File fs = new File(excelFilePath);
            FileInputStream stream = new FileInputStream(fs);
            work_book = new XSSFWorkbook(stream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String getData(int sheetNumber, int row, int column) {
        sheet = work_book.getSheetAt(sheetNumber);
        String data = sheet.getRow(row).getCell(column).getStringCellValue();
        return data;
    }

    public String getNumericData(int sheetNumber, int row, int column) {
        sheet = work_book.getSheetAt(sheetNumber);
        DataFormatter formatter = new DataFormatter();
        String val = formatter.formatCellValue(sheet.getRow(row).getCell(column));
        return val;
    }

}
