package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import utilities.Constants;
import utilities.ExcelUtility;

public class UsingExcel {
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", 
				"/Users/atomar/Documents/workspace_personal/libs/geckodriver");
		driver = new FirefoxDriver();
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constants.URL);
		driver.findElement(By.xpath("//div[@class='header-links single-row-nav']//a[@class='hide-menu'][contains(text(),'LOGIN')]")).click();
		// Click login button
		driver.findElement(By.xpath("//div[@id='navbar']//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		// Tell the code about the location of Excel file
		ExcelUtility.setExcelFile(Constants.File_Path + Constants.File_Name, "LoginTests");
	}
	
	@DataProvider(name = "loginData")
	public Object[][] dataProvider() {
		Object[][] testData = ExcelUtility.getTestData("Invalid_Login");
		return testData;
	}

	@Test(dataProvider="loginData")
	public void testUsingExcel(String username, String password) throws Exception {
		// Enter username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		// Enter password
		driver.findElement(By.xpath("//input[@placeholder='Password']d")).sendKeys(password);
		// Click Login button
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		
		// Find if error messages exist
		boolean result = driver.findElements(By.xpath("//form[@id='new_user']//div[3]")).size() != 0;
		Assert.assertTrue(result);
	}
	
	@AfterClass
	public void tearDown() throws Exception {
	    driver.quit();
	}
}