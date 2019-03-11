package stepdef;

import java.util.regex.Matcher;


import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef {
	
	 public int mult;
	
	@Given("^First number is  \"([^\"]*)\"$")
	public void first_number_is(String arg1) throws Throwable {
	    System.out.println(arg1);
	   
	}

	@Given("^Second number is\"([^\"]*)\"$")
	public void second_number_is(String arg2) throws Throwable {
	    
		System.out.println(arg2);
	}

	@Given("^Third number is\"([^\"]*)\"$")
	public void third_number_is(String arg3) throws Throwable {
		System.out.println(arg3);
	}
	
	@When("^I multiply (\\d+) and (\\d+) and (\\d+)$")
	public void i_multiply_and_and(int arg1, int arg2, int arg3) throws Throwable {
	    mult = arg1*arg2*arg3;
	    
	}
	
	@Then("^The result should be (\\d+)$")
	public void the_result_should_be(int arg1) throws Throwable {
	   System.out.println("The output is "+mult);
	}
}

	

	


