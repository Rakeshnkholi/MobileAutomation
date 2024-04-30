package Appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	
	public static void main(String[] args) throws MalformedURLException {
		
	

		AndroidDriver<AndroidElement> driver =capabalities1();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Xpath id classname, andriodUIautomator
		/* xpath syntax
		 *tagNam[@attributer='value']
		 * 
		 * In appium tagname is nothing but class path
		 * 
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/widget_frame").click();
		//android.widget.RelativeLayout
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Rakesh");
		driver.findElementById("android:id/button1").click();
		
		
		
		
		
		
	 
	} 
	
}
