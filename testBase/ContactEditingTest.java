package testBase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import contactlist.ContactAdditionPage;
import contactlist.ContactEditingPage;
import contactlist.LoginPage;
import contactlist.SignupPage;

public class ContactEditingTest extends BassClass {
	public WebDriver driver;
	SignupPage SP;
	LoginPage LP;
	ContactAdditionPage CP;
	ContactEditingPage CEP;
	
	@BeforeClass
    public void setUpTest() {
        SP = new SignupPage(BassClass.driver); // initialize after driver is ready
        LP = new LoginPage(BassClass.driver);
        CP = new ContactAdditionPage(BassClass.driver);
        CEP = new ContactEditingPage(BassClass.driver);
        SP.enteremail("demo145235@gmail.com");
        SP.enterpassword("1234567");
        SP.entersubmit();
        
        
	}
	
	@Test(priority = 1)
	void testredirectfield() {
		//click the name
		CP.clickname();
		
		Assert.assertTrue(CEP.title().equalsIgnoreCase("Contact Details"));
		
		}
	
	@Test(priority = 2)
	void testeditexisting() throws Exception {
		//click editcontact 
		CEP.editcontact();
	    Thread.sleep(1000);
		//clear firstname
		SP.clearfirstname();
		//modify firstname
		SP.enterfirstname("manik");
	    Thread.sleep(500);
		SP.clearlastname();  // Clear the field
		SP.enterlastname("D");
	    Thread.sleep(500);
		SP.clearemail();
		//modify email
		SP.enteremail("demo001@gmail.com");
		Thread.sleep(500);
		CP.clearphone();
		
		//modify number
		CP.enterphone("989854022");
		Thread.sleep(500);
		//enter submit
		Assert.assertTrue(SP.entersubmit());
		
		Assert.assertTrue(CEP.clickreturn()); 
		
		
	}
	@Test(priority = 3)
	void testappallowemptyfield() throws Exception {
		CEP.clickn();
		Thread.sleep(500);
		CEP.editcontact();
	    Thread.sleep(500);
		
		CP.clearphone();
		
		//modify number
		CP.enterphone("");
		Thread.sleep(500);
		
		Assert.assertTrue(SP.entersubmit());
	}
	
	@Test(priority = 4)
	void tsetdeletecontact() {
		CEP.clickn();
		CEP.delete();
		Alert alert = BassClass.driver.switchTo().alert();
	    alert.accept();
		
	}
	@Test(priority = 5)
	void testlogoutvisible() {
		boolean islogoutvisible = CEP.islogoutbuttonvisible();

        // TestNG assertion to check visibility
        Assert.assertTrue(islogoutvisible, "logout button is NOT visible.");
    
	}
	
	
	@Test(priority = 6)
	void logout() {
		Assert.assertTrue(CEP.logout());
	}
	
}
