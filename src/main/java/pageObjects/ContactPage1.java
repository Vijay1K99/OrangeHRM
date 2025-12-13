package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage1 extends BasePage1 {

	public ContactPage1(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[text()='My Info']")
	WebElement myInfo;

	@FindBy(xpath = "//a[text()='Emergency Contacts']")
	WebElement contactDetails_box;

	@FindBy(xpath = "(//button[@type='button'][normalize-space()='Add'])[1]")
	WebElement addBtn;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement name_field;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement relation_field;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement telephone_field;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[5]")
	WebElement mobile_field;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[6]")
	WebElement work_telephone_field;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement save_btn;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	WebElement cancel_btn;

//	public void fillForm(String name, String relation, String telephone, String mobile, String workTelephone) {
//		myInfo.click();
//	    contactDetails_box.click();
//	    addBtn.click();
//	    name_field.sendKeys(name);
//	    relation_field.sendKeys(relation);
//	    telephone_field.sendKeys(telephone);
//	    mobile_field.sendKeys(mobile);
//	    work_telephone_field.sendKeys(workTelephone);
//	    save_btn.click();
//	}

	public void fillForm(String name, String relation, String telephone, String mobile, String workTelephone) {
	    myInfo.click();
	    contactDetails_box.click();
	    addBtn.click();
	    name_field.sendKeys(name);
	    relation_field.sendKeys(relation);
	    telephone_field.sendKeys(telephone);
	    mobile_field.sendKeys(mobile);
	    work_telephone_field.sendKeys(workTelephone);
	    save_btn.click();
	}

	public void cancelForm() {
		cancel_btn.click();
	}
}
