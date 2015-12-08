package features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberPageObject.Selectors;
import cucumberPageObject.TestBase;

public class multiSession extends TestBase {
	TestBase tb = new TestBase();
	Selectors se = new Selectors();
	 public int ran;
	

@Given("^I am on the RHS CRM Course Session Page$")
public void I_am_on_the_RHS_CRM_Course_Session_Page() throws Throwable {
	tb.driver = new InternetExplorerDriver();
	tb.driver.get(se.CourseSessionUrl);
	tb.driver.manage().window().maximize();

 
}

@When("^click my Course button$")
public void click_my_Course_tab() throws Throwable {

}

@When("^I navigate to Course sessions$")
public void I_navigate_to_Course_session() throws Throwable {
	tb.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[1]/ul/li[4]/a")).click();
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[1]/h4/a/b")).click();
		
}

//driver.findElement(By.name("email_address")).sendKeys("maxwell" + ran + "@gmail.com");
@And("^I enter ([^\"]*) in coursetitle fields$")
public void I_enter_session_five_in_coursetitle_field(String coursetitle) throws Throwable {
	ran = 100 + (int)(Math.random() * ((1000 - 1) + 1));
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[1]/div/input")).sendKeys(coursetitle + ran);
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[2]/div/span/button")).click();
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[2]/div/ul/li[2]/span/button[1]")).click(); 
}

@And("^I enter ([^\"]*) in max fields$")
public void I_enter_in_max_field(String max) throws Throwable {
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[6]/div/input")).sendKeys(max);
  
}

@And("^I enter([^\"]*) in maxComp fields$")
public void I_enter_in_maxComp_field(String maxComp) throws Throwable {
	driver.findElement(By.xpath(".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[7]/div/input")).sendKeys(maxComp);
	Select dropDown9 = new Select (tb.getObject(se.primaryTrainer));
	dropDown9.selectByVisibleText("Anne Gunning");
	tb.getObject(se.CosSessionSaveButton).click();
}

@Then("^I should be able to add multiple sessions$")
public void I_should_be_able_to_add_multiple_session() throws Throwable {
 
}

}
