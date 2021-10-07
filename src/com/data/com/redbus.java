package com.data.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\chromedriver(1).exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	
    driver.findElement(By.id("i-icon-profile")).click();
	
	driver.findElement(By.xpath("//li[@id='signInLink']")).click();

	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(frame1);
	WebElement tex = driver.findElement(By.xpath("//span[text()='Connect using social accounts']"));
	String text2 = tex.getText();
	System.out.println(text2);

	WebElement mobile = driver.findElement(By.xpath("//input[@type='number']"));
	mobile.sendKeys("8883578808");
	
	WebElement text = driver.findElement(By.xpath("//div[@class='new-signin-header m-l-44']"));
	String text1 = text.getText();
	System.out.println(text1);

	driver.switchTo().defaultContent();
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//i[@class='icon-close']")).click();
}
}
