package com.data.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orderplacelogin{
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
//	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.id("email_create")).sendKeys("anonymous125896@gmail.com");
    WebElement create = driver.findElement(By.id("SubmitCreate"));
	create.click();
	driver.findElement(By.id("id_gender1")).click();
	driver.findElement(By.id("customer_firstname")).sendKeys("Muthukumar");
	driver.findElement(By.id("customer_lastname")).sendKeys("R");
	driver.findElement(By.id("passwd")).sendKeys("muthu2012");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement d = driver.findElement(By.id("days"));
	Select day = new Select(d);
	day.selectByValue("20");
	WebElement m = driver.findElement(By.id("months"));
	Select month = new Select(m);
	month.selectByValue("12");
	WebElement y = driver.findElement(By.id("years"));
	Select year = new Select(y);
	year.selectByIndex(25);
	
	driver.findElement(By.id("company")).sendKeys("Teccorps");
	driver.findElement(By.id("address1")).sendKeys("13/3,2nd floor,");
	driver.findElement(By.id("address2")).sendKeys("Round Building, Anna nagar west Extension");
	driver.findElement(By.id("city")).sendKeys("Chennai");
	WebElement state = driver.findElement(By.id("id_state"));
	Select s =new Select(state);
	s.selectByValue("32");
	driver.findElement(By.id("postcode")).sendKeys("10001");
	driver.findElement(By.id("phone")).sendKeys("12025550191");
    driver.findElement(By.id("submitAccount")).click();
	
}}
