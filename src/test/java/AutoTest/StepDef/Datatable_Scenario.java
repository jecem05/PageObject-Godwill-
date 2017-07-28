package AutoTest.StepDef;

import org.openqa.selenium.WebDriver;

import PageObject.Datatable_page;
import Utility.Manage_Driver;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;

public class Datatable_Scenario{
WebDriver driver;
	
	public Datatable_Scenario(){
		this.driver = Manage_Driver.driver;
	}
	Datatable_page contact_us_page = new Datatable_page();

	@When("^I enter all contact support details$")
	public void i_enter_all_contact_support_details(DataTable contact_details) throws Throwable {
		contact_us_page.contact_us_filling_details(contact_details);
	}
}
