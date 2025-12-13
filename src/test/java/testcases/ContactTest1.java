package testcases;

import org.testng.annotations.Test;

import pageObjects.ContactPage1;
import pageObjects.LoginPage1;

public class ContactTest1 extends BaseTest1 {

	@Test
	public void fillForm() {

		// Step 1: Login
		LoginPage1 lp = new LoginPage1(driver);
		lp.setUsernameField("Admin");
		lp.setPassword("admin123");
		lp.clickLoginBtn();

		ContactPage1 contactPage = new ContactPage1(driver);
//		contactPage.fillForm("John","Brother","1234567890", "9876543210", "111222333");
		contactPage.fillForm("John", "Brother", "1234567890", "9876543210", "111222333");


	}

}
