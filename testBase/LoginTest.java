package testBase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import contactlist.LoginPage;
import contactlist.SignupPage;

public class LoginTest extends BassClass {
	public WebDriver driver;
	SignupPage SP;
	LoginPage LP;
    @BeforeClass
    public void setUpTest() {
        SP = new SignupPage(BassClass.driver); // initialize after driver is ready
        LP = new LoginPage(BassClass.driver);
    }
    
    @Test(priority = 1)
	public void testsubmitvisible() {
		boolean isSignupButtonVisible = SP.issubmitbuttonvisible();

        // TestNG assertion to check visibility
        Assert.assertTrue(isSignupButtonVisible, "Submit button is NOT visible.");
    
	}
    
    @Test(priority = 2)
	public void testbuttonclickable() {
        // WebDriverWait to ensure the element is clickable
        WebDriverWait wait = new WebDriverWait(BassClass.driver, Duration.ofSeconds(20));
        
        // Wait until the submit button is clickable
        WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(SP.getsubmitbutton()));

        // Assert that the submit button is clickable
        Assert.assertNotNull(signupButton, "Submit button is NOT clickable.");
        System.out.println("submitbutton is button is clickable.");
    }
    
    
    @Test(priority = 3)
    void enterlogin() {
    	//Enter the email
    	SP.enteremail("demo145235@gmail.com");
    	//Enter the password
    	SP.enterpassword("1234567");
    	//click submit
    	SP.entersubmit();
    	Assert.assertTrue(LP.title().equalsIgnoreCase("Contact List"), "Title mismatch (case-insensitive)");
    }
    
    
    
}
