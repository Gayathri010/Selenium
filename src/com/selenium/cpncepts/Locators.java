package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


		public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    
	    WebElement username = driver.findElement(By .id("email"));
	    username.sendKeys("gayumkg1702@gmail.com");
	    
	    WebElement password = driver.findElement(By.id("pass"));
	    password.sendKeys("gayumkg0217");
	    
	    WebElement login = driver.findElement(By.id("u_0_b"));
	    login.click();
	}

}
