package Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Manage_Driver {

	public static WebDriver driver;

	public void set_driver(String browser) {
		if (driver == null) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			}
		}
	}

	public void browser_setting() {
     driver.manage().window().maximize();
	}
	public void close_browser(){
		driver.quit();
		driver = null;
	}
	
	public void capturescreenshot() throws IOException{
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		File MyFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(MyFile, new File("C:\\Users\\user\\Desktop\\PageObjectDesign_Day_2\\Page-Object-Design-Pattern\\target\\screenshot" + timeStamp + ".png"));
	}

}
