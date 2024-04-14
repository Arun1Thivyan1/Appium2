package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.testbase;

public class loginpage extends testbase{

	

	@FindBy(id="email")
	WebElement email;
	
	@FindBy(xpath="(//div[@class='mb-4']//child::input)[2]")
	WebElement pass;
	
	
	
	public loginpage() throws IOException {
		super();
		
		
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public homepage login(String un,String pwd ) throws IOException 
	{
		email.sendKeys(un);
		pass.sendKeys(pwd);
		return new homepage();
		
	}

}

