package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GoogleSearch {
 
  @Test
  public void getMyClass() throws InterruptedException { 
  WebDriver driver = new ChromeDriver();
  WebDriverWait wait = new WebDriverWait(driver, 12);
  driver.get("http://google.com/");
  driver.manage().window().maximize();
  Thread.sleep(2000);
  driver.quit();
  }
}
