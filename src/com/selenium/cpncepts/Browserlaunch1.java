package com.selenium.cpncepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
    
  //HOW TO MAXIMIZE
    driver.manage().window().maximize();
    Thread.sleep(2000);
    
    //HOW TO NAVIGATE
    driver.navigate().to("https://www.instagram.com/");	
    Thread.sleep(2000);
    
    //HOW TO GO BACK
    driver.navigate().back();
    Thread.sleep(2000);
    
    //HOW TO GO FORWARD
    driver.navigate().forward();
    Thread.sleep(2000);
    
    //HOW TO REFRESH
    driver.navigate().refresh();
    Thread.sleep(2000);
    
    //HOW TO GET TITLE
    String title = driver.getTitle();
    System.out.println(title);
    Thread.sleep(2000);
    
    //HOW TO GET URL
    String currenturl = driver.getCurrentUrl();
    System.out.println(currenturl);
    Thread.sleep(2000);
    
    //HOW TO CLOSE
    driver.close();
   
   
}
    
	}
