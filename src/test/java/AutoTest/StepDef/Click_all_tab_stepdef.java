package AutoTest.StepDef;

import org.openqa.selenium.WebDriver;

import PageObject.click_all_tabs;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Click_all_tab_stepdef {
	WebDriver driver;
	click_all_tabs click_steps = new click_all_tabs();

	@When("^I click on \"([^\"]*)\" tab$")
	public void i_click_on_tab(String tabs) throws Throwable {
		switch (tabs) {
		case "Trade Your Jet":
			click_steps.click_trade_your_jet();
			break;
		case "Book Your Jet":
			click_steps.click_book_your_jet();
			break;
		case "Just Trade":
			click_steps.click_just_trade_jet();
			break;
		case "About Us":
			click_steps.about_us_jet_tab();
			break;
		case "Contact Support":
			Thread.sleep(5000);
			click_steps.contact_us_jet_tab();
			Thread.sleep(2000);
			break;
		default:
			break;
		}

	}

	@Then("^\"([^\"]*)\" page should be displayed as \"([^\"]*)\"$")
	public void page_should_be_displayed_as(String page_displayed, String value) throws Throwable {
		switch (page_displayed) {
		case "Trade Your Jet":
			click_steps.confirm_page(value);
			break;
		case "Book Your Jet":
			click_steps.confirm_page(value);
			break;
		case "Just Trade":
			click_steps.confirm_page(value);
			break;
		case "About Us":
			click_steps.confirm_page(value);
			break;

		default:
			break;

		}
	}

}
