package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    driver.manage().window().maximize();
	    
	    WebElement singleframe = driver.findElement(By.id("singleframe"));
	    driver.switchTo().frame(singleframe);
	    
	    WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
	    textbox.sendKeys("gayu");
	  
	    driver.switchTo().defaultContent();
	    
	    WebElement iframe = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	    iframe.click();
	    
	    
	   WebElement multiframe = driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
	   driver.switchTo().frame(multiframe);
	    
	    
	    WebElement singleframes = driver.findElement(By.id("singleframe"));
	    driver.switchTo().frame(singleframes);
	    
	    WebElement textbox1 = driver.findElement(By.xpath("//input[@type='text']"));
	    textbox1.sendKeys("gayu");
	    
	    driver.switchTo().defaultContent();
	}

}
