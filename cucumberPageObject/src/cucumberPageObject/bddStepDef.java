package cucumberPageObject;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.Log4j;
import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bddStepDef extends TestBase{
	TestBase tb = new TestBase();
	Selectors se = new Selectors();
	
	private static Logger Log = Logger.getLogger(bddStepDef.class.getName());

	public static void main(String[] args) {

		DOMConfigurator.configure("log4J.xml");}
	
	@Before
    public void BeforeTest() throws IOException{
		
      tb.initialize();    

}	
	//Adding a New Person

	@Given("^I am on the CRM website$")
	public void I_am_on_the_CRM_website() throws Throwable {
		final Logger logger = Logger.getRootLogger();
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		for(int Increment = 0;Increment<=5;Increment++){
			System.out.println("Count is  ==> " + Increment );}
		
		Log.info("New driver instantiated");
		
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
		
		Log.info("Web application launched");
	}

	@When("^I navigate to registrations page$")
	public void I_navigate_to_registrations_page() throws Throwable {
		 tb.getObject(se.EnterSearchCriteria).clear();
		 tb.getObject(se.EnterSearchCriteria).sendKeys("Tes");
		 tb.getObject(se.PersonSearch).click();
		 tb.getObject(se.AddNewPersonButton).click();
		 
		 Log.info("Click action performed on My Account link");
 
	}

	@And("^I populate the registration form with valid data$")
	public void I_populate_the_registration_form_with_valid_data(DataTable table) throws Throwable {
		
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		
		tb.getObject(se.Fname).sendKeys(data.get(1).get(1));
		tb.getObject(se.Surname).sendKeys(data.get(2).get(1));
		tb.getObject(se.Preferedname).sendKeys(data.get(3).get(1));
		
		//TitleDropDown
		 tb.getObject(se.TitleDrop).click();
		 tb.getObject(se.TitleTextFeild1).sendKeys("Admiral");
		 tb.getObject(se.TitleTextFeild1).sendKeys(Keys.ENTER);
		 
		 Log.info("Username entered in the Username text box");
		 
		//SourceDropDown		
		 Select dropDown = new Select (tb.getObject(se.PersonSource1));
		dropDown.selectByVisibleText("Leaflet");
		 
		 
		 tb.getObject(se.PersonAddressButton).click();
		 Thread.sleep(2000);
		 tb.getObject(se.PostCode).sendKeys("SE5 8NB");
		 Thread.sleep(1000);
		 tb.getObject(se.FindAddress).click();
		 Thread.sleep(5000);
		 tb.getObject(se.UseThisAddress).click();
		 Thread.sleep(2000);
		 tb.getObject(se.AddressType).click();
		 
		 
		 tb.getObject(se.Email).click();
		 Thread.sleep(2000);
		 
		 tb.getObject(se.PersonRegEmail).sendKeys("test@rhs.com");
		 
		//EmailTypeDropDown		
		 Select dropDown5 = new Select (tb.getObject(se.EmailType));
		dropDown5.selectByVisibleText("Home Address");
		
		//TelephoneSeesion
		tb.getObject(se.PersonRegTel).click();
		
		tb.getObject(se.Tel).sendKeys("0790293938484");
		tb.getObject(se.TelExt).sendKeys("7");
		
		//TelTypeDropDown		
		 Select dropDown6 = new Select (tb.getObject(se.TelType));
		dropDown6.selectByVisibleText("Home Number");
		Thread.sleep(1000);
		
		tb.getObject(se.CreateNewPersonBtn).click();
		
		Log.info("New Person is Created");
	
	   
	}

	@Then("^I check that the form has been submitted$")
	public void I_check_that_the_form_has_been_submitted() throws Throwable {
		
		Thread.sleep(5000);
		tb.driver.quit();

		
		//Adding a new Organization
	}
	@When("^I navigate to Org registrations page$")
	public void I_navigate_to_Org_registrations_page() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.OrgUrl);
		tb.driver.manage().window().maximize();
		   
	}
	

	@And("^I populate the form for Organsation$")
	public void I_populate_the_form_for_Organsation(DataTable table) throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
	  
		tb.getObject(se.OrgName).sendKeys(data.get(1).get(1));
		
		Select dropDown7 = new Select (tb.getObject(se.OrgSource));
		dropDown7.selectByVisibleText("Leaflet");
		tb.getObject(se.OrgAddress).click();
		tb.getObject(se.OrgPostCode).sendKeys("SE17 3SE");
		tb.getObject(se.OrgFindAddress).click();
		tb.getObject(se.OrgUsethisAddress).click();
		tb.getObject(se.OrgEmaillink).click();
		int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
		tb.getObject(se.OrgEmail).sendKeys("testers" + ran + "@rhs.com");
		Select dropDown8 = new Select (tb.getObject(se.OrgEmailDropDown));
		dropDown8.selectByVisibleText("Home Address");
		tb.getObject(se.OrgTelLink).click();
		tb.getObject(se.OrgTelTextFeild).sendKeys("0207039303030");
		tb.getObject(se.OrgTelExt).sendKeys("888");
		Select dropDown9 = new Select (tb.getObject(se.OrgTelType));
		dropDown9.selectByVisibleText("Home Number");
		tb.getObject(se.OrgCreateBtn).click();
	
		tb.driver.quit();
	}

	//AdvanceSearch
	
	@Given("^I am on the CRM page$")
	public void I_am_on_the_CRM_page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
	
	}

	@When("^I enter navigate to Advance Search$")
	public void I_enter_navigate_to_Advance_Search() throws Throwable {
		tb.getObject(se.AdvanceSearch).click();
	}

	@And("^I search with City/Town$")
	public void I_search_with_City_Town() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tb.getObject(se.AdvanceSearchCityTown).sendKeys("london");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for ", list.size() > 0);
		
		tb.getObject(se.SearchAgain).click();
		
		
		//Search For Address Line 1
		tb.getObject(se.AdvanceSearch).click();
		tb.getObject(se.AdvanceSearchAddressLine1).sendKeys("Flat 1, Welton Court");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list1 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
		
		//Saerch For Address Line 2
		tb.getObject(se.SearchAgain).click();
		tb.getObject(se.AdvanceSearch).click();
		tb.getObject(se.AdvanceSearchAddressLine2).sendKeys("2a Crofton Road");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list2 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
		
		//Search For A Country
		tb.getObject(se.SearchAgain).click();
		tb.getObject(se.AdvanceSearch).click();
		tb.getObject(se.AdvanceSearchCountrydropDwon).click();
		Thread.sleep(2000);
		tb.getObject(se.AdvanceSearchCountrySearchTextbox).sendKeys("United Kingdom");
		tb.getObject(se.AdvanceSearchCountrySearchTextbox).sendKeys(Keys.ENTER);
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list3 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
	   // tb.getObject(se.AdSearchView).click();
	    
		
		//Email Search
	  tb.getObject(se.SearchAgain).click();
	  tb.getObject(se.AdvanceSearch).click();
	  tb.getObject(se.AdvanceSearchEmailAddress).sendKeys("test@sdf.fgh");
	  tb.getObject(se.PersonSearch).click();
	  List<WebElement> list4 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
		

		//Social Media Search
	  tb.getObject(se.SearchAgain).click();
	  tb.getObject(se.AdvanceSearch).click();
	  tb.getObject(se.AdvanceSearchSocialMedia).sendKeys("www.facebook.com");
	  tb.getObject(se.PersonSearch).click();
	  List<WebElement> list5 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
		
	// Telephone Search
	  tb.getObject(se.SearchAgain).click();
	  tb.getObject(se.AdvanceSearch).click();
	  tb.getObject(se.AdSearchTel).sendKeys("03034335355454");
	  tb.getObject(se.PersonSearch).click();
	  List<WebElement> list6 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
	  
	  
	// Display Name Search
      tb.getObject(se.SearchAgain).click();
	  tb.getObject(se.AdvanceSearch).click();
	  tb.getObject(se.AdSearchDisplayName).sendKeys("User18180CFSG");
	  tb.getObject(se.PersonSearch).click();
	  List<WebElement> list7 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
	  
	// Customer ID Search
      tb.getObject(se.SearchAgain).click();
	  tb.getObject(se.AdvanceSearch).click();
	  tb.getObject(se.AdSearchCustomeID).sendKeys("User12062CFSG");
	  tb.getObject(se.PersonSearch).click();
	  List<WebElement> list8 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for", list.size() > 0);
  
	}

	@Then("^I should get a matching result$")
	public void I_should_get_a_matching_result() throws Throwable {
		tb.driver.quit();
	   
	}

	//AddPersonCommunication
	
	@When("^I navigate to communications$")
	public void I_navigate_to_communications() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
	
	}	
	
	@And("^I Add an eamil for a person$")
	public void I_Add_an_eamil_for_a_person() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("Richard Austin");
		tb.getObject(se.PersonSearch).click();
		tb.getObject(se.AdSearchView).click();
		tb.getObject(se.EmailLink).click();
		int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
		tb.getObject(se.CommEmailFeild).sendKeys("test" + ran + "@rhs.org.uk");
		Select dropDown10 = new Select (tb.getObject(se.CommEmailType));
		dropDown10.selectByVisibleText("Home Address");
		tb.getObject(se.CommAddbtn).click();
		
	}

	@And("^I add a website for a person$")
	public void I_add_a_website_for_a_person() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.CommWebSiteLink).click();
		int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
		tb.getObject(se.CommWebsiteTextFeild).sendKeys("www.rhs" + ran + ".com");
		Select dropDown11 = new Select (tb.getObject(se.CommWebsiteType));
		dropDown11.selectByVisibleText("Company Website");
		tb.getObject(se.CommWebsiteAddBtn).click();
		
	}

	@And("^I add a Tel for a person$")
	public void I_add_a_Tel_for_a_person() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.CommTelLink).click();
		Select dropDown12 = new Select (tb.getObject(se.commDialCode));
		//dropDown12.selectByVisibleText("Angola");
		dropDown12.selectByValue("3");
		int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
		tb.getObject(se.CommTelFeild).sendKeys("020799722" + ran + "00");
		tb.getObject(se.commTelExt).sendKeys("99");
		Select dropDown121 = new Select (tb.getObject(se.CommTelType));
		dropDown121.selectByVisibleText("Home Number");
		tb.getObject(se.CommTelAddbtn).click();
		
	}
	@And("^I add a social media for a person$")
	public void I_add_a_social_media_for_a_person() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.CommSocialMediaLink).click();
		int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
		tb.getObject(se.CommSocialMediatextFeild).sendKeys("www.facebook" + ran + "com");
		Select dropDown13 = new Select (tb.getObject(se.CommSocialMediaType));
		dropDown13.selectByVisibleText("Facebook");
		tb.getObject(se.SociaMediaAddBtn).click();
			  
	}
	
@And("^I add Address for a person$")
public void I_add_Address_for_a_person() throws Throwable {
	tb.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	tb.getObject(se.CommAddressLink).click();
	tb.getObject(se.AddCommAddress).click();
	//Thread.sleep(1000);
	 tb.getObject(se.CommPOSTCODE2).sendKeys("SE5 8NB");
	 Thread.sleep(1000);
	 tb.getObject(se.CommFindAddress2).click();
	 tb.getObject(se.CommUseThis2).click();
	 Thread.sleep(2000);
	 tb.getObject(se.CommAddressSaveBtn2).click();
	
  
}
	

	@Then("^I should be able to save person conmunications$")
	public void I_should_be_able_to_save_person_conmunications() throws Throwable {
	 
	}	
	

	//Add GE Note 
	
	@Given("^I am on CRM Home Pages$")
	public void I_am_on_CRM_Home_Page() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();

	}

	
          // OnlineAccountManagement
	
	@Given("^I am update customer page$")
	public void I_am_update_customer_page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
		
	}

	@When("^I navigate to online account$")
	public void I_navigate_to_online_account() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("Tes");
		tb.getObject(se.OrgSearchbtn).click();
		tb.getObject(se.OrgViewButton).click();
		tb.getObject(se.OnlineAccount).click();
	}

	@And("^I associate existing Online Account$")
	public void I_associate_existing_Online_Account() throws Throwable {
		//tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.SearchExistingUser).sendKeys("tes");
		Thread.sleep(3000);
		tb.getObject(se.SearchExitUserBtn).click();
		Thread.sleep(3000);
		tb.getObject(se.SelectOnlineAcc).click();
		tb.getObject(se.AddOnlineAccountBtn).click();

		tb.driver.quit();
	 
	}
	@And("^I Disassociate Online Account$")
	public void I_Disassociate_Online_Account() throws Throwable {
	
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("Tes");
		Thread.sleep(3000);
		tb.getObject(se.OrgSearchbtn).click();
		tb.getObject(se.OrgViewButton).click();
		tb.getObject(se.OnlineAccount).click();
		tb.getObject(se.DisassociateSchoolAccountbtn).click();
		//To click OK on popup dialog box
		Alert alert = tb.driver.switchTo().alert();
		alert.accept();
		
	 
	}

	@And("^I Update Online Account$")
	public void I_Update_Online_Account() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EditOnlineAccount).click();
		tb.getObject(se.OnlineAccFname).clear();
		int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
		tb.getObject(se.OnlineAccFname).sendKeys("Edit" + ran + "FName");
		tb.getObject(se.OnlineAccLname).clear();
		tb.getObject(se.OnlineAccLname).sendKeys("Edit" + ran + "LName");
		tb.getObject(se.UpdateOnlineAccBtn).click();
		tb.driver.quit();
	}
	

	@And("^I Edit Onlibe Account$")
	public void I_Edit_Onlibe_Account() throws Throwable {
;
	}

	@And("^I set primary account$")
	public void I_set_primary_account() throws Throwable {
		tb.driver = new InternetExplorerDriver(); 
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("bert");
		Thread.sleep(3000);
		tb.getObject(se.OrgSearchbtn).click();
		tb.getObject(se.OrgView3).click();
		tb.getObject(se.OnlineAcc2).click();
		Thread.sleep(3000);
     	tb.getObject(se.SetPrimaryAccount).click();
     	Thread.sleep(3000);
		tb.getObject(se.SetPrimaryAccount2).click();
		Thread.sleep(3000);

	
	}

	
	@And("^I enable Online Account$")
	public void I_enable_Online_Account() throws Throwable {
		
	 
	}

	
	@And("^I disable Online account$")
	public void I_disable_Online_account() throws Throwable {
	
	}	
	
	   //Basic Search
	
	@Given("^I am on the CRM HomePage$")
	public void I_am_on_the_CRM_HomePage() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
	 
	}

	@When("^I navigate to the search bar$")
	public void I_navigate_to_the_search_bar() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
	
	}

	@And("^I search by Person$")
	public void I_search_by_Person() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).sendKeys("bert");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for ", list.size() > 0);
		tb.getObject(se.SearchAgain).click();
		
		
		//Organisation Basic Search
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("Ernest Cook Trust");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list11 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for ", list.size() > 0);
		tb.getObject(se.SearchAgain).click();
		
		//School Basic Search
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("Breage Church of England School");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list12 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for ", list.size() > 0);
		tb.getObject(se.SearchAgain).click();
		
		//Address Line1 Basic Search
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("Flat 1, Welton Court");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list13 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for ", list.size() > 0);
		tb.getObject(se.SearchAgain).click();
		
		//Address Line2 Basic Search
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("2a Crofton Road");
		tb.getObject(se.PersonSearch).click();
		List<WebElement> list14 = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[3]/div"));
		Assert.assertTrue("You search for ", list.size() > 0);
		//tb.getObject(se.SearchAgain).click();
		

	}

	@Then("^I should get the corresponding result$")
	public void I_should_get_the_corresponding_result() throws Throwable {
	  
	}
	
	// @EnableCommunicationDetails
	
	
	@Given("^I am on the communication page$")
	public void I_am_on_the_communication_page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.TopRightSearchBar).sendKeys("14884");
		tb.getObject(se.IdSearch).click();
	   
	}

	@When("^I navigate to 'email address'$")
	public void I_navigate_to_email_address() throws Throwable {
		tb.getObject(se.CommunicationDetail2).click();
		tb.getObject(se.CommEmailLink2).click();
	 
	}
       
	@And("^I set 'email' to the primary address$")
	public void I_set_email_to_the_primary_address() throws Throwable {
		System.out.println("*********Setting Email Address has the Primary Email**********");
		tb.getObject(se.CommEmailRadioBtn).click();
		Thread.sleep(3000);
		tb.getObject(se.CommEmailRadioBtn2).click();
		Thread.sleep(3000);
		System.out.println("Email has been set has the primary email");
	   
	}

	@And("^I set 'Website' to the primary address$")
	public void I_set_Website_to_the_primary_address() throws Throwable {
		System.out.println("*********Setting Website Address has the Primary **********");
		tb.getObject(se.CommWebsiteLink2).click();
		tb.getObject(se.CommWebsiteRadioBtn).click();
		Thread.sleep(3000);
		tb.getObject(se.CommWebsiteRadioBtn2).click();
		Thread.sleep(3000);
		System.out.println("Website has been set has the primary email");
	
	}

	@And("^I set 'Tel' to the primary phone$")
	public void I_set_Tel_to_the_primary_phone() throws Throwable {
		System.out.println("*********Setting Tel has the Primary **********");
		tb.getObject(se.CommTelLink2).click();
		tb.getObject(se.CommtelRadioBtn).click();
		Thread.sleep(3000);
		tb.getObject(se.CommtelRadioBrn2).click();
		Thread.sleep(3000);
		System.out.println("Tel has been set has the primary email");
	 
	}

	@And("^I set 'Social Media' to the Primary address$")
	public void I_set_Social_Media_to_the_Primary_address() throws Throwable {
		System.out.println("*********Setting Social Media has the Primary **********");
		tb.getObject(se.CommSocialMediaLink2).click();
		tb.getObject(se.CommSMradioBtn).click();
		Thread.sleep(3000);
		tb.getObject(se.CommSMradioBtn2);
		Thread.sleep(3000);
		System.out.println("Social Media has been set has the primary email");
	
	}

	@Then("^details should be set.$")
	public void details_should_be_set() throws Throwable {
	 
	}

	//Relationship Management
	
	
	@Given("^I am on the Crm Home Page$")
	public void I_am_on_the_Crm_Home_Page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
	    
	}

	@When("^I navigate to Customer page$")
	public void I_navigate_to_Customer_page() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("bert");
		Thread.sleep(3000);
		tb.getObject(se.PersonSearch).click();
		tb.getObject(se.AdSearchView).click();
		tb.getObject(se.Relationshiptab).click();
	    
	}

	@And("^I add a 'Relationship'$")
	public void I_add_a_Relationship() throws Throwable {
		tb.getObject(se.Relationshiptab).click();
		Select dropDown14 = new Select (tb.getObject(se.RelationshipGroup));
		dropDown14.selectByValue("1");
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Select dropDown15 = new Select (tb.getObject(se.RelationshipType));
		dropDown15.selectByValue("1");
		tb.getObject(se.RelationshipWith).sendKeys("tes");
		Thread.sleep(3000);
		tb.getObject(se.relationshipSearchbtn).click();
		tb.getObject(se.RelationshipSelect).click();	
		tb.getObject(se.RelationshipNote).sendKeys("This is what I love to do to code like for fun and you are all invited to code with me");
		tb.getObject(se.RelationshipAddBtn).click();
		
	    
	}

	@And("^I edit a 'Relationship'$")
	public void I_edit_a_Relationship() throws Throwable {
		tb.getObject(se.EditRelationshipBtn).click();
		tb.getObject(se.RelationshipEditTextFeild).clear();
		tb.getObject(se.RelationshipEditTextFeild).sendKeys("I love Test, the Evil test");
		tb.getObject(se.RelationshipOkBtn).click();
	    
	}

	@And("^I cancel a 'Relatioship'$")
	public void I_cancel_a_Relatioship() throws Throwable {
	   
	}

	@Then("^I should be get a confirmation mesage$")
	public void I_should_be_get_a_confirmation_mesage() throws Throwable {
	    
	}

	
	//GE Note Management
	
	@Given("^I am on Communication Page$")
	public void I_am_on_Communication_Page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.url);
		tb.driver.manage().window().maximize();
	
	}

	@When("^I navigate to GE Note page$")
	public void I_navigate_to_GE_Note_page() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.EnterSearchCriteria).clear();
		tb.getObject(se.EnterSearchCriteria).sendKeys("bert");
		Thread.sleep(3000);
		tb.getObject(se.PersonSearch).click();
		tb.getObject(se.AdSearchView).click();
		Thread.sleep(3000);

	}

	@When("^I add a 'Note'$")
	public void I_add_a_Note() throws Throwable {
		Thread.sleep(3000);
		tb.getObject(se.NoteTabs).click();
		tb.getObject(se.AddNote).click();
		tb.getObject(se.NoteTextField).sendKeys("Automation Text Fields Adding Notes");
		tb.getObject(se.SaveNote).click();
		Thread.sleep(3000);

	}

	@When("^I edit a 'Note'$")
	public void I_edit_a_Note() throws Throwable {
		tb.getObject(se.EditNote).click();
		tb.getObject(se.NoteTextField).clear();
		tb.getObject(se.NoteTextField).sendKeys("Getting ready to edit notes"); 
		tb.getObject(se.SaveNote).click();
		Thread.sleep(3000);	

	}

	@When("^I cancel a 'Note'$")
	public void I_cancel_a_Note() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Then("^I should be get a confirmations mesages$")
	public void I_should_be_get_a_confirmations_mesages() throws Throwable {

	}
	
	
	//ZOO TESTING
	
	@Given("^I am on the zoo site$")
	public void I_am_on_the_zoo_site() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.navigate().to("http://freelancer.geekngamer.com/webapp");
		tb.driver.manage().window().maximize();
	}
	
	@And("^I check I am on  browser$")
	public void I_check_I_am_on_Adoption() throws Throwable {
		tb.driver.close();  
	}

	@When("^I click on ([^\"]*)$")
	public void I_click_on_link(String link) throws Throwable {
		tb.driver.findElement(By.id(link)).click();
		
	}

	@Then("^I check I am on  ([^\"]*)$")
	public void I_check_I_am_on_Home(String title) throws Throwable {
	   Assert.assertTrue(tb.driver.getTitle().contains(title));
	}
	
	//Create New Ad Hoc Document
	
	@Given("^I am on the RHS CRM Doc Site$")
	public void I_am_on_the_RHS_CRM_Doc_Site() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.AdDocUrl);
		tb.driver.manage().window().maximize();

	}

	@When("^I navigate to the Doc Creator page$")
	public void I_navigate_to_the_Doc_Creator_page() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.CreateNewtemplate).click();

	}

	@And("^I fill out the required feilds$")
	public void I_fill_out_the_required_feilds(DataTable table) throws Throwable {
		    tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			List<List<String>> data = table.raw();
			System.out.println(data.get(1).get(1));
			tb.getObject(se.DocName).sendKeys(data.get(1).get(1));
			tb.getObject(se.DocNote).sendKeys(data.get(2).get(1));
			tb.getObject(se.DocumentCode).clear();
			
			int ran = 100 + (int)(Math.random() * ((100 - 1) + 1));
			tb.getObject(se.DocumentCode).sendKeys("DOC" + ran + "CODE");
			
			
			//Documents DropDown
			
		Select dropDown15 = new Select (tb.getObject(se.TempTopic));
			dropDown15.selectByValue("1");
		    
			Select dropDown16 = new Select (tb.getObject(se.DocType));
			dropDown16.selectByValue("1");
			
			Select dropDown17 = new Select (tb.getObject(se.DocFormat));
			dropDown17.selectByValue("1");
			
			Select dropDown18 = new Select (tb.getObject(se.DocDeprtment));
			dropDown18.selectByValue("1");
		    
			Select dropDown19 = new Select (tb.getObject(se.DocMergeHeaderType));
			dropDown19.selectByValue("1");
			
			Select dropDown11 = new Select (tb.getObject(se.DocTempSubTop));
			dropDown11.selectByValue("1");
			
			tb.getObject(se.DocCreateNewTemplate).click();
				    
	}

	@Then("^I should be able to create a new doc template$")
	public void I_should_be_able_to_create_a_new_doc_template() throws Throwable {
		tb.driver.quit();
	
	}
	
	//Create Ad Hoc Document	
	@Given("^I am RHS CRM Ad Doc Page$")
	public void I_am_RHS_CRM_Ad_Doc_Page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.AdDocUrl);
		tb.driver.manage().window().maximize();
	}
	@When("^I navigate to 'Document paeg'$")
	public void I_navigate_to_Document_paeg() throws Throwable {
		tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		tb.getObject(se.SearchCRM).clear();
		tb.getObject(se.SearchCRM).sendKeys("12");
		tb.getObject(se.CRMID).click();
		tb.getObject(se.CreateAdHocDocButton).click();
		
		Select dropDown11 = new Select (tb.getObject(se.CreateDocDocFormat));
		dropDown11.selectByVisibleText("Email Format");
		
		Select dropDown12 = new Select (tb.getObject(se.SelectAddress));
		dropDown12.selectByIndex(1);
		tb.getObject(se.CreateDocWizardNextButton).click();
		tb.getObject(se.UseThisButton).click();
		tb.getObject(se.SaveChangesbutton).click();
		tb.getObject(se.CancelButton).click();
	           
	}

	@And("^I fill the Document details$")
	public void I_fill_the_Document_details() throws Throwable {
	    
	}

	@Then("^I should be able to create 'New Ad Hoc Doc'$")
	public void I_should_be_able_to_create_New_Ad_Hoc_Doc() throws Throwable {
		tb.driver.quit();
	    
	}

	
//Create New Course
	

@Given("^I am RHS CRM$")
public void I_am_RHS_CRM() throws Throwable {
	tb.driver = new InternetExplorerDriver();
	tb.driver.get(se.CourseUrl);
	tb.driver.manage().window().maximize();

}

@When("^I navigate to 'Course' Session$")
public void I_navigate_to_Course_Session() throws Throwable {

}

@And("^I fill the course Main details$")
public void I_fill_the_course_Main_details(DataTable table) throws Throwable {
    tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		tb.getObject(se.CourseCode).sendKeys(data.get(1).get(1));
		tb.getObject(se.CourseTitle).sendKeys(data.get(2).get(1));
		tb.getObject(se.CourseSummary).sendKeys(data.get(3).get(1));
		tb.getObject(se.WebImgUrl).sendKeys(data.get(4).get(1));
		tb.getObject(se.CourseLearningOutcome).sendKeys(data.get(5).get(1));
		tb.getObject(se.CourseLearningOutcome).sendKeys(Keys.ENTER);
		tb.getObject(se.CourseAddictionalInfo).sendKeys(data.get(6).get(1));
		Select dropDown1 = new Select (tb.getObject(se.CourseType));
		dropDown1.selectByValue("2");
		Select dropDown2 = new Select (tb.getObject(se.CourseSkillLevel));
		dropDown2.selectByValue("2");
		Select dropDown3 = new Select (tb.getObject(se.CourseKeyStage));
		dropDown3.selectByValue("2");
		tb.getObject(se.CourseMultiSession).click();
		tb.getObject(se.CoursePartnerOrg).click();
		tb.getObject(se.CourseMainDetailsNextButton).click();   
		tb.getObject(se.CourseDateLocationTab).click();
}

@And("^I fill Out Date/Location$")
public void I_fill_Out_Date_Location(DataTable table) throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		tb.getObject(se.CourseDateLocationTab).click();
//		WebElement calElement=tb.getObject(se.CourseStartDate);
//		calElement.click();
//		selectDatefromMultiDate("4");
		tb.getObject(se.CourseCalendar).click();
		tb.getObject(se.CourseStartdateToday).click();
		tb.getObject(se.CourseEndDate).click();
		tb.getObject(se.CourseEndDateToday).click();
		tb.getObject(se.CourseBookingCloseDate).click();
		tb.getObject(se.CourseBookingCloseDateToday).click();
		Select dropDown3 = new Select (tb.getObject(se.CourseVenue));
		dropDown3.selectByValue("2");
		tb.getObject(se.CourseWebVenueDesc).sendKeys("This is The RHS Website testing");
		Select dropDown4 = new Select (tb.getObject(se.CourseRegion));
		dropDown4.selectByValue("2");
		tb.getObject(se.CourseDateLocatnNextbutton).click();
		
		Thread.sleep(1000);
		//And I fill Out Capacity
		tb.getObject(se.CourseMaxBooking).sendKeys("12");
		tb.getObject(se.CourseMaxBooking).clear();
		tb.getObject(se.CourseMaxBooking).sendKeys("12");
		//tb.getObject(se.CourseCurrentBooking).clear();
		Thread.sleep(2000);
		tb.getObject(se.CourseCapacityNextButton).click();
		tb.getObject(se.AddNewSession).click();
}

@And("^I fill Out Session$")
public void I_fill_Out_Session(DataTable table) throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		tb.getObject(se.CourseSessionTitle).sendKeys(data.get(1).get(1));
		tb.getObject(se.CourseSessionStartDate).click();
		tb.getObject(se.CourseSessionStartDateToday).click();
		tb.getObject(se.CourseSessionEndDate).click();
		tb.getObject(se.CourseSessionEndDateToday).click();
		tb.getObject(se.CourseMaxPaidBooking).sendKeys(data.get(2).get(1));
		tb.getObject(se.CourseMaxComplimentaryBooking).sendKeys(data.get(3).get(1));
		Thread.sleep(2000);
		Select dropDown4 = new Select (tb.getObject(se.CoursePrimaryTrainer));
		dropDown4.selectByValue("2");
		Thread.sleep(2000);
		Thread.sleep(1000);
		tb.getObject(se.TicketPriceTab).click();
		Thread.sleep(2000);
		tb.getObject(se.AddNewTicketPrice).click();
}

@And("^I fill Out Ticket TicketPrice$")
public void I_fill_Out_Ticket_TicketPrice(DataTable table) throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
	 tb.getObject(se.CosDesc).sendKeys(data.get(1).get(1));
	 tb.getObject(se.CosPrice).sendKeys(data.get(2).get(1));
	 tb.getObject(se.CosEarlyDisc).sendKeys(data.get(3).get(1));
	 tb.getObject(se.EarlyBirdValidToDate).click();
	 tb.getObject(se.EarlyBirdToday).click();
	 tb.getObject(se.CosMultiBkDisc).sendKeys(data.get(4).get(1));
	 driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[3]/div[3]/div/input")).sendKeys("0");
	 //tb.getObject(se.CosMultiBkDisc).sendKeys(Keys.ENTER);
	 tb.getObject(se.CosMultiBKThread).clear();
	 tb.getObject(se.CosMultiBKThread).sendKeys(data.get(5).get(1));
	 //Thread.sleep(3000);
	 Select dropDown4 = new Select (tb.getObject(se.CostCentreAccount));
		dropDown4.selectByVisibleText("Education");
		 //Thread.sleep(1000);
		Select dropDown2 = new Select (tb.getObject(se.SubCostCenterAccount));
		dropDown2.selectByVisibleText("National");
		Select dropDown3 = new Select (tb.getObject(se.RestrictedFund));
		dropDown3.selectByVisibleText("Education Course Restricted Fund");
		Thread.sleep(1000);
	 //tb.getObject(se.CosTicketPriceNextButton).click(); 
	 Thread.sleep(1000);
	 tb.getObject(se.AddCourseButton).click();
}

@Then("^I should be able to Create a Course$")
public void I_should_be_able_to_Create_a_Course() throws Throwable {
	tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Thread.sleep(5000);
	tb.driver.quit();

}

		//Add New Trainer


@Given("^I am on the HRS CRM website$")
public void I_am_on_the_HRS_CRM_website() throws Throwable {
	tb.driver = new InternetExplorerDriver();
	tb.driver.get(se.AddTrainerUrl);
	tb.driver.manage().window().maximize();
}
 


@When("^I navigate to trainer's page$")
public void I_navigate_to_Venue_page() throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 tb.getObject(se.AddTrainerButton).click();
}

@When("^I populate the form for Trainers$")
public void I_populate_the_form_for_Venue(DataTable table) throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
	tb.getObject(se.SearchTrainer).sendKeys(data.get(1).get(1));
	tb.getObject(se.SearchButton).click();
	tb.getObject(se.SelecttrainerButton).click();
	tb.getObject(se.TrainerName).clear();
	tb.getObject(se.TrainerName).sendKeys(data.get(2).get(1));
	 Select dropDown2 = new Select (tb.getObject(se.QCFLevel));
		dropDown2.selectByValue("3");
		Select dropDown3 = new Select (tb.getObject(se.Qualification));
			dropDown3.selectByVisibleText("Qualified to be an external assessor");
		
	 tb.getObject(se.AdditionalWorkDetails).sendKeys(data.get(3).get(1));
	 tb.getObject(se.TrainersNote).sendKeys(data.get(4).get(1));
    tb.getObject(se.IsAvailable).click();
    tb.getObject(se.Ok).click();
}

@Then("^I new trainer should be added$")
public void I_new_venue_should_be_added() throws Throwable {
	tb.driver.quit();
    
}
//Add New Venue

@Given("^I am on the HRS CRM websites$")
public void I_am_on_the_HRS_CRM_websites() throws Throwable {
	tb.driver = new InternetExplorerDriver();
	tb.driver.get(se.AddVenueUrl);
	tb.driver.manage().window().maximize();
}
 

@When("^I navigate to Venue pages$")
public void I_navigate_to_Venue_pages() throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 tb.getObject(se.AddVenuButton).click();
}

@When("^I populate the form for Venues$")
public void I_populate_the_form_for_Venues() throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 tb.getObject(se.VenueOrgSearch).click();
	 tb.getObject(se.VenueSearchField).sendKeys("Lindal");
	 Thread.sleep(1000);
	 tb.getObject(se.VenueSearchField).sendKeys(Keys.ENTER);
	 Thread.sleep(1000);
	 tb.getObject(se.SaveVenueButton).click();
	 List<WebElement> list = tb.driver.findElements(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/h4"));
	 Assert.assertTrue("Lindal and Marton Primary School ", list.size() > 0);
	 

	 
}

@Then("^I new venue should now be added$")
public void I_new_venue_should_now_be_added() throws Throwable {
	tb.driver.quit();
	
   
	
	//File Upload
}

@Given("^I am on the Trainers page$")
public void I_am_on_the_Trainers_page() throws Throwable {
		tb.driver = new InternetExplorerDriver();
		tb.driver.get(se.AddTrainerUrl);
		tb.driver.manage().window().maximize();
 
}

@When("^I navigate to Upload seesion$")
public void I_navigate_to_Upload_seesion() throws Throwable {
	tb.getObject(se.TrainerMainDetails).click();

}

@And("^I upload a file$")
public void I_upload_a_file() throws Throwable {
	tb.getObject(se.UploadDoc).click();
	
//tb.getObject(se.SelectFileToUpload);
	//WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
	WebElement fileInput = tb.getObject(se.SelectFileToUpload);
	//fileInput.sendKeys("C:/path/to/file.jpg");
//fileInput.sendKeys("C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg");
	fileInput.sendKeys("//vsstorage/home/georgeuwah/CFSG_Test_Strategy.docx");

}

@Then("^I should be able to upload a file$")
public void I_should_be_able_to_upload_a_file() throws Throwable {
    
}











//Right Move

@Given("^I am on the Rightmove website$")
public void I_am_on_the_Rightmove_website() throws Throwable {
	tb.driver = new InternetExplorerDriver();
	//tb.driver = new FirefoxDriver();
	tb.driver.get(se.RMUrl);
	tb.driver.manage().window().maximize();
  
}

@When("^I do a search with some criteria$")
public void I_do_a_search_with_some_criteria() throws Throwable {
	 tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 tb.getObject(se.SearchBar).sendKeys("Waterloo");
	 tb.getObject(se.forSale).click(); 
	 
	//Select dropDown= new Select (tb.getObject(se.ChooseLocation));
		//dropDown.selectByValue("2");
	 
	// tb.getObject(se.ChooseLocation).click();
	 tb.getObject(se.ChooseLocation).sendKeys(Keys.ENTER);
		
	Select dropDown1= new Select (tb.getObject(se.SearchRadius));
		dropDown1.selectByValue("3");
	
	Select dropDown2= new Select (tb.getObject(se.PriceRangeMinPrice));
		dropDown2.selectByValue("5");
		
	Select dropDown3= new Select (tb.getObject(se.PriceRangeMaxPrice));
		dropDown3.selectByValue("7");
		
	Select dropDown4= new Select (tb.getObject(se.NoOfBedMin));
		dropDown4.selectByValue("3");
		
	Select dropDown5= new Select (tb.getObject(se.NoOfBedMax));
		dropDown5.selectByValue("5");
		
	Select dropDow6= new Select (tb.getObject(se.PropertyType));
		dropDow6.selectByValue("3");
		
	Select dropDown7= new Select (tb.getObject(se.AddedSite));
		dropDown7.selectByValue("3");
	tb.getObject(se.IncludeUnderRadio).click();
	tb.getObject(se.FindPropertyBtn).click();
	
}

@And("^I Click through to an individual property$")
public void I_Click_through_to_an_individual_property() throws Throwable {
	
   
}

@Then("^I should be able to Verify the property details page$")
public void I_should_be_able_to_Verify_the_property_details_page() throws Throwable {
   
}

	
	


}
























