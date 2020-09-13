package com.selenium.cpncepts;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpScrollDown {

	public static void main(String[] args) throws InterruptedException  {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    
	    WebElement Amazonlogodown = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();",Amazonlogodown);
	    
	    Thread.sleep(5000);
	    
        WebElement AmazonlogoUp = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
	    js.executeScript("arguments[0].scrollIntoView();",AmazonlogoUp);
	    
	    
	}

}

