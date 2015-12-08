package cucumberPageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberPageObject.Selectors;
import cucumberPageObject.TestBase;

public class MultiCosBooking extends TestBase {
	TestBase tb = new TestBase();
	Selectors se = new Selectors();
	 public int ran;
	
	@Given("^I am on the RHS CRM Home page$")
	public void I_am_on_the_RHS_CRM_Home_page() throws Throwable {
	
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.CourseSessionUrl);
		tb.driver.manage().window().maximize();

	}

	@When("^click my Course tab$")
	public void click_my_Course_tab() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tb.getObject(se.Bookingtab).click();
		tb.getObject(se.AddNewBooking).click();
		
	}

	@When("^I navigate to Course session$")
	public void I_navigate_to_Course_session() throws Throwable {

	}

	@When("^I enter course booking information$")
	public void I_enter_course_booking_information() throws Throwable {
		tb.getObject(se.Bookertextfield).click();
		tb.getObject(se.searchperson).sendKeys("Mr Richard Austin");
		Thread.sleep(2000);
		tb.getObject(se.searchperson).sendKeys(Keys.ENTER);
		
		Select dropDown9 = new Select (tb.getObject(se.CosBKSource));
		dropDown9.selectByVisibleText("Youth");
		
		Select dropDown8 = new Select (tb.getObject(se.CosBKPayMethod));
		dropDown8.selectByVisibleText("Credit card");
		
		Select dropDown7 = new Select (tb.getObject(se.CosStatus));
		dropDown7.selectByVisibleText("Booked");
		tb.getObject(se.CosBKQuantity).sendKeys("35");
	
		
	}

	@When("^I click add button$")
	public void I_click_add_button() throws Throwable {
		tb.getObject(se.CosBKAddButton).click();
	
	}

	@Then("^I should see confirmation message$")
	public void I_should_see_confirmation_message() throws Throwable {
	  
	}

}
