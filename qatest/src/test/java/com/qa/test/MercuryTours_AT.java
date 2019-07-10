package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MercuryTours_AT {
	private WebDriver driver;
	By registerLinkLocator= By.linkText("REGISTER");
	By registerPageLocator=By.xpath("//img[@src=\"/images/nav/logo.gif\"]");
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
	By registerButtonLocator= By.name("register");
	By userLocator=By.name("userName");
	By passLocator= By.name("password");
	By signInBtnLocator= By.name("login");
	By homePageLocator= By.xpath("//img[@src=\"/images/masts/mast_signon.gif\"]");
	
	@BeforeTest
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://newtours.demoaut.com/");
	  }

	  @AfterTest
	  public void teardown() {
		  //driver.quit();
	  }
	
  @Test
  public void registerUser() throws InterruptedException {
	  driver.findElement(registerLinkLocator).click();
	  Thread.sleep(2000);
	  if(driver.findElement(registerPageLocator).isDisplayed()){
		  driver.findElement(usernameLocator).sendKeys("user1");
		  driver.findElement(passwordLocator).sendKeys("user123");
		  driver.findElement(confirmPasswordLocator).sendKeys("user123");
		  driver.findElement(registerButtonLocator).click();
		  
	  }
	  else {
		  System.out.println("Register pages was not found");
	  }
	  
	  List<WebElement> fonts = driver.findElements(By.tagName("font"));
	  
	  Assert.assertEquals(fonts.get(5).getText(), "Note: Your user name is user1.");
  }
  
  @Test
  public void signIn() throws InterruptedException {
	if(driver.findElement(userLocator).isDisplayed()) {
		driver.findElement(userLocator).sendKeys("user1");
		driver.findElement(passLocator).sendKeys("user123");
		driver.findElement(signInBtnLocator).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(homePageLocator).isDisplayed());
	}else {
		System.out.println("username textbox was not presented");
	}
  }

}
