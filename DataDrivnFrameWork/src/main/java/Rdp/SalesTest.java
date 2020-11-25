package Rdp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SalesTest extends BaseClass {

	@BeforeClass
	public static void startBrowser() {
		BrowserInvoke("firefox", "https://developer.salesforce.com/");
	}

	@Test
	public void SalesTestDemo() throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SalesForcePageObjects SfObj = new SalesForcePageObjects(driver);
		SfObj.signUpBtn().click();
		
		//SfObj.emailTextBox().click();
		
		ExcelR readData= new ExcelR();
		String email = readData.ExcelRead_Email();
		String country=readData.ExcelRead_country();
		
		SfObj.emailTextBox().sendKeys(email);
		
		SfObj.emailTextBox().sendKeys(Keys.TAB);
		
		String msg = SfObj.alertNotifMsg().getText();
		System.out.println(msg);
		
		Select selectObj= new Select(SfObj.countryTextBox());
		selectObj.selectByValue(country);
		
		Thread.sleep(6000);
		SfObj.loginLink().click();
		Thread.sleep(9000);
		SfObj.rememberCheck().click();
		
		Screenshot();
	}

	@AfterClass
	public static void quitBrowser() {
		driver.quit();
	}
}
