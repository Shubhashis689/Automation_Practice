package LoginPageControl;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LoginPageAction.LoginPageAction;

public class LoginPageControl {
	public WebDriver driver;
	
	public LoginPageControl(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='userEmail']")
	public WebElement username;
	
	@FindBy(xpath="//input[@id='userPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	public WebElement submit;
	
	@FindBy(xpath="//div[@id='toast-container']")
	public WebElement popupMessage;
	
	@FindBy(xpath="(//button[contains(@class,'btn-custom')])[1]")
	public WebElement home;
	
	
	
	public WebDriver login ()
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsr\\Downloads\\ChromeDriver115_Win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		return driver;
	}
}
