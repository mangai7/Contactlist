package contactlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.internal.invokers.ExpectedExceptionsHolder;

public class ContactEditingPage extends Basepage {

	public ContactEditingPage(WebDriver driver) {
		super(driver);
		
		}
	
	@FindBy(xpath= "//h1[normalize-space()='Contact Details']")
	WebElement txt_title;
	
	
	@FindBy(xpath= "//button[@id='edit-contact']")
	WebElement txt_editcontact;
	
	
	@FindBy(xpath= "//button[@id='return']")
	WebElement txt_returnbtn;
	
	@FindBy(xpath= "//td[normalize-space()='manik D']")
	WebElement txt_name;
	
	
	@FindBy(xpath= "//button[@id='delete']")
	WebElement txt_delete;
	
	
	@FindBy(xpath= "//button[@id='logout']")
	WebElement txt_logout;
	
	public String title() {
		return txt_title.getText();
		}
	public void editcontact() {
		 txt_editcontact.click();
		}
	
	public boolean clickreturn() {
		try {
		 txt_returnbtn.click();
		 return true;
		}
		catch(Exception e){
			return false;
		}
		}
	
	public void clickn() {
		txt_name.click();
		
	}
	public void delete() {
		txt_delete.click();
	}
	public boolean logout() {
		try {
		txt_logout.click();
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	public boolean islogoutbuttonvisible() {
	    return txt_logout.isDisplayed();
	}
}

