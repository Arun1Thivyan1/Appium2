package one;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class doctorspace {
	
public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10.0");
		dc.setCapability("udid", "FY59UKCIPJDEO7ZD");
		dc.setCapability("deviceName", "Redmi 9i");
		dc.setCapability("appPackage", "com.drspace.user.drspace_user");
		dc.setCapability("appActivity", "com.drspace.user.drspace_user.MainActivity");
		dc.setCapability("automationName", "UiAutomator2");

		
		URL U= new URL("http://0.0.0.0:4723/");
		
		driver=new AndroidDriver(dc);
		WebElement one=driver.findElement(By.xpath("//android.widget.TextView[@text=\"العربية\"]"));
		one.click();
		
		Thread.sleep(5000);
		WebElement two=driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue\"]"));
		two.click();
		
		Thread.sleep(5000);
		WebElement three=driver.findElement(By.xpath("//android.widget.TextView[@text=\"تسجيل الدخول\"]"));
		three.click();
		
	}

}



