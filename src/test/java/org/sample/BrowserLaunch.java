package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.helper.BaseClass;

public class BrowserLaunch extends BaseClass {
	public static void main(String[] args) throws IOException {

		// To cerate a file
		File f = new File("C:\\Users\\Greens Technology\\eclipse-workspace\\MavenClass12Pm\\ExcelData\\NewData.xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type = c.getCellType();
				if (type==1) {
					String data = c.getStringCellValue();
				}
				else if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
					String data = s.format(d);
				}
				else {
					double d = c.getNumericCellValue();
					long l=(long)d;
					String data = String.valueOf(l);
				}
			}
			
		}
	

		System.out.println("done");

	}

}
