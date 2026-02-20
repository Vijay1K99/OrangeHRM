package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;

	LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//img[@src='/web/images/ohrm_branding.png?v=1721393199309']")
	WebElement hrmLogo;

	@FindBy(xpath = "//input[@name='username']")
	WebElement usernameField;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	WebElement loginBtn;

	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
	WebElement forgotBtn;

	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	WebElement aboutHrm;

	// Page Action
	
	
	public void HRMlogo(String logo) {
		hrmLogo.isDisplayed();
	}
	
	public void usernameField(String user) {
		usernameField.sendKeys("Admin");
	}
	

}
