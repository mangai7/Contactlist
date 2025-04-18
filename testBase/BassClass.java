package testBase;

import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BassClass {
	public static WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		
		
	}
	@AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
	
}
}
