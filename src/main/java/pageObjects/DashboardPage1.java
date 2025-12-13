package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage1 extends BasePage1 {

	public DashboardPage1(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement clickLogoutDropDown;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement clickLogout;
	
	public void logoutBtn() {
		clickLogoutDropDown.click();
		clickLogout.click();
	}
}
