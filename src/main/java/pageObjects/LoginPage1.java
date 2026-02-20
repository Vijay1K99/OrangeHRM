package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage1 extends BasePage1 {
	
    public LoginPage1(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@id='divLogo']/img")
	private WebElement hrmLogo;

	@FindBy(name = "txtUsername")
	private WebElement usernameField;

	@FindBy(name = "txtPassword")
	private WebElement passwordField;

	@FindBy(id = "btnLogin")
	private WebElement loginBtn;

	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotBtn;

	@FindBy(linkText = "About HRM")
	private WebElement aboutHrm;
	// Page Action


public boolean isHRMLogoDisplayed() {
    wait.until(ExpectedConditions.visibilityOf(hrmLogo));
    return hrmLogo.isDisplayed();
}

public void setUsernameField(String user) {
    wait.until(ExpectedConditions.visibilityOf(usernameField));
    usernameField.clear();
    usernameField.sendKeys(user);
}

public void setPassword(String pwd) {
    wait.until(ExpectedConditions.visibilityOf(passwordField));
    passwordField.clear();
    passwordField.sendKeys(pwd);
}

public void clickLoginBtn() {
    wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
    loginBtn.click();
}

public void clickForgotButton() {
    wait.until(ExpectedConditions.elementToBeClickable(forgotBtn));
    forgotBtn.click();
}

public void clickAboutHrmLink() {
    wait.until(ExpectedConditions.elementToBeClickable(aboutHrm));
    aboutHrm.click();
}
	
	
/*	public boolean isHRMLogoDisplayed() {
		return hrmLogo.isDisplayed();

	}

	public void setUsernameField(String user) {
		usernameField.sendKeys(user);

	}

	public void setPassword(String pwd) {
		passwordField.sendKeys(pwd);
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}

	public void clickForgotButton() {
		forgotBtn.click();
	}

	public void clickAboutHrmLink() {
		aboutHrm.click();
	}
*/
	
	
	// Action with Assert Method
	/*
	 * public boolean isHRMLogoDisplayed() { 
	 * boolean status = hrmLogo.isDisplayed();
	 * Assert.assertFalse(status, "HRM Logo is NOT displayed!");
	 *  return status; 
	 *  }
	 * 
	 * public void setUsernameField(String user) {
	 * Assert.assertTrue(usernameField.isDisplayed(),
	 * "Username field is NOT visible!");
	 * Assert.assertTrue(usernameField.isEnabled(),
	 * "Username field is NOT enabled!"); usernameField.sendKeys(user); }
	 * 
	 * public void setPassword(String pwd) { passwordField.sendKeys(pwd); }
	 * 
	 * public void clickLoginBtn() { loginBtn.click(); }
	 * 
	 * public void clickForgotButton() { forgotBtn.click(); }
	 * 
	 * 
	 * public void clickAboutHrmLink() { aboutHrm.click(); }
	 */

}
