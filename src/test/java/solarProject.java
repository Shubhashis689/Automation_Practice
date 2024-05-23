import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class solarProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jsr\\Downloads\\ChromeDriver115_Win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dev-test-erp.co.in/index.php?msg=2");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("jyotip");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("jyotis@123");
		driver.findElement(By.xpath("//button[@id='login']")).click();
		Actions action=new Actions (driver);
		action.moveToElement(driver.findElement(By.xpath("//a[text()=' New IT Development']"))).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' New IT Development']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=' Task List']")).click();
		boolean allTaskPage=driver.findElement(By.xpath("//h4[text()='All Task']")).isDisplayed();
		Assert.assertTrue(allTaskPage);
		driver.close();
	}

}
