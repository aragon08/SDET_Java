package com.gammatest.gammap;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearchTest {
	
	private WebDriver driver;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	public void testGooglePage() {
		WebElement searchBox=driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Selenium web driver");
		
		searchBox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		assertEquals(driver.getTitle(),"Selenium web driver");
	}

}
