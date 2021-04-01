import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class ReadExcel {
    public static void main(String[] args) throws IOException {
        ReadExcel rc = new ReadExcel();   //object of the class
        String vOutput = rc.ReadCellData(1, 1);
        System.out.println(vOutput);
    }

    //method defined for reading a cell
    public String ReadCellData(int vRow, int vColumn) {
        String value = null;          //variable for storing the cell value
        Workbook wb = null;           //initialize Workbook null
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/home/abrar/Downloads/dex2.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row = sheet.getRow(vRow); //returns the logical row
        Cell cell = row.getCell(vColumn); //getting the cell representing the given column
        value = cell.getStringCellValue();    //getting cell value
        return value;               //returns the cell value
    }
}