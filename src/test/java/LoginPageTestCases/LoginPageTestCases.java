package LoginPageTestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LoginPageAction.LoginPageAction;
import LoginPageControl.LoginPageControl;

public class LoginPageTestCases {
	public WebDriver driver;
	
	@BeforeMethod
	public void loginPage()
	{
		LoginPageControl log=new LoginPageControl(driver);
		driver=log.login();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void loginSuccess() throws InterruptedException
	{
		LoginPageAction log=new LoginPageAction(driver);
		boolean isPass=log.doLogin("bapu689@gmail.com", "Bapu@143");
		Assert.assertTrue(isPass);

	}
	
}
