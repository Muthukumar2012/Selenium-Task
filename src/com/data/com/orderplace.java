package com.data.com;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.handler.GetTagName;
import org.openqa.selenium.support.ui.Select;

public class orderplace {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\chromedriver(1).exe");

		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");


		driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();

		driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[3]")).click();
		driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]")).click();

		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement qty = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int i = 1; i < 10; i++) {
			qty.click();
		}
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select s = new Select(size);
		s.selectByVisibleText("M");

		driver.findElement(By.xpath("//a[@id='color_24']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
		Thread.sleep(1000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\Screenshot\\automationpractice.png");
		FileUtils.copyFile(src, dest);

		// driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");
		driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400);");

		driver.findElement(By.id("email")).sendKeys("anonymous888333555@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("muthu2012");
		Thread.sleep(500);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File src1 = ts1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File(
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\Screenshot\\automationpractice1.png");
		FileUtils.copyFile(src1, dest1);
		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.xpath("//button[@name='processAddress']")).click();

		js.executeScript("window.scrollBy(0,400);");

		Thread.sleep(1000);

		TakesScreenshot t = (TakesScreenshot) driver;
		File s1 = t.getScreenshotAs(OutputType.FILE);
		File d = new File(
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\Screenshot\\automationpractice2.png");
		FileUtils.copyFile(s1, d);

		driver.findElement(By.id("cgv")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window.scrollBy(0,400);");

		Thread.sleep(1000);

		TakesScreenshot ts111 = (TakesScreenshot) driver;
		File src111 = ts111.getScreenshotAs(OutputType.FILE);
		File dest111 = new File(
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\Screenshot\\automationpractice3.png");
		FileUtils.copyFile(src111, dest111);

		driver.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
		js1.executeScript("window.scrollBy(0,300);");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TakesScreenshot ts3 = (TakesScreenshot) driver;
		File scr3 = ts3.getScreenshotAs(OutputType.FILE);
		File dsc3 = new File(
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumDemo\\Driver\\Screenshot\\automationpractice4.png");
		FileUtils.copyToDirectory(scr3, dsc3);
		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
