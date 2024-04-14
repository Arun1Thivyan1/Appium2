package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.support.ui.ExpectedConditions;

public class testbase {

	
	public static WebDriver driver;
	public static Properties prop;
	
	public testbase() throws IOException {
		
		try {
			prop=new Properties();
			
			FileInputStream ip= new FileInputStream("D:\\eclipse workspace\\hybrid_frame_work\\src\\main\\java\\conifiguration\\config.prop");
			prop.load(ip);
		}catch(FileNotFoundException e) {
		e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		
		public static void initialization() {
			String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
		
			
			driver = new ChromeDriver(options);
			
			driver.manage().window().maximize();
			//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(25));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//driver.manage().timeouts().implicitlyWait(timeset_testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
		}
	
		
		
		
	
}
