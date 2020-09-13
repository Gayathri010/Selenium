package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Artoftesting {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://artoftesting.com/samplesiteforselenium");
	    
	    
	    WebElement textbox = driver.findElement(By.xpath("//input[@id='fname']"));
	    WebElement button = driver.findElement(By.xpath("//button[@id='idOfButton']"));
        WebElement click = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
        
        
        
        Actions ac = new Actions(driver);
        textbox.sendKeys("Gayathri");
        Thread.sleep(2000);
        ac.click(button).perform();
        Thread.sleep(2000);
        ac.doubleClick(click).perform();
        
	}

}
