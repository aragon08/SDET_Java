package testpck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;
	private By macLink=By.xpath("//*[@class=\"ac-gn-link ac-gn-link-mac\"]");
	private By textAssert=By.xpath("//*[@id=\"main\"]/section[2]/div/h3");
	private By searchIcon= By.id("ac-gn-link-search");
	private By searchBarLocator= By.id("ac-gn-searchform-input");
	private By searchIconSubmit=By.id("ac-gn-searchform-submit");
	
	
  @Test
  public void searchSCOne() {
	  driver.findElement(macLink).click();
	  Assert.assertEquals(driver.findElement(textAssert).getText(), "Ligera como siempre.\nPoderosa como nunca.");
	  
	  driver.findElement(searchIcon).click();
	  driver.findElement(searchBarLocator).sendKeys("iPhone XR");
	  driver.findElement(searchIconSubmit).click();
	  Assert.assertEquals(driver.getTitle(), "iPhone XR - Apple (MX)");
  }
  
  @BeforeTest
  public void setup() {
	  //System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://apple.com.mx");
  }

  @AfterTest
  public void teardown() {
	//driver.quit();
  }
}
