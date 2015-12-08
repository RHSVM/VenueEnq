package cucumberPageObject;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class crmBddStepDef extends TestBase{
	TestBase tb = new TestBase();
	Selectors se = new Selectors();
	
	@Before
    public void BeforeTest() throws IOException{
		
       initialize();  
       driver = new InternetExplorerDriver();
		 driver.get(se.url);
		 driver.manage().window().maximize();
		 
		 
	}
	
	//Create Person With Address Only
	@Given("^I am on the CRM Home page$")
	public void I_am_on_the_CRM_Home_page() throws Throwable {
		//tb.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();

	}

	@When("^I want to be able to perform core functionalities$")
	public void I_want_to_be_able_to_perform_core_functionalities() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Then("^should see successful message afterwards$")
	public void should_see_successful_message_afterwards() throws Throwable {
	}

	@When("^I enter a person main details$")
	public void I_enter_a_person_main_details() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 tb.getObject(se.EnterSearchCriteria).clear();
		 tb.getObject(se.EnterSearchCriteria).sendKeys("Tes");
		 tb.getObject(se.PersonSearch).click();
		 tb.getObject(se.AddNewPersonButton).click();
		 tb.getObject(se.TitleDrop).click();
		 tb.getObject(se.TitleTextFeild1).sendKeys("Admiral");
		 tb.getObject(se.TitleTextFeild1).sendKeys(Keys.ENTER);
		 driver.findElement(By.name("inputLastName")).clear();
		 driver.findElement(By.name("inputLastName")).sendKeys("Person With Address Tess");
		 new Select(driver.findElement(By.name("ReferralSourceId"))).selectByVisibleText("Newspaper");
		 driver.findElement(By.cssSelector("select[name=\"ReferralSourceId\"] > option[value=\"2\"]")).click();
		 
	}

	@When("^I enter their address$")
	public void I_enter_their_address() throws Throwable {
		
		driver.findElement(By.xpath("//section[@id='mainSection']/div/div/fieldset/accordion/div/div/div[2]/div/form/div[3]/div/button")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
	    driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("SW1p 2pe");
	    driver.findElement(By.xpath("//section[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div/div/ng-form/fieldset/div[2]/div[4]/button")).click();
	    driver.findElement(By.xpath("//section[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div/div/ng-form/fieldset/div[3]/div/div/table/tbody/tr/td[2]/button")).click();
	}
	@When("^I click submit button$")
	public void I_click_submit_button() throws Throwable {
		
	    driver.findElement(By.xpath("//section[@id='mainSection']/div/div/fieldset/div/div[2]/button")).click();

	}

	@Then("^I should be able to register the person$")
	public void I_should_be_able_to_register_the_person() throws Throwable {
		 for (int second = 0;; second++) {
		    	if (second >= 60) fail("timeout");
		    	try { if ("RHS CRM".equals(driver.getTitle())) break; } catch (Exception e) {}
		    	Thread.sleep(1000);
		    }
	   
	}

	private void fail(String string) {
		// TODO Auto-generated method stub
		
	}
         //Add A Person With Tel
	@When("^I enter their person Tel details$")
	public void I_enter_their_person_Tel_details() throws Throwable {
		driver.findElement(By.xpath("//section[@id='mainSection']/div/div/fieldset/accordion/div/div/div[2]/div/form/div[3]/div/button[3]")).click();
	    driver.findElement(By.name("inputTel")).clear();
	    driver.findElement(By.name("inputTel")).sendKeys("0207727282829");
	    driver.findElement(By.name("inputExtension")).clear();
	    driver.findElement(By.name("inputExtension")).sendKeys("99");   
	}
         //Add Person With Email
	@When("^I enter their person Email details$")
	public void I_enter_their_person_Email_details() throws Throwable {
		driver.findElement(By.xpath("//section[@id='mainSection']/div/div/fieldset/accordion/div/div/div[2]/div/form/div[3]/div/button[2]")).click();
	    driver.findElement(By.name("inputEmail")).clear();
	    driver.findElement(By.name("inputEmail")).sendKeys("test@rhs.com");
	  	 
	}
	
	//CoreFunctionality
	@Given("^I am on the CRM Home Page$")
	public void I_am_on_the_CRM_Home_Page() throws Throwable {

	}

	@When("^I navigate to a Person's record$")
	public void I_navigate_to_a_Person_s_record() throws Throwable {

	}

	@Then("^I should be able to amend its record$")
	public void I_should_be_able_to_amend_its_record() throws Throwable {

	}

	@Given("^I set non-primary address record to inactive$")
	public void I_set_non_primary_address_record_to_inactive() throws Throwable {

	}

	@When("^I set the address type$")
	public void I_set_the_address_type() throws Throwable {

	}

	@When("^I set website/emails to Inactive$")
	public void I_set_website_emails_to_Inactive() throws Throwable {

	}

	@When("^I verify that dial code returns the right the value$")
	public void I_verify_that_dial_code_returns_the_right_the_value() throws Throwable {
	  
	}

	@When("^I verify that the first telephone number is set to primary$")
	public void I_verify_that_the_first_telephone_number_is_set_to_primary() throws Throwable {
	
	}

	@When("^I verify that department appears when adding salutaion$")
	public void I_verify_that_department_appears_when_adding_salutaion() throws Throwable {

	}

	@When("^I verify that Opt-Ins have a valid to is set when an opt-in value of Active is set to false$")
	public void I_verify_that_Opt_Ins_have_a_valid_to_is_set_when_an_opt_in_value_of_Active_is_set_to_false() throws Throwable {

	}

	@Then("^I shuold be able to get the desired result$")
	public void I_shuold_be_able_to_get_the_desired_result() throws Throwable {

	}

		//Business Sector
	
	@Given("^I am on the HRS CRM$")
	public void I_am_on_the_HRS_CRM() throws Throwable {
		//tb.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.BizSectorUrl);
	    tb.driver.manage().window().maximize();


	}

	@When("^I navigate to a Organisation record$")
	public void I_navigate_to_a_Organisation_record() throws Throwable {

	}

	@When("^I add a Business Sector$")
	public void I_add_a_Business_Sector() throws Throwable {
		tb.getObject(se.BizSectorLink).click();
		
		//Convert int to string
		 
		Random r = new Random();
		int a = r.nextInt(7);
		String str = ""+a;
		
	Select dropDown = new Select (tb.getObject(se.BizSectorTextFeild));
		dropDown.selectByValue(str);
		
		tb.getObject(se.BizSectorNote).sendKeys("THIS IS FOR TESTING PURPOSE ONLY NO DUPLICATES IS ALLOWED");
		tb.getObject(se.BizSectorAddBtn).click();
		
		Alert alert = tb.driver.switchTo().alert();
		alert.accept();
	}

	private void select(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	@When("^I amend a Business record$")
	public void I_amend_a_Business_record() throws Throwable {

	}

	@Then("^i should get a successfull message$")
	public void i_should_get_a_successfull_message() throws Throwable {

	
	}

	//Add Multiple Session
	
	@Given("^I am on the RHS CRM$")
	public void I_am_on_the_RHS_CRM() throws Throwable {
		
	}

	@When("^I navigate to the Course session$")
	public void I_navigate_to_the_Course_session() throws Throwable {

	}

	@When("^I edit Course Session$")
	public void I_edit_Course_Session() throws Throwable {

	}

	@Then("^I should get a  confirmation nmessage$")
	public void I_should_get_a_confirmation_nmessage() throws Throwable {

	}

	@Then("^I should be able to edit course session$")
	public void I_should_be_able_to_edit_course_session() throws Throwable {
	
	}

	
	
	}
























































































		
		 /*   

}	
				//Adding a New Person
	
	@Given("^I am on the CRM website$")
	public void I_am_on_the_CRM_website() throws Throwable {
		
		 
		 driver.manage().window().maximize();
	  
	}

	@When("^I navigate to registrations page$")
	public void I_navigate_to_registrations_page() throws Throwable {
		  getObject(se.EnterSearchCriteria).sendKeys("David");
		  getObject(se.PersonSearch).click();
		  getObject(se.AddNewPersonButton).click();
	   
	}

	@And("^I populate the registration form with valid data$")
	public void I_populate_the_registration_form_with_valid_data(DataTable table) throws Throwable {
		
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		
		 getObject(se.Fname).sendKeys(data.get(1).get(1));
		 getObject(se.Surname).sendKeys(data.get(2).get(1));
		 getObject(se.Preferedname).sendKeys(data.get(3).get(1));
	   
	}

	@Then("^I check that the form has been submitted$")
	public void I_check_that_the_form_has_been_submitted() throws Throwable {
		 getObject(se.SaveNewPersonButton).click();
		
		
	  
		//Adding a new Organization
	}
	@When("^I navigate to Org registrations page$")
	public void I_navigate_to_Org_registrations_page() throws Throwable {
		
		 driver.navigate().to(se.url);
		 driver.manage().window().maximize();
		   
	}
	

	@And("^I populate the form for Organsation$")
	public void I_populate_the_form_for_Organsation(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
	  
		 getObject(se.OrgName).sendKeys(data.get(1).get(1));
		 getObject(se.AbbOrgName).sendKeys(data.get(2).get(1));
		Select dropDown = new Select ( getObject(se.OrgReferer));
		dropDown.selectByVisibleText("Magazine");
//		 driver.quit();
	}

	@Given("^I am on the CRM page$")
	public void I_am_on_the_CRM_page() throws Throwable {
		driver.navigate().to(se.url);
	}

	@When("^I enter navigate to Advance Search$")
	public void I_enter_navigate_to_Advance_Search() throws Throwable {
		 getObject(se.AdvanceSearch).click();
	}

	@And("^I search with City/Town$")
	public void I_search_with_City_Town() throws Throwable {
		 getObject(se.AdvanceSearchCityTown).sendKeys("london");
		 getObject(se.PersonSearch).click();
		 
		
	}

	@And("^I search with Address Line (\\d+)$")
	public void I_search_with_Address_Line1(int arg1) throws Throwable {
		driver.navigate().to(se.url);
		 
		 getObject(se.AdvanceSearch).click();
		 getObject(se.AdvanceSearchAddressLine1).sendKeys("london");
		 getObject(se.PersonSearch).click();
		
		

	}

	@And("^I search with Address Lines (\\d+)$")
	public void I_search_with_Address_Lines2(int arg1) throws Throwable {
		driver.navigate().to(se.url);
		 
		 getObject(se.AdvanceSearch).click();
		 getObject(se.AdvanceSearchAddressLine2).sendKeys("london");
		 getObject(se.PersonSearch).click();
		 
	 
	}

	@And("^search with country$")
	public void search_with_country() throws Throwable {
		driver.navigate().to(se.url);
		 
		 getObject(se.AdvanceSearch).click();
		 getObject(se.AdvanceSearchCountrydropDwon).click();
		Thread.sleep(2000);
		 getObject(se.AdvanceSearchCountrySearchTextbox).sendKeys("Afghanistan");
		 getObject(se.AdvanceSearchCountrySearchTextbox).sendKeys(Keys.ENTER);
		 getObject(se.PersonSearch).click();
		 driver.quit();
		
	}

	@And("^I search with eamil$")
	public void I_search_with_eamil() throws Throwable {
		 
		 getObject(se.AdvanceSearch).click();
		 getObject(se.AdvanceSearchEmailAddress).sendKeys("test@gmail.com");
		 getObject(se.PersonSearch).click();
		 driver.quit();
		
	}

	@And("^I search with Social Media$")
	public void I_search_with_Social_Media() throws Throwable {
		 driver = new InternetExplorerDriver();
		 
		 getObject(se.AdvanceSearch).click();
		 getObject(se.AdvanceSearchSocialMedia).sendKeys("test@gmail.com");
		 getObject(se.PersonSearch).click();
		 driver.quit();
	 
	}

	@And("^I search with Telephone$")
	public void I_search_with_Telephone() throws Throwable {

	}

	@And("^I search with Display name$")
	public void I_search_with_Display_name() throws Throwable {
	   
	}

	@And("^I should get a matching result$")
	public void I_should_get_a_matching_result() throws Throwable {
	    
	}


	
	
}


*/




















