package Rdp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SavariT extends BaseClass {

	@BeforeClass
	public static void startBrowser() {
		BrowserInvoke("firefox", "https://www.savaari.com/");
	}

	@Test
	public void SalesTestDemo() throws IOException, InterruptedException {

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SavariPageObjects SfObj = new SavariPageObjects(driver);
		//SfObj.oneWayTrip().click();
		
		//SfObj.emailTextBox().click();
		
		ExcelR readData= new ExcelR();
		String from = readData.ExcelRead_Email();
		String to= readData.ExcelRead_country();
		
		SfObj.fromTextbox().sendKeys(from);		
		SfObj.toText().sendKeys(to);
		SfObj.dynamic().click();	
		//SfObj.toText().sendKeys(Keys.TAB);
		SfObj.dateTab().click();		
		SfObj.date().click();
		Thread.sleep(2000);
		
		Select selObj = new Select(SfObj.timeTab());
		selObj.selectByValue("8.45 AM");
		
		
		Screenshot();
	}

	@AfterClass
	public static void quitBrowser() {
		driver.quit();
	}
}
