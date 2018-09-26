package Testcase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.Homepage_Text;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Homepage_Text_TestCase {
	
@Test
	public  void Homepage_Text_module () throws MalformedURLException, InterruptedException
	{
		
		// TODO Auto-generated method stub
	 File appDir = new File("src");
     File app =    new File(appDir, "ApiDemos-debug.apk");
     
     DesiredCapabilities Capabilities = new DesiredCapabilities();
     
     Capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
     Capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     
     Capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
    AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
    
    Thread.sleep(500L);
    
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//System.out.println(driver.getContext());
	//System.out.println("DONE");
	HomePage h= new HomePage(driver);
	h.Text.click();
	Homepage_Text v= new Homepage_Text(driver);
	v.Linkify.click();
	
	System.out.println("Linkify has been opening successfully");
	
	
}

}
