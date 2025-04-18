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
import contactlist.SignupPage;

public class SignupTest extends BassClass{
	public WebDriver driver;
	SignupPage SP;

    @BeforeClass
    public void setUpTest() {
        SP = new SignupPage(BassClass.driver); // initialize after driver is ready
    }	
    
	@Test(priority = 1)
	public void testsignupvisible() {
		boolean isSignupButtonVisible = SP.isSignupButtonVisible();

        // TestNG assertion to check visibility
        Assert.assertTrue(isSignupButtonVisible, "Sign up button is NOT visible.");
    
	}
	
	@Test(priority = 2)
	public void testsignupbuttonclickable() {
        // WebDriverWait to ensure the element is clickable
        WebDriverWait wait = new WebDriverWait(BassClass.driver, Duration.ofSeconds(20));
        
        // Wait until the signup button is clickable
        WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(SP.getSignupButton()));

        // Assert that the signup button is clickable
        Assert.assertNotNull(signupButton, "Sign up button is NOT clickable.");
        System.out.println("Sign up button is clickable.");
    }
	
	@Test(priority = 3)
	public void testaddsignup() {
		//click signup button	
		SP.signup();
		
		//Enter the firstname
		SP.enterfirstname("john");
			
		//Enter the lastname	
		SP.enterlastname("s");
		
		//Enter the email
		SP.enteremail("demo145235@gmail.com");
		
		//Enter the password
		SP.enterpassword("1234567");
	
		//click submit
		SP.entersubmit();
		
	}

}
