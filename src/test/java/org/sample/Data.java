package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data  {
	@Parameters("Browser")
	@Test
	public void tc(String bwsName) {
		WebDriver driver;
		if (bwsName.startsWith("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			
		}
		else if (bwsName.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			

		}
		else {
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
		}
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

	}	
}
