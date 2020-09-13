package com.selenium.cpncepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    WebElement day = driver.findElement(By.id("day"));    
	    Select d = new Select(day);
	    d.selectByIndex(7);
	    Thread.sleep(2000);
	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select m = new Select(month);
	    m.selectByValue("9");
	    Thread.sleep(2000);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select y = new Select(year);
	    y.selectByVisibleText("2016");
	    Thread.sleep(2000);
	    
	    List<WebElement> options = d.getOptions(); 
	    for (WebElement dd : options) {
	 	System.out.println(dd.getText());
	    
	    

	}

}}
