package one;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;

public class sample {
	
	public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10.0");
		dc.setCapability("udid", "FY59UKCIPJDEO7ZD");
		dc.setCapability("deviceName", "Redmi 9i");
		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		dc.setCapability("automationName", "UiAutomator2");
		//dc.setCapability("autoGrantPermissions", true);
		
		URL U= new URL("http://0.0.0.0:4723/");
		
		driver=new AndroidDriver(dc);
		
//		WebElement one=driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
//	
//		WebElement two=driver.findElement(By.id("com.miui.calculator:id/btn_mul_s"));
//	
//		WebElement three=driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
//		
//		WebElement four=driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
//	
//		
//		one.click();
//		two.click();
//		three.click();
//		four.click();
	}

}
