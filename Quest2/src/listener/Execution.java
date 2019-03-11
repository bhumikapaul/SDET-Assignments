package listener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;*/
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.TestListener.class)
public class Execution {

	public WebDriver driver;
	
	@Test(priority=2)
	public void SetupApplicationLogin()
	{
		System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");

	}
	
	@Test(priority=3)
	public void Cleanup()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void TestCase()
	{
		System.out.println("Sample Test");
	}
	
}
