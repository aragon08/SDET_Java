package dem;
import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.offset.PointOption;

public class IOSTest extends Practice{

@SuppressWarnings("rawtypes")
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	IOSDriver<IOSElement>driver=capabilities();
	TouchAction touchAction = new TouchAction(driver);
	/*driver.findElementByAccessibilityId("Alert Views").click();
	driver.findElementByXPath("//*[@value='Text Entry']").click();
	//driver.findElementByXPath("//XCUIElementTypeAlert[@name=\"A Short Title Is Best\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther\n" ).sendKeys("hello");
	driver.findElementByClassName("XCUIElementTypeOther").sendKeys("Hello");
	driver.findElementByName("OK").click();
	//driver.findElementByAccessibilityId("OK").click();*/
	driver.findElementByAccessibilityId("Allow").click();
	driver.wait(50000);
	touchAction.tap(PointOption.point(20, 20)).perform();



}
}