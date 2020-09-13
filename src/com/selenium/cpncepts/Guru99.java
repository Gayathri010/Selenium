package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/drag_drop.html");
	    
	    
	    WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']"));
	    WebElement account = driver.findElement(By.xpath("//ol[@id='bank']"));
	    WebElement bank1 = driver.findElement(By.xpath("//li[@id='fourth']"));
	    WebElement amount = driver.findElement(By.xpath("//ol[@id='amt7']"));
	    WebElement credit = driver.findElement(By.xpath("//li[@id='credit1']"));
	    WebElement sales = driver.findElement(By.xpath("//ol[@id='loan']"));
	    WebElement amount2 = driver.findElement(By.xpath("//li[@id='fourth']"));
	    WebElement sales2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
	    
	    
	    
	    Actions ac = new Actions(driver);
	    ac.dragAndDrop(bank, account).perform();
	    Thread.sleep(2000);
	    ac.dragAndDrop(bank1, amount).perform();
	    Thread.sleep(2000);
	    ac.dragAndDrop(credit, sales).perform();
	    Thread.sleep(2000);
	    ac.dragAndDrop(amount2, sales2).perform();
	    Thread.sleep(2000);

}
}