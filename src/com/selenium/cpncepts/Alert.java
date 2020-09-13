package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    
	    
	    WebElement Alert = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
	    Alert.click();
	    Thread.sleep(2000);
	    WebElement Box = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	    Box.click();
	    Thread.sleep(2000);
	    org.openqa.selenium.Alert aalert2 = driver.switchTo().alert();
	    aalert2.accept();
	    
	    
	    
	    WebElement alertwith  = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	    alertwith.click();
	    Thread.sleep(2000);
	    WebElement box2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	    box2.click();
	    Thread.sleep(2000);
	    org.openqa.selenium.Alert balert2 = driver.switchTo().alert();
	    balert2.accept();
	    
	    
	    WebElement textbox = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	    textbox.click();
	    Thread.sleep(2000);
	    WebElement box3 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	    box3.click();
	    org.openqa.selenium.Alert calert2 = driver.switchTo().alert();
	    calert2.sendKeys("Gayathri");
	    calert2.accept();
	    
	    
	    
	    
	}

}










