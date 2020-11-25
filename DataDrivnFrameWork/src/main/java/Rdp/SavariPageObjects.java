package Rdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SavariPageObjects {

	WebDriver driver;

	public SavariPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By oneWayTrip = By.xpath("//span[contains(text(),'One Way')]");
	By fromTextbox = By.xpath("//input[@id='fromCityList']");
	By toText = By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']");
	By dynamic = By.xpath("//span[contains(text(),'Chennai')]");
	By dateTab = By.id("//body/app-root[@id='approot']/mat-sidenav-container[1]/mat-sidenav-content[1]/app-home[1]/div[1]/div[2]/div[2]/app-outstation[1]/div[1]/form[1]/div[3]/div[1]/div[1]/p-calendar[1]/span[1]/input[1]");
	By date = By.id("//tbody/tr[1]/td[1]/a[1]");
	By timeTab = By.id("pickUpTime");// dropdown select class
	By time = By.id("pickUpTime");// select class
	By selectCar = By.xpath("//button[contains(text(),'Select Car')]");

	public WebElement oneWayTrip() {
		return driver.findElement(oneWayTrip);
	}

	public WebElement fromTextbox() {
		return driver.findElement(fromTextbox);
	}

	public WebElement toText() {
		return driver.findElement(toText);
	}

	public WebElement dynamic() {
		return driver.findElement(dynamic);
	}

	public WebElement dateTab() {
		return driver.findElement(dateTab);
	}

	public WebElement date() {
		return driver.findElement(date);
	}

	public WebElement timeTab() {
		return driver.findElement(timeTab);
	}

	public WebElement time() {
		return driver.findElement(time);
	}

	public WebElement selectCar() {
		return driver.findElement(selectCar);
	}
}
