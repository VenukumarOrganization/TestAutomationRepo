package com.Sample.Test;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleTest{
	
	WebDriver driver; 
			
	@Test
	public void sampleTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Venukumar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://freecrm.com/");
		System.out.println(driver.getCurrentUrl());
		
		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		// This will return the number of windows opened by Webdriver and will return Set of St//rings
		Set<String>s1=driver.getWindowHandles();
		System.out.println(s1);
		Assert.assertEquals(driver.getCurrentUrl(), "https://freecrm.com/");
	}
	
	@AfterMethod
	public void afterMethod1() {
		
		driver.close();
	}
}
