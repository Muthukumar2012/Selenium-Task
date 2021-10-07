package com.data.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Muthu\\eclipse-workspace\\SeleniumD\\Driver\\chromedriver(1).exe");

		// interface //class -----> Multiple inheritance

		WebDriver driver = new ChromeDriver();

		// parent //child -----> Upcasting

		driver.get("https://web.whatsapp.com/");
		// get() --> launch a new browser and opens the given URL

	}

}
