package testBase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import contactlist.ContactAdditionPage;
import contactlist.LoginPage;
import contactlist.SignupPage;

public class ContactAdditionTest extends BassClass {

	public WebDriver driver;
	SignupPage SP;
	LoginPage LP;
	ContactAdditionPage CP;
    
	@BeforeClass
    public void setUpTest() {
        SP = new SignupPage(BassClass.driver); // initialize after driver is ready
        LP = new LoginPage(BassClass.driver);
        CP = new ContactAdditionPage(BassClass.driver);
        SP.enteremail("demo145235@gmail.com");
        SP.enterpassword("1234567");
        SP.entersubmit();
     
	}
	
	
	@Test(priority = 1)
	void testwithmandatoryfiels() {
		CP.addcontact();
		//enter first mname
		SP.enterfirstname("vilva");
		
		//enter lastname
		SP.enterlastname("S");
		//enter birthdate
		CP.enterbirthdate("2020-02-01");
		//enter email
		SP.enteremail("demo@gmail.com");
		//enter phone number
		CP.enterphone("123456789");
		//enter street1
		CP.enterstreet1("n0.2,velar street");
		//enter street2
		CP.enterstreet2("n0.5,VR street");
		//enter city
		CP.entercity("chennai");
		
		//enter state
		CP.enterstate("tamilnadu");
		//enter pincode
		CP.enterpostalcode("600041");
		//enter country
		CP.entercountry("India");
		//enter submit
		SP.entersubmit();
		Assert.assertTrue(CP.isnameadded(), "name cell is not visible");
		
	}
	
	

	@Test(priority = 2)
	void testwithinvaliddate() {
		CP.addcontact();
		//enter first mname
		SP.enterfirstname("thiruva");
		
		//enter lastname
		SP.enterlastname("P");
		//enter birthdate
		CP.enterbirthdate("20-03-2025");
		//enter email
		SP.enteremail("demo@gmail.com");
		//enter phone number
		CP.enterphone("123456789");
		//enter street1
		CP.enterstreet1("n0.7,vel street");
		//enter street2
		CP.enterstreet2("n0.5,VS street");
		//enter city
		CP.entercity("chennai");
		
		//enter state
		CP.enterstate("tamilnadu");
		//enter pincode
		CP.enterpostalcode("600063");
		//enter country
		CP.entercountry("India");
		//enter submit
		AssertJUnit.assertTrue(SP.entersubmit());
		WebElement errorMsg = BassClass.driver.findElement(By.xpath("//*[contains(text(),'Birthdate is invalid')]"));
		Assert.assertTrue(errorMsg.isDisplayed(), "Birthdate error message not shown!");
		
	}
    
}
