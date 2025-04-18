package contactlist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage {
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
		}
	@FindBy(xpath= "//h1[normalize-space()='Contact List']")
	WebElement txt_title;
	
	
	public String title() {
		return txt_title.getText();
		}

}
