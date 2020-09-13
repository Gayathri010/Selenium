package com.selenium.cpncepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {


		public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://demoqa.com/automation-practice-table/");
		    driver.manage().window().maximize();
		    
		    ////all data
		    System.out.println("all data");
	    	
		    List<WebElement> alldata = driver.findElements(By.xpath("//table/tbody/tr/td"));
		    for (WebElement driver1 : alldata) {
		    	System.out.println(driver1.getText());
		    	
		    	
		    	System.out.println("rows");
		    	
		    	WebElement row = driver.findElement(By.xpath("//table/tbody/tr/td[1]"));
		    	String arow = row.getText();
		    	System.out.println(arow);
		    }
		    
		    
		}
		
		
		

}

