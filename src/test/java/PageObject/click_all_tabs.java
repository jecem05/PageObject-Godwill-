package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.Manage_Driver;

public class click_all_tabs {
	WebDriver driver;

	public click_all_tabs() {
		this.driver = Manage_Driver.driver;
	}

	By TradeYourJet_Tab = By.id("TradeYourJetTab");
	By BookYourJet_Tab = By.id("BookYourJetTab");
	By Just_Trade_Tab = By.id("JustTradeTab");
	By About_Us_Tab = By.id("AboutUsTab");
	By Contact_Support_Tab = By.cssSelector("#ContactSupportTab>a");
	By Confirm_Content_header = By.cssSelector(".content-header");

	public void click_trade_your_jet() throws InterruptedException {
		driver.findElement(TradeYourJet_Tab).click();
		//Thread.sleep(3000);  there is an  in the time the application waits 
	}

	public void click_book_your_jet() {
		driver.findElement(BookYourJet_Tab).click();

	}

	public void click_just_trade_jet() {
		driver.findElement(Just_Trade_Tab).click();
	}

	public void about_us_jet_tab() {
		driver.findElement(About_Us_Tab).click();
	}

	public void contact_us_jet_tab() throws InterruptedException {
		driver.findElement(Contact_Support_Tab).click();
		Thread.sleep(3000);
	}

	public void confirm_page(String text) throws InterruptedException {
		Thread.sleep(3000);
		String Actual_title = driver.findElement(Confirm_Content_header).getText();
		String Expected_title = text;
		Assert.assertEquals(Actual_title, Expected_title);
	}

}
