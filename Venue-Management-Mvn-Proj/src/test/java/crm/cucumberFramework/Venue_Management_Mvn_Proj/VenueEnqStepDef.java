package crm.cucumberFramework.Venue_Management_Mvn_Proj;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VenueEnqStepDef {
	testBase tb = new testBase();
	Selectors se = new Selectors();
	

	@When("^I navigate to the Venue Management Home Page$")
	public void I_navigate_to_the_Venue_Management_Home_Page() throws Throwable {
		testBase.getObject(Selectors.HomePageMenu).click();
		testBase.getObject(Selectors.VEMLink).click();
		
	     
	
		      
		
		//tb.getObject(se.EnterSearchCriteria).clear();
	
	}

	@When("^I login to the RHH Venue Planner$")
	public void I_login_to_the_RHH_Venue_Planner() throws Throwable {

	}

	@When("^I select an available dates$")
	public void I_select_an_available_dates() throws Throwable {
	
	}

	@When("^I enter enquiry information$")
	public void I_enter_enquiry_information() throws Throwable {
	
	}

	@Then("^I should be able to make an enquiry$")
	public void I_should_be_able_to_make_an_enquiry() throws Throwable {
		//tb.driver.manage().deleteAllCookies();  
		
		  tb.driver.manage().deleteAllCookies();
		    tb.driver.close();
		}
	 
	}


