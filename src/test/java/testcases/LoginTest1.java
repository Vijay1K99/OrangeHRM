package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage1;

public class LoginTest1 extends BaseTest1 {
//	LoginPage1 lp;
	 @Test(dataProvider = "loginData")
    public void verifyLoginFunction(String username, String password) {
        LoginPage1 lp = new LoginPage1(driver); //it will do two things

   
		 lp.isHRMLogoDisplayed();
			lp.setUsernameField(username);
			lp.setPassword(password);
			lp.clickLoginBtn();
    }

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"Adminn", "admin2344"},
                {"Admin", "admin1233"},
                {"Adminr", "admin123"},
                {"", ""},
                {"", "admin123"},
                {"Admin", ""},
                {" Admin", "admin123"},
                {"Admin", " admin123"},
                {"Admin", ""},
                {"admin", "admin123"},
                {"Admin", "Admin123"},
                {"admin", "Admin123"},
                {"ADMIN", "Admin123"},
                {"ADMIN", "ADMIN123"},
                {"ADMIN", "ADMIN@123"},
                {"Admin", "admin123"}  // Valid
        };
    } 
    	/*
    	@Test
    	public void verifyLoginFunction() {
    		lp = new LoginPage1(driver);

    		// For invalid credentials
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Adminn");
    		lp.setPassword("admin2344");
    		lp.clickLoginBtn();

    		// For Valid username and invalid password
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Admin");
    		lp.setPassword("admin1233");
    		lp.clickLoginBtn();

    		// For invalid username and valid password
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Adminr");
    		lp.setPassword("admin123");
    		lp.clickLoginBtn();
    		
    		// For blank username and blank password
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("");
    		lp.setPassword("");
    		lp.clickLoginBtn();

    		
    		// For blank username and valid password
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("");
    		lp.setPassword("admin123");
    		lp.clickLoginBtn();
    		
    		//For leading/trailing spaces
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField(" Admin");
    		lp.setPassword("admin123");
    		
    		//For password with  spaces
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Admin");
    		lp.setPassword(" admin123");
    		
    		
    		// For valid username and blank password 
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Admin");
    		lp.setPassword("");
    		lp.clickLoginBtn();
    		
    		//For username with different cases
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("admin");
    		lp.setPassword("admin123");
    		lp.clickLoginBtn();
    		
    		
    		//For password with different cases
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Admin");
    		lp.setPassword("Admin123");
    		lp.clickLoginBtn();
    		
    		//For username and password with different cases
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("admin");
    		lp.setPassword("Admin123");
    		lp.clickLoginBtn();
    		
    		
    		// For Valid Credentials
    		lp = new LoginPage1(driver);
    		lp.isHRMLogoDisplayed();
    		lp.setUsernameField("Admin");
    		lp.setPassword("admin123");
    		lp.clickLoginBtn();

    	}
    	*/
    
}

