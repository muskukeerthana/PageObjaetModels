package OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pageafactory {
      
      WebDriver driver;
	
     
	
      Pageafactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver , this);
	}
	
	

	@FindBy(xpath="//a[text()='Register']")
	WebElement text_Register; 
	@FindBy(xpath="//input[@id='gender-female']")
    WebElement 	gender;
	@FindBy(xpath="//input[@id='FirstName']")
    WebElement 	text_FirstName;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
    WebElement  Date_of_Birth_day;	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement  Date_of_Birth_month;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
    WebElement Date_of_Birth_Year;	
	@FindBy(xpath="//input[@name='LastName']")
	WebElement text_LastName;
	@FindBy(xpath="//input[@type='email']")
    WebElement text_Email;
	@FindBy(xpath="//input[@name='Company']")
	WebElement  Company;
    @FindBy(xpath="//input[@type='checkbox']")
    WebElement NewsLetterCheckBox;
    @FindBy(xpath="//input[@id='Password']")
    WebElement Password;

	@FindBy(xpath="//input[@id='ConfirmPassword']")
    WebElement confirm_Password;
	@FindBy(xpath="//button[text()='Continue']")
    WebElement  Continue;
	@FindBy(xpath="//button[@id='register-button']")
    WebElement Register;




	//By text_Register = By.xpath("//a[text()='Register']");
	//By gender = By.xpath("//input[@id='gender-female']");
	//By text_FirstName = By.xpath("//input[@id='FirstName']");
	//By Date_of_Birth_day = By.xpath("//select[@name='DateOfBirthDay']");
	//By Date_of_Birth_month = By.xpath("//select[@name='DateOfBirthMonth']");
	//By Date_of_Birth_Year = By.xpath("//select[@name='DateOfBirthYear']");
	//By text_LastName = By.xpath("//input[@name='LastName']");
	//By text_Email = By.xpath("//input[@type='email']");
	//By Company = By.xpath("//input[@name='Company']");
	//By NewsLetterCheckBox  =By.xpath("//input[@type='checkbox']");
	//By Password = By.xpath("//input[@id='Password']");
	//By confirm_Password = By.xpath("//input[@id='ConfirmPassword']");
	//By Continue = By.xpath("//button[text()='Continue']");
	//By Register = By.xpath("//button[@id='register-button']");
	
	
	public void register() {
		text_Register.click();

	}
	public void gender() {
		gender.click();

	}
	public void first_name(String Firstname)    
	{	
		text_FirstName.sendKeys(Firstname);
	}
	public void setLastName(String  Lastname)
	{
		text_LastName.sendKeys(Lastname);
	}
	
	public void dateOfBirth(String date,String month,String year) {
		Date_of_Birth_day.click();
		Date_of_Birth_day.sendKeys(date);
		Date_of_Birth_month.click();
		Date_of_Birth_month.sendKeys(month);
		Date_of_Birth_Year.click();
		Date_of_Birth_Year.sendKeys(year);
    }
	
	
	
	public void setEmailId(String emailId) {
		text_Email.sendKeys(emailId);
		
	}
	public void company(String companyName) {
		Company.click();
	    Company.sendKeys(companyName);
	}
	
	public void newsLetterCheckBox()
	{
		NewsLetterCheckBox.click();
	}
	
	public void set_password(String password) {
		Password.click();
		Password.sendKeys(password);
		
	}
	
	public void confirmPassword(String password) {
		confirm_Password.click();
		confirm_Password.sendKeys(password);
	}
	public void registerButton() {
		Register.click();
	}
	
	
	
}
