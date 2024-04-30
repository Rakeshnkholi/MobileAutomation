package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Fleetdriver extends Base 
{
	public static void main(String[] args) throws MalformedURLException
	{
		AndroidDriver<AndroidElement> driver=capabalities2();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@text='Enter the mobile number']").click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("9177376746");
		driver.findElementById("com.sunmobility.smfleetdriver:id/verify").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		
		
		driver.findElementById("com.sunmobility.smfleetdriver:id/local_search").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Vehicle id']").sendKeys("100337");
		driver.findElementByXPath("//android.widget.Button[@text='SEARCH']").click();
		driver.findElementById("com.sunmobility.smfleetdriver:id/messageSelector").click();
		driver.findElementByXPath("//android.widget.Button[@text='While using the app']").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		
		
		
		
	}

}
