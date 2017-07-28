package AutoTest.StepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObject.Datatable_page;
import PageObject.login_page;
import Utility.Manage_Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Login extends Manage_Driver {

	login_page login_steps = new login_page();
	Manage_Driver selected_browser = new Manage_Driver();

	@Before
	public void start_session() {
		selected_browser.set_driver("firefox");
		selected_browser.browser_setting();
	}

	@Given("^am on the \"([^\"]*)\" Page$")
	public void am_on_the_Page(String text) throws Throwable {
		switch (text) {
		case "Landing":
			login_steps.launch_browser();
			login_steps.assert_text("Login");
			break;
		case "Home":
			Thread.sleep(5000);
          login_steps.assert_text("Home");
			break;
			default:
				break;
		}
	}

	@Given("^I enter my \"([^\"]*)\" as \"([^\"]*)\"$")
	public void i_enter_my_as(String selector, String data) throws Throwable {
		switch (selector) {
		case "Username":
          login_steps.Username_textfield(data);
			break;
		case "Password":
          login_steps.Password_textfield(data);
			break;
			default:
				break;
		}
	}

	@When("^I click \"([^\"]*)\" button$")
	public void i_click_button(String button) throws Throwable {
		switch(button){
		case"Submit":
			login_steps.Click_submit_button();
			Thread.sleep(3000);
			break;
		case"Login":
			login_steps.Click_login_button();
			break;
			default:
				break;
		}
		}
         
	
	
	@After
	public void end_session() throws IOException{
		selected_browser.capturescreenshot();
		selected_browser.close_browser();
		
	}
}
