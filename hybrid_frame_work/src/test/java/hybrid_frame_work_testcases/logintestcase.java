package hybrid_frame_work_testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.testbase;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;
import pages.homepage;
import pages.loginpage;

public class logintestcase extends testbase {
	loginpage login;
	homepage hmpage;

	public logintestcase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@BeforeMethod
	
	public void setUp() throws IOException
	{
		initialization();
		login=new loginpage();
		
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest()
	{
	String title= login.validateLoginPageTitle();	
	Assert.assertEquals(title, "fb");
	
	}
	
	@Test(priority = 2)
	public void loginTest() throws IOException {
		hmpage=login.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	@AfterMethod
	
	public void tearDown() {
		driver.quit();
	}

}
