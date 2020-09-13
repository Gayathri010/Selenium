package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    
	    
	    WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
	    WebElement tshirts = driver.findElement(By.xpath("//a[@title='T-shirts']"));
	    
	    
        Actions ac = new Actions(driver);
        ac.moveToElement(women).perform();
        Thread.sleep(2000);
        ac.click(tshirts).perform();
	    
	    
	    
	    
	    
}}