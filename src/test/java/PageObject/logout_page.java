package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Manage_Driver;

public class logout_page {
WebDriver driver;

public logout_page(){
this.driver = Manage_Driver.driver;
}
By Logout_link = By.linkText("Logout");

public void Click_Link(){
	driver.findElement(Logout_link).click();
}



}
