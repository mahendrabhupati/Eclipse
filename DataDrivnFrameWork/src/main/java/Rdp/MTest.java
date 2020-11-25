package Rdp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class MTest extends BaseClass {

	@BeforeClass
	public static void startBrowser() {
		BrowserInvoke("firefox", "https://www.marshallspetzone.com/");
	}

	@Test
	public void TestStart() throws InterruptedException, IOException {
		// driver =BrowserInvoke("firefox", "https://www.marshallspetzone.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MarshalPObjs MPObj = new MarshalPObjs(driver);
		MPObj.dogCatg().click();// Select Dog Category Tab
		MPObj.secPdtCatg().click();// select Toys category
		Thread.sleep(6000);
		MPObj.inStockCBox().click(); // Select InStock CheckBox
		Thread.sleep(6000);
		MPObj.selPdt().click(); // Select product
//		Thread.sleep(6000);
		String productName = MPObj.selPdt().getText();
		System.out.println(productName);
		
		
		ExcelW writedata =new ExcelW();
		writedata.setCellData(productName,1,0);
//		Thread.sleep(6000);
		MPObj.add2CartBtn().click();
//		Thread.sleep(6000);
		System.out.println("Product Added to cart");
		MPObj.Proceed2COut().click();
		
		ExcelR readData= new ExcelR();
		String compare= readData.ExcelRead_Email();
		System.out.println(compare); 
		Assert.assertEquals(productName, compare);//Aserting
		System.out.println("Stored value from excel file And product in checkout are equal");
		
	}

	@AfterClass
	public static void quitBrowser() {
		driver.quit();
	}
}
