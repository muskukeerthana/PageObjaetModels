package OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {

	WebDriver driver;
	
	RegisterAccount(WebDriver driver){
		this.driver = driver;
	}
	
	By text_Register = By.xpath("//a[text()='Register']");
	By gender = By.xpath("//input[@id='gender-female']");
	By text_FirstName = By.xpath("//input[@id='FirstName']");
	By Date_of_Birth_day = By.xpath("//select[@name='DateOfBirthDay']");
	By Date_of_Birth_month = By.xpath("//select[@name='DateOfBirthMonth']");
	By Date_of_Birth_Year = By.xpath("//select[@name='DateOfBirthYear']");
	By text_LastName = By.xpath("//input[@name='LastName']");
	By text_Email = By.xpath("//input[@type='email']");
	By Company = By.xpath("//input[@name='Company']");
	By NewsLetterCheckBox  =By.xpath("//input[@type='checkbox']");
	By Password = By.xpath("//input[@id='Password']");
	By confirm_Password = By.xpath("//input[@id='ConfirmPassword']");
	By Continue = By.xpath("//button[text()='Continue']");
	By Register = By.xpath("//button[@id='register-button']");
	
	
	public void register() {
		String RegisterText = driver.findElement(text_Register).getText();
		System.out.print(RegisterText);
		driver.findElement(text_Register).click();

	}
	public void gender() {
		driver.findElement(gender).click();

	}
	public void first_name(String Firstname)    
	{		
		driver.findElement(text_FirstName).sendKeys(Firstname);
	}
	public void setLastName(String  Lastname)
	{
		driver.findElement(text_LastName).sendKeys(Lastname);
	}
	
	public void dateOfBirth(String date,String month,String year) {
		driver.findElement(Date_of_Birth_day).click();
		driver.findElement(Date_of_Birth_day).sendKeys(date);
		driver.findElement(Date_of_Birth_month).click();
		driver.findElement(Date_of_Birth_month).sendKeys(month);
		driver.findElement(Date_of_Birth_Year).click();
		driver.findElement(Date_of_Birth_Year).sendKeys(year);
    }
	
	
	
	public void setEmailId(String emailId) {
		driver.findElement(text_Email).sendKeys(emailId);
		
	}
	public void company(String companyName) {
		driver.findElement(Company).click();
		driver.findElement(Company).sendKeys(companyName);
	}
	
	public void newsLetterCheckBox()
	{
		driver.findElement(NewsLetterCheckBox).click();
	}
	
	public void set_password(String password) {
		driver.findElement(Password).click();
		driver.findElement(Password).sendKeys(password);
		
	}
	
	public void confirmPassword(String password) {
		driver.findElement(confirm_Password).click();
		driver.findElement(confirm_Password).sendKeys(password);
	}
	public void registerButton() {
		driver.findElement(Register).click();
	}
	
	
}
