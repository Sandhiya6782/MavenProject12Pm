package org.helper;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Select s;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void fillTxtBox(WebElement ele, String val) {
		ele.sendKeys(val);
	}

	public static void btnClk(WebElement e) {
		e.click();
	}

	public static String toGetTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String toGetUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void toClose() {
		driver.quit();
	}

	public static void toMove(WebElement e) {
		a = new Actions(driver);
		a.moveToElement(e).perform();
	}

	public static void doubleClk(WebElement e) {
		a = new Actions(driver);
		a.doubleClick(e).perform();
	}

	public static void rightClick(WebElement ele) {
		a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	public static String toGetValue(WebElement e) {
		String name = e.getAttribute("value");
		return name;

	}

	public static void toGetTxt(WebElement txt) {
		String t = txt.getText();
		System.out.println(t);
	}

	public static void toSelect(WebElement ref, String val) {
		s = new Select(ref);
		s.selectByValue(val);

	}

	public static void toTakeSnap(String picName) throws IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File s = t.getScreenshotAs(OutputType.FILE);
		File d = new File(
				"C:\\Users\\Greens Technology\\eclipse-workspace\\MavenClass12Pm\\Screenshot\\" + picName + ".png");
		FileUtils.copyFile(s, d);

	}

	public static void toApplyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void toCopy() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static String readFromExcel(int row, int col) throws IOException {
		File f = new File("C:\\Users\\Greens Technology\\eclipse-workspace\\MavenClass12Pm\\ExcelData\\NewData.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("Sheet1");
		Row r = sh.getRow(row);
		Cell c = r.getCell(col);
		int type = c.getCellType();
		String data = " ";
		if (type == 1) {
			data = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			data = s.format(d);

		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			data = String.valueOf(l);
		}
		return data;

	}
	public static void maxWindow() {
		driver.manage().window().maximize();

	}
	public static void toGetDate() {
		Date d=new Date();
		System.out.println(d);
	}

}
