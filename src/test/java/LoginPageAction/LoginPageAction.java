package LoginPageAction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import LoginPageControl.LoginPageControl;


public class LoginPageAction {
	public WebDriver driver;
	//public LoginPageControl loginPageControl;

	
	public LoginPageAction(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		LoginPageControl loginPageControl=new LoginPageControl(driver);
	}
	
	public boolean doLogin(String UserName, String PassWord) throws InterruptedException
	{
		LoginPageControl loginPageControl=new LoginPageControl(driver);
		//Thread.sleep(3000);
		loginPageControl.username.sendKeys(UserName);
		loginPageControl.password.sendKeys(PassWord);
		loginPageControl.submit.click();
		//Thread.sleep(3000);
		boolean isSuccess = loginPageControl.home.isDisplayed();
		return isSuccess;
	}

}
