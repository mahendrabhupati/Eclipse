package Rdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MarshalPObjs {


	WebDriver driver;

	public MarshalPObjs(WebDriver driver) {
		this.driver = driver;
	}

	By dogCatg = By.xpath("//li[@id='cbp-hrmenu-tab-20']//a//span[@class='cbp-tab-title']");
	By secPdtCatg = By.linkText("Toys");
	By inStockCBox = By.partialLinkText("In stock");
	By selPdt = By.linkText("Nootie 4 Knot Single Rope Toys For Dogs Multicolor");
	By add2CartBtn = By.xpath("//div[@class='add']/button[@class='btn btn-primary btn-lg add-to-cart']");
	By Proceed2COut = By.linkText("Proceed to checkout");
	By checkOutpageData = By.linkText("Nootie 4 Knot Single Rope Toys For Dogs Multicolor");
	By contnShopping = By.linkText("Continue shopping");

	public WebElement dogCatg() {
		return driver.findElement(dogCatg);
	}

	public WebElement secPdtCatg() {
		return driver.findElement(secPdtCatg);
	}

	public WebElement inStockCBox() {
		return driver.findElement(inStockCBox);
	}

	public WebElement selPdt() {
		return driver.findElement(selPdt);
	}

	public WebElement add2CartBtn() {
		return driver.findElement(add2CartBtn);
	}

	public WebElement Proceed2COut() {
		return driver.findElement(Proceed2COut);
	}

	public WebElement contnShopping() {
		return driver.findElement(contnShopping);
	}

	public WebElement checkOutpageData() {
		return driver.findElement(checkOutpageData);
	}
}
