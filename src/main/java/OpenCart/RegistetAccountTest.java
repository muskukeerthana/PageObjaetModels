package OpenCart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistetAccountTest {

	WebDriver driver;
	
	@BeforeClass
	void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	    driver.get("https://demo.nopcommerce.com/");
	}
	@Test
	void setRegistration() {
		RegisterAccount account = new RegisterAccount(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

		account.register();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
		
		account.gender();
		account.first_name("ammala");
		account.setLastName("nami");
		account.dateOfBirth("22","01","2001");
		account.setEmailId("ammala@gmail.com");
		account.company("TCS");
		account.newsLetterCheckBox();
		account.set_password("Ammala123");
		account.confirmPassword("Ammala123");
		account.registerButton();
		
	}
	@AfterClass
	void tearDown() {
		driver.quit();
	}
}