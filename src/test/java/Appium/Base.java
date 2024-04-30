package Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static AndroidDriver<AndroidElement> capabalities1() throws MalformedURLException
	{
		

		File appDir = new File("src");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap= new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 
		 return driver;
		
		
	}
	
	public static AndroidDriver<AndroidElement> capabalities2() throws MalformedURLException
	{
		

		File appDir = new File("src");
		File app = new File(appDir, "SMFleetDriver_2.4.apk");
		DesiredCapabilities cap= new DesiredCapabilities();

		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Sun");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		AndroidDriver<AndroidElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		 
		 return driver;
		
		
	}

}
