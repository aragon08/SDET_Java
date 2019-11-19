package tests;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest
	public void setup(){
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("device", "iPhone 8 Plus");
		 caps.setCapability("os_version", "11");
		     caps.setCapability("name", "Bstack-[Java] Sample Test");
		     caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
	}
	
	
	@AfterTest
	public void teardown(){
		
	}
}
