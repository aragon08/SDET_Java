package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import dem.TouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;

public class BrowserStackIOS {

	
	public static String accessKey = "2wyKQnjt9yj8VAcK9JjZ";
	  public static String userName = "gammapartners";

	  public static void main(String args[]) throws MalformedURLException, InterruptedException {
	    DesiredCapabilities caps = new DesiredCapabilities();

	    caps.setCapability("device", "iPhone 8 ");
	caps.setCapability("os_version", "11.0");
	    caps.setCapability("name", "Bstack-[Java] Sample Test");
	    caps.setCapability("app", "bs://9c892752cefe4c7e9881def11f90b76512c60246");
	    

	    IOSDriver driver = new IOSDriver(new URL("http://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
	    TouchAction touchAction = new TouchAction(driver);
	   /* IOSElement textButton = (IOSElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Button")));
	    textButton.click();
	    IOSElement textInput = (IOSElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Input")));
	    textInput.sendKeys("hello@browserstack.com" + "\n");

	    Thread.sleep(5000);

	    IOSElement textOutput = (IOSElement) new WebDriverWait(driver, 30).until(
	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Text Output")));

	    if(textOutput != null && textOutput.getText().equals("hello@browserstack.com"))
	        assert(true);
	    else
	        assert(false);
*/
	    driver.findElementByAccessibilityId("Allow").click();
	    //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
	    //driver.wait(5000);
	    Thread.sleep(3000);
	    touchAction.tap(PointOption.point(10, 10)).perform();
	    Thread.sleep(3000);
	    driver.quit();
	  }
	  	
}
