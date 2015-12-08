package cucumberPageObject;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;




@RunWith(Cucumber.class)
@Cucumber.Options(
		
		
		format = {"pretty", "html:target/html/"},
		//format = {"pretty", "html:target/thml/", "json:target/Cucumber.json"}, 
		features = "src/features" , 
		tags = {" @AddNewPerson, @CreateNewCourse,@AddNewOrganisation,@AddNewTrainer, @BasicSearch, @AddNewVenue"})
public class RunnerClass {

}
  
  