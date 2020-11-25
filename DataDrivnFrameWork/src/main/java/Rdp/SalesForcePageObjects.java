package Rdp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesForcePageObjects {

	WebDriver driver;

	public SalesForcePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By signUpBtn = By.partialLinkText("Sign Up");
	By emailTextBox = By.xpath("//input[@id='email']");
	By alertNotifMsg = By.xpath("//div[contains(text(),'Please enter a valid email address')]");
	By countryTextBox = By.id("country");//dropdown select class
	By loginLink = By.linkText("Log In");
	By rememberCheck = By.xpath("//label[contains(text(),'Remember me')]");
	
	public WebElement signUpBtn() {
		return driver.findElement(signUpBtn);
	}

	public WebElement emailTextBox() {
		return driver.findElement(emailTextBox);
	}

	public WebElement alertNotifMsg() {
		return driver.findElement(alertNotifMsg);
	}

	public WebElement countryTextBox() {
		return driver.findElement(countryTextBox);
	}

	public WebElement loginLink() {
		return driver.findElement(loginLink);
	}

	public WebElement rememberCheck() {
		return driver.findElement(rememberCheck);
	}
}