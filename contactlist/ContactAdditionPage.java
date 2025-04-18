package contactlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactAdditionPage extends Basepage {
	
	public ContactAdditionPage(WebDriver driver) {
		super(driver);
		
		}
	
	@FindBy(xpath= "//button[@id='add-contact']")
	WebElement txt_addcontact;
	
	
	@FindBy(xpath= "//input[@id='birthdate']")
	WebElement txt_birthdate;
	
	@FindBy(xpath= "//input[@id='phone']")
	WebElement txt_phone;
	
	
	@FindBy(xpath= "//input[@id='street1']")
	WebElement txt_street1;
	
	@FindBy(xpath= "//input[@id='street2']")
	WebElement txt_street2;
	
	@FindBy(xpath= "//input[@id='city']")
	WebElement txt_city;
	
	@FindBy(xpath= "//input[@id='stateProvince']")
	WebElement txt_state;
	
	
	@FindBy(xpath= "//input[@id='postalCode']")
	WebElement txt_postalcode;
	
	
	@FindBy(xpath= "//input[@id='country']")
	WebElement txt_country;
	
	
	@FindBy(xpath= "//td[normalize-space()='vilva S']")
	WebElement txt_present;
	
	public void addcontact(){
		txt_addcontact.click();
		}
	public void enterbirthdate(String input) {
		txt_birthdate.sendKeys(input);
	}
	public void clearbirthdate() {
		txt_birthdate.clear();
	}
	
	public void enterphone(String input) {
		txt_phone.sendKeys(input);
	}
	public void clearphone() {
		txt_phone.clear();
	}
	public void enterstreet1(String input) {
		txt_street1.sendKeys(input);
	}
	public void clearstreet1() {
		txt_street1.clear();
	}
	
	public void enterstreet2(String input) {
		txt_street2.sendKeys(input);
	}
	public void clearstreet2() {
		txt_street2.clear();
	}
	
	public void entercity(String input) {
		txt_city.sendKeys(input);
	}
	public void clearcity() {
		txt_city.clear();
	}
	public void enterstate(String input) {
		txt_state.sendKeys(input);
	}
	public void clearstate() {
		txt_state.clear();
	}
	
	public void enterpostalcode(String input) {
		txt_postalcode.sendKeys(input);
	}
	public void clearpostalcode() {
		txt_postalcode.clear();
	}
	public void entercountry(String input) {
		txt_country.sendKeys(input);
	}
	public void clearcountry() {
		txt_country.clear();
	}
	public boolean isnameadded() {
	    return txt_present.isDisplayed();
	}

	public void clickname() {
	     txt_present.click();
	}
}

