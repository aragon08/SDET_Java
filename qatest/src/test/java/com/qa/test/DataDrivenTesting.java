package com.qa.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataDrivenTesting {
	
	private WebDriver driver;
	private WriteExcelFile writeFile;
	private ReadExcelFile readFile;
	private By searchBoxLocator= By.id("search_query_top");
	private By searchBtnLocator= By.name("submit_search");
	private By resultTextLocator= By.cssSelector("span.heading-counter");
	
  @Test
  public void test() throws IOException {
	  String filepath= "C:\\Users\\Orion\\Desktop\\Test.xlsx";
	  String searchText=readFile.getCellValue(filepath, "Sheet1", 0, 0);
	  
	  driver.findElement(searchBoxLocator).clear();
	  
	  driver.findElement(searchBoxLocator).sendKeys(searchText);
	  driver.findElement(searchBtnLocator).click();
	  String resultText= driver.findElement(resultTextLocator).getText();
	  System.out.println("Page result Text: "+ resultText);
	  
	  readFile.readExcel(filepath, "Sheet1");
	  
	  writeFile.writeCellValue(filepath, "Sheet1", 0, 1, resultText);
	  
	  readFile.readExcel(filepath, "Sheet1");
		
  }
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		
		
		
		writeFile=new WriteExcelFile();
		readFile = new ReadExcelFile();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com");
  }

  @AfterTest
  public void teardown() {
	  //driver.quit();
  }

}
