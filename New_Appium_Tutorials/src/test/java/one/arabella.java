package one;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class arabella {
	
public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "10.0");
		dc.setCapability("udid", "FY59UKCIPJDEO7ZD");
		dc.setCapability("deviceName", "Redmi 9i");
		dc.setCapability("appPackage", "com.annz.arabella");
		dc.setCapability("appActivity", "com.annz.arabella.MainActivity");
		dc.setCapability("automationName", "UiAutomator2");

		
		URL U= new URL("http://0.0.0.0:4723/");
		
		driver=new AndroidDriver(dc);
		
		Thread.sleep(8000);
		
		//WebElement one=driver.findElement(By.xpath("//android.widget.TextView[@text=\"󰄰\"]"));
		//android.widget.TextView[@text='العربية']
		WebElement one=driver.findElement(By.xpath("//android.widget.TextView[@text='العربية']"));
		one.click();
		Thread.sleep(6000);
		
		
//		WebElement two= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Confirm\"]"));
//		two.click();
		
		WebElement two=driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm']"));
		two.click();
		Thread.sleep(6000);
		
//		Thread.sleep(8000);
     	WebElement three= driver.findElement(By.xpath("//android.widget.TextView[@text='التالي']"));
        three.click();		
//		
        Thread.sleep(5000);
//		WebElement four= driver.findElement(By.xpath("//android.widget.EditText[@text=\"إدخل رقم الجوال\"]"));
//		four.click();
        
        WebElement four= driver.findElement(By.xpath("//android.widget.EditText[@text='إدخل رقم الجوال']"));
        four.click();	
        
       Thread.sleep(5000);
       four.sendKeys("543215432");
//		
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//android.widget.TextView[@text='سجلي الدخول للاستفادة من النقاط وأكثر']")).click(); 

        Thread.sleep(7000);
        
        driver.findElement(By.xpath("(//android.widget.TextView[@text='تسجيل الدخول'])[2]")).click();
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
     //   Thread.sleep(10000);
		
//		WebElement five=driver.findElement(By.xpath("(//android.widget.TextView[@text='الرجاء ادخال رمز التحقق المكون من 5 ارقام المرسل علي رقم - 543215432']//parent::android.view.ViewGroup//following-sibling::android.view.ViewGroup//child::android.view.ViewGroup)[1]//child::android.widget.EditText"));
//	    five.click();
//		Thread.sleep(3000);
//		
//		five.sendKeys("1");
////		
//      Thread.sleep(3000);
//		 
//		
//		WebElement six=driver.findElement(By.xpath("(//android.widget.TextView[@text='الرجاء ادخال رمز التحقق المكون من 5 ارقام المرسل علي رقم - 543215432']//parent::android.view.ViewGroup//following-sibling::android.view.ViewGroup//child::android.view.ViewGroup)[2]//child::android.widget.EditText"));
//		six.click();
//		Thread.sleep(3000);
//		six.sendKeys("1");
//		
//        Thread.sleep(3000);
//		 
//		
//		WebElement seven=driver.findElement(By.xpath("(//android.widget.TextView[@text='الرجاء ادخال رمز التحقق المكون من 5 ارقام المرسل علي رقم - 543215432']//parent::android.view.ViewGroup//following-sibling::android.view.ViewGroup//child::android.view.ViewGroup)[3]//child::android.widget.EditText"));
//		seven.click();
//		Thread.sleep(3000);
//		seven.sendKeys("1");
//		
//		 Thread.sleep(3000);
//		 
//			
//			WebElement eight=driver.findElement(By.xpath("(//android.widget.TextView[@text='الرجاء ادخال رمز التحقق المكون من 5 ارقام المرسل علي رقم - 543215432']//parent::android.view.ViewGroup//following-sibling::android.view.ViewGroup//child::android.view.ViewGroup)[4]//child::android.widget.EditText"));
//			eight.click();
//			Thread.sleep(3000);
//			eight.sendKeys("1");
//			
//			 Thread.sleep(3000);
//			 
//				
//				WebElement nine=driver.findElement(By.xpath("(//android.widget.TextView[@text='الرجاء ادخال رمز التحقق المكون من 5 ارقام المرسل علي رقم - 543215432']//parent::android.view.ViewGroup//following-sibling::android.view.ViewGroup//child::android.view.ViewGroup)[5]//child::android.widget.EditText"));
//				nine.click();
//				Thread.sleep(3000);
//				nine.sendKeys("1");
//				
//				Thread.sleep(4000);
//				 	
//				driver.findElement(By.xpath("//android.widget.TextView[@text='الرجاء ادخال رمز التحقق المكون من 5 ارقام المرسل علي رقم - 543215432']")).click();
//				
//				 Thread.sleep(4000);
//				 
//					
//				driver.findElement(By.xpath("//android.widget.TextView[@text='تاكيد']")).click();
//				 Thread.sleep(4000);
//				 
//				driver.findElement(By.xpath("//android.widget.Button[@text='ALLOW ONLY WHILE USING THE APP']")).click();
//				
				 
//				 
//					
//				driver.findElement(By.xpath("//android.widget.TextView[@text=\"تاكيد\"]")).click();
				
				
			 
		}
	}




