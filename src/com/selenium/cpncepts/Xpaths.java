package com.selenium.cpncepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {	

		public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\gayathri\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    boolean enabled = email.isEnabled();
	    System.out.println(enabled);
	    email.sendKeys("gayumkg@gmail.com");
	    Thread.sleep(2000);
	    
	    WebElement paasword = driver.findElement(By.xpath("//input[@name='pass']"));
	    boolean displayed = paasword.isDisplayed();
	    System.out.println(displayed);
	    paasword.sendKeys("gayumkg0217");
	    Thread.sleep(2000);
	    
	    WebElement create = driver.findElement(By.xpath("//span[text()='Create an account']"));
	    String text = create.getText();
	    System.out.println(text);
	    Thread.sleep(2000);
	    
	    WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	    boolean displayed2 = firstname.isDisplayed();
	    System.out.println(displayed2);
	    firstname.sendKeys("Gayathri");
	    Thread.sleep(2000);
	    
	    
	    WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
	    boolean displayed3 = surname.isDisplayed();
	    System.out.println(displayed3);
	    surname.sendKeys("Murugan");
	    Thread.sleep(2000);
	    
	    WebElement phone = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    boolean enabled2 = phone.isEnabled();
	    System.out.println(enabled2);
	    phone.sendKeys("9003147845");
	    Thread.sleep(2000);
	    
	    WebElement newpass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	    boolean enabled3 = newpass.isEnabled();
	    System.out.println(enabled3);
	    newpass.sendKeys("gayumkg0217");
	    Thread.sleep(2000);
	    
	    WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
	    boolean selected = login.isSelected();
	    System.out.println(selected);
	    login.click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
