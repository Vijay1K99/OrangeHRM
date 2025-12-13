package testcases;

import org.testng.annotations.Test;

import pageObjects.DashboardPage1;
import pageObjects.LoginPage1;

public class DashboardTest1 extends BaseTest1 {

	@Test
	public void verifyLogout() {

	    // Step 1: Login
	    LoginPage1 lp = new LoginPage1(driver);
	    lp.setUsernameField("Admin");
	    lp.setPassword("admin123");
	    lp.clickLoginBtn();

	    // Step 2: Perform logout
	    DashboardPage1 dp = new DashboardPage1(driver);
	    dp.logoutBtn();

	}

}
