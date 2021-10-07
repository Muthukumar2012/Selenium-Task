package com.data.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class switchtowithgettext {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/windows");
	
	driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	
	
Set<String> windowHandles = driver.getWindowHandles();
for (String str : windowHandles) {
	String title = driver.switchTo().window(str).getTitle();
	System.out.println(title);
}
	System.out.println("----------------------------");
	
	WebElement text1 = driver.findElement(By.xpath("//h3[text()='New Window']"));
	String t = text1.getText();
	System.out.println(t);
	
	String s= "The Internet";
	for (String str : windowHandles) {
		if (driver.switchTo().window(str).getTitle().equals(s)) {
			break;
			
		}
		
	}
	
	WebElement text2 = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
	String t1 = text2.getText();
	System.out.println(t1);
	}
}
