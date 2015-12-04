package crm.cucumberFramework.Venue_Management_Mvn_Proj;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty", "html:target/html/"},
		features = "src/test/resource",
		tags = {" @VenueEnq"})
public class RunnerTest {

}
