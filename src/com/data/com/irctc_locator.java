package com.data.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class irctc_locator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	WebElement signin = driver.findElement(By.id("i-icon-profile"));
	signin.click();
	
	WebElement login = driver.findElement(By.id("hc"));
	login.click();
	
	WebElement fb = driver.findElement(By.xpath("newFbId"));
	fb.click();
	
	//WebElement email = driver.findElement(By.id("email"));
//	email.sendKeys("rmuthukumar32012@gmail.com");
	
	//WebElement pass = driver.findElement(By.id("email"));
	//pass.sendKeys("nazriya");
	
	//WebElement next = driver.findElement(By.id("login"));
//	next.click();
	
	
	
	//WebElement from = driver.findElement(By.id("src"));
	//from.sendKeys("CMBT, Chennai, Chennai");
	
	//WebElement to = driver.findElement(By.id("dest"));
	//to.sendKeys("KARUR");
	
	//WebElement date = driver.findElement(By.className("db"));
//	date.sendKeys("11-Sep-2021");
	
	//WebElement search = driver.findElement(By.id("search_btn"));
	//search.click();
	//driver.findElement(By.className("nsm7Bb-HzV7m-LgbsSe-BPrWId"));
	//driver.findElement(By.className("fFW7wc-ibnC6b"));
	
	
	
}
}
