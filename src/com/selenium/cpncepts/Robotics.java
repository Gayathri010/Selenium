package com.selenium.cpncepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotics {

	public static void main(String[] args) throws InterruptedException, AWTException  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    
	    
	   WebElement Bestsellers = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[1]"));
	   Actions ac = new Actions(driver);
	   ac.contextClick(Bestsellers).perform();
	   Robot r = new Robot();
	   r.keyPress(KeyEvent.VK_DOWN);
	   r.keyRelease(KeyEvent.VK_DOWN);
	     
	   r.keyPress(KeyEvent.VK_ENTER);
	   r.keyRelease(KeyEvent.VK_ENTER);
	   Thread.sleep(2000);
	      
	   
	    WebElement mobiles = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[2]"));
	    ac.contextClick(mobiles).perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	     
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);

	     
	    WebElement amazonpay = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[3]"));
	    ac.contextClick(amazonpay).perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	     
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);

	     
	    WebElement pantry = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[4]"));
	    ac.contextClick(pantry).perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	     
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);

	     
	    WebElement newreleases = driver.findElement(By.xpath("(//a[contains(@class,'nav-a  ')])[5]"));
	    ac.contextClick(newreleases).perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	     
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);

	      
	    WebElement signin = driver.findElement(By.xpath("(//span[@class='nav-line-1'])[2]"));
	    ac.contextClick(signin).perform();
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	     
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	 //WINDOW HANDLE AND WINDOW HANDLES    
	     
	String pID = driver.getWindowHandle();
	System.out.println(pID);
	
	Set<String> allID = driver.getWindowHandles();
	System.out.println(allID);
	
	for (String id : allID) {
		driver.switchTo().window(id);
		System.out.println(driver.getTitle());
		
	}
	     String actualTitle = "Amazon Sign In";
	     for (String id : allID) {
	    	 if(driver.switchTo().window(id).getTitle().equals(actualTitle))
	    	 {
			 break;
	         }
	     
	     
	     
	     
	    
	}

	}}

