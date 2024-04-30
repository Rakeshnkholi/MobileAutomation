package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FleetAndroid11 extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver=capabalities2();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.EditText[@text='Enter the mobile number']").click();
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("9177376746");
		driver.findElementById("com.sunmobility.smfleetdriver:id/verify").click();
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_button").click();
		driver.findElementById("com.sunmobility.smfleetdriver:id/local_search").click();
		driver.findElementByXPath("//android.widget.EditText[@text='Vehicle id']").sendKeys("F117998");
		driver.findElementByXPath("//android.widget.Button[@text='SEARCH']").click();
		driver.findElementById("com.sunmobility.smfleetdriver:id/messageSelector").click();
		driver.findElementById("com.android.permissioncontroller:id/grant_dialog").click();
		driver.findElementByXPath("//android.widget.Button[@text='Allow']").click();
		
		
		
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.ImageButton").click();
		
		driver.findElementByXPath("(//android.widget.ListView)[1]").click();
		
		
		
		
	}
}
