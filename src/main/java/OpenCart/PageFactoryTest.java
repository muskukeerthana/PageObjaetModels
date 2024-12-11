package OpenCart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PageFactoryTest {

WebDriver driver;
	
	@BeforeClass
	void setUp2()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
	    driver.get("https://demo.nopcommerce.com/");
	}
	@Test
	void setRegistration2() {
		Pageafactory account1 = new Pageafactory(driver);

		account1.register();
		account1.gender();
		account1.first_name("ammala");
		account1.setLastName("nami");
		account1.dateOfBirth("22","01","2001");
		account1.setEmailId("ammala@gmail.com");
		account1.company("TCS");
		account1.newsLetterCheckBox();
		account1.set_password("Ammala123");
		account1.confirmPassword("Ammala123");
		account1.registerButton();
		
	}
	@AfterClass
	void tearDown2() {
		driver.quit();
	}
}
