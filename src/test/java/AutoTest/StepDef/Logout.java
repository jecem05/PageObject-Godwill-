package AutoTest.StepDef;

import org.openqa.selenium.WebDriver;

import PageObject.logout_page;
import cucumber.api.java.en.When;

public class Logout {
	WebDriver driver;
	
	logout_page logout_steps = new logout_page();
	
	
	@When("^I click \"([^\"]*)\" link$")
	public void i_click_link(String arg1) throws Throwable {
	    logout_steps.Click_Link();
	}
}
