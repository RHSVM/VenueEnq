package crm.cucumberFramework.Venue_Management_Mvn_Proj;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class userLogin extends testBase {
	
	//WebDriver driver =getDriver();

	@When("^I enter ([^\"]*) in email field$")
	public void enterUsername(String username) throws Throwable {
	 driver.findElement(By.name("email_address")).sendKeys(username);   
	}
	
	@When("^I enter ([^\"]*) in password field$")
	public void enterPassword(String password) throws Throwable { 
	 driver.findElement(By.name("password")).sendKeys(password);  
	}
	
	@When("^I click Login button$")
	public void I_click_Login_button() throws Throwable {
		driver.findElement(By.id("tdb5")).click();
		Thread.sleep(3000);
		
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScrFile, new File("c:\\Screenshots\\Login.jpg"));
	}
	@Then("^I am logged in$")
	public void I_am_logged_in() throws Throwable {
		Assert.assertEquals("My Account Information", driver.findElement(By.cssSelector("h1")).getText());
		Thread.sleep(2000);
	}
}
