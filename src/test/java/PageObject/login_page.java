package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utility.Manage_Driver;

public class login_page extends Manage_Driver {
	
	By Username = By.id("usernamelogin");
	By Password = By.id("loginPassword");
	By Login_Button = By.id("LoginBtn");
	By Submit_Button = By.id("a1");
	
	
	public void launch_browser(){
		driver.get("http://automatetillinfinity.co.uk/");
	}
	public void Username_textfield(String text){
		driver.findElement(Username).sendKeys(text);
	}
	public void Password_textfield(String text){
		driver.findElement(Password).sendKeys(text);
	}
	public void Click_login_button() throws InterruptedException{
		driver.findElement(Login_Button).click();
	}
	public void assert_text(String text){
		String Main_title = driver.getTitle();
		String Expected_Title = text;
		Assert.assertEquals(Main_title, Expected_Title);
	}
	public void Click_submit_button() {
		driver.findElement(Submit_Button).click();
	}
}
