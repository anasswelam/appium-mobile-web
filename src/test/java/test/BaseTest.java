package test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;

public class BaseTest {
	

	public AndroidDriver<MobileElement> driver;
	
	@BeforeClass
	public void setUp(){
		try {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName","SM-J320F");
		caps.setCapability("platformName", "ANDROID");
		caps.setCapability("platformVersion", "5.1.1");
		caps.setCapability("udTD", "420070c860b43400");
		caps.setCapability("chromedriverExecutable","F:\\Drivers\\chromedriver.exe");
		caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
	    caps.setCapability("browserName", "Chrome");
	    caps.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
					URL url = new URL ("http://0.0.0.0:4723/wd/hub");
					driver= new AndroidDriver<MobileElement>(url,caps);
					System.out.println("Start Application ..");
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
		
		
	}
	

	
	
}
