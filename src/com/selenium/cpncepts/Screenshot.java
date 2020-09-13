package com.selenium.cpncepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	
		public static void main(String[] args) throws InterruptedException, IOException {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    driver.manage().window().maximize();
		    
		    TakesScreenshot ts =( TakesScreenshot) driver;
		 File srcfile  = ts.getScreenshotAs(OutputType.FILE);
		 File desfile = new File("C:\\Users\\gayathri\\workspace\\SeleniumProject\\Screenshot\\test.png");
		 FileUtils.copyFile(srcfile, desfile );
	}

}
