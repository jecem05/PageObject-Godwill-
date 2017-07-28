package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Manage_Driver;
import cucumber.api.DataTable;

public class Datatable_page {
	
	WebDriver driver;
	
	public Datatable_page(){
		this.driver = Manage_Driver.driver;
	}
	
	By Table_0 = By.id("q1");
	By Table_1 = By.id("q2");
	By Table_2 = By.id("q3");
	By Table_3 = By.id("q8");
	By Table_4 = By.id("q9");
	By Table_5 = By.id("q10");
	By Table_6 = By.id("q11");

	
	public void contact_us_filling_details(DataTable contact_details) throws InterruptedException{
		List<List<String>>  data = contact_details.raw();
		driver.findElement(Table_0).sendKeys(data.get(0).get(0)); 
	    driver.findElement(Table_1).sendKeys(data.get(0).get(1));
	    driver.findElement(Table_2).sendKeys(data.get(0).get(2));
	    driver.findElement(Table_3).sendKeys(data.get(0).get(3));
	    driver.findElement(Table_4).sendKeys(data.get(0).get(4));
	    driver.findElement(Table_5).sendKeys(data.get(0).get(5));
	    driver.findElement(Table_6).sendKeys(data.get(0).get(6));
	}
	
}
