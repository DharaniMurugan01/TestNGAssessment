package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DP {

  @DataProvider(name = "exceldata")
  public Object[][] get() throws IOException {
      File src = new File("C:\\Users\\ADMIN\\git\\repository19\\TestNgAssessment\\src\\test\\resources\\Book2.xlsx");
      return getData(src, "Sheet1");
  }
  public String[][] getData(File file, String sheet) throws IOException {
	    String[][] data = null;
	    try (FileInputStream fis = new FileInputStream(file);
	         XSSFWorkbook wrkBk = new XSSFWorkbook(fis)) {
	        XSSFSheet sht = wrkBk.getSheet(sheet);
	        int r = sht.getPhysicalNumberOfRows();
	        int c = sht.getRow(0).getLastCellNum();
	        data = new String[r - 1][c];

	        DataFormatter formatter = new DataFormatter();
	        for (int i = 1; i < r; i++) {  
	            XSSFRow row = sht.getRow(i);
	            if (row != null) {
	                for (int j = 0; j < c; j++) {
	                    Cell cell = row.getCell(j);
	                    data[i - 1][j] = (cell == null) ? "" : formatter.formatCellValue(cell);
	                }
	            }
	        }
	    }
	    return data;
	}


}
