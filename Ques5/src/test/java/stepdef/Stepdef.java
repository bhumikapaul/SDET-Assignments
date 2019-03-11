package stepdef;

import java.util.concurrent.TimeUnit;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Stepdef {
	
	WebDriver driver;
	String actualTitle;

	@Before
	public void strtbrowser()
	{
		System.out.println("Start");
	}
	@After
	public void closebrowser()
	{
		System.out.println("Close");
	}


	@Given("^Launch orange HRM$")
	public void launch_orange_HRM() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\bpaul100\\LatestCodeHSID\\Day2_1\\lib\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	}

	@When("^User enters Valid Username \"([^\"]*)\"$")
	public void user_enters_Valid_Username(String arg1) throws Throwable {
	    System.out.println(arg1);
	    throw new PendingException();
	}

	@When("^Enters valid password \"([^\"]*)\"$")
	public void enters_valid_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


    @When("^the User gets onto the Auth Page and  Verifies the title of the page$")
    public void the_User_gets_onto_the_Auth_Page_and_Verifies_the_title_of_the_page() throws Throwable {
		actualTitle = driver.getTitle();
		System.out.println("The title after login is"+ " " + actualTitle);
		driver.close();
	    
	    throw new PendingException();
	}


}
