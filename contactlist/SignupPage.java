package contactlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends Basepage  {
	public SignupPage(WebDriver driver) {
		super(driver);
		
		
	}
	
	@FindBy(xpath= "//button[@id='signup']")
	WebElement txt_signup;
	
	@FindBy(xpath= "//input[@id='firstName']")
	WebElement txt_firstname;
	
	@FindBy(xpath= "//input[@id='lastName']")
	WebElement txt_lastname;
	
	@FindBy(xpath= "//input[@id='email']")
	WebElement txt_email;
	
	@FindBy(xpath= "//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath= "//button[@id='submit']")
	WebElement txt_submit;
	
	
	public boolean isSignupButtonVisible() {
	    return txt_signup.isDisplayed();
	}
	
	public WebElement getSignupButton() {
	    return txt_signup;
	}
	public void signup() {
		txt_signup.click();
		}
	public void enterfirstname(String input) {
		txt_firstname.sendKeys(input);
	}
	public void clearfirstname() {
		txt_firstname.clear();
	}
	public void enterlastname(String input) {
		txt_lastname.sendKeys(input);
	}
	public void clearlastname() {
		txt_lastname.clear();
	}
	
	public void enteremail(String input) {
		txt_email.sendKeys(input);
	}
	public void clearemail() {
		txt_email.clear();
	}
	public void enterpassword(String input) {
		txt_password.sendKeys(input);
	}
	public boolean entersubmit() {
		try {
		
		txt_submit.click();
		return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public WebElement getsubmitbutton() {
	    return txt_submit;
	}
	public boolean issubmitbuttonvisible() {
	    return txt_submit.isDisplayed();
	}
}

