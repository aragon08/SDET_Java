package dem;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;


public class Practice {
	

	@SuppressWarnings("rawtypes")
	public static  IOSDriver<IOSElement> capabilities() throws MalformedURLException
	{
		 @SuppressWarnings("rawtypes")

		 
		// TODO Auto-generated method stub
		IOSDriver<IOSElement>driver;
		 @SuppressWarnings("rawtypes")
		 // PointOption PO=new PointOption();
DesiredCapabilities d=new DesiredCapabilities();
d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
d.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
d.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.4");
//
d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
d.setCapability(MobileCapabilityType.APP, "//Users//mac//Desktop//freerangebysidegames.app");
d.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
//d.setCapability(MobileCapabilityType.APP, "//Users//mac//Desktop//Appium//freerangebysidegames.app");

//d.setCapability(MobileCapabilityType.APP, "⁨//users⁩//⁨mac⁩//Library⁩//⁨Developer⁩//⁨Xcode⁩//DerivedData⁩//⁨UICatalog-axxnviwldmjannczavaeseqqipmu⁩//⁨Build⁩⁩//Products⁩//⁨Debug-iphonesimulator//UICatalog.app⁩");
//IOSDriver<IOSElement>driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);
driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
return driver;

	}

}
/*package dem;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import internal.org.apache.commons.lang3.StringUtils;

@SuppressWarnings("unused")
public class Practice {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
DesiredCapabilities d=new DesiredCapabilities();
d.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
d.setCapability(MobileCapabilityType.PLATFORM_NAME,"IOS");
d.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.4");
//
d.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
//d.setCapability(MobileCapabilityType.APP, "//Users//mac//Desktop//breakout.app");
//d.setCapability(MobileCapabilityType.APP, "//Users//mac//Desktop//freerangebysidegames.app");
d.setCapability(MobileCapabilityType.APP, "//Users//mac//Desktop//UICatalog.app");


IOSDriver<IOSElement>driver=new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),d);

	}

}*/
