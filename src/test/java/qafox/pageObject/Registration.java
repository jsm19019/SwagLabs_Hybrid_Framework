package qafox.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration 
{


	public Registration(WebDriver driver)
	{
		super();
	}
	
	@FindBy(xpath="//input[@name=\"firstname\"]")
	WebElement firstName;
	
	@FindBy(id = "input-lastname")
	WebElement lastName;
	
	@FindBy(id = "input-email")
	WebElement eMail;
	
	@FindBy(id = "input-telephone")
	WebElement telePhone;
	
	@FindBy(id = "input-password")
	WebElement pwd;
	
	@FindBy(id = "input-confirm")
	WebElement confirmpwd;
	
	@FindBy(xpath = "//*[@value=\"0\"]")
	WebElement select;
	
	@FindBy(xpath = "//*[@name=\"agree\"]")
	WebElement checkBox;
	
	@FindBy(xpath = "//*[@value=\"Continue\"]")
	WebElement btnContinue;
	
	public void enter_firstname(String FirstName)
	{
		firstName.sendKeys(FirstName);
	}
	
	public void enter_lastname(String lastname)
	{
		lastName.sendKeys(lastname);
	}
	
	public void enter_email(String email)
	{
		eMail.sendKeys(email);
	}
	
	public void enter_telephone(String mobile)
	{
		telePhone.sendKeys(mobile);
	}
	
	public void enter_password(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void enter_confirmpassword(String confirmpassword)
	{
		confirmpwd.sendKeys(confirmpassword);
	}
	
	public void click_radiobutton()
	{
		select.click();
	}
	
	public void click_checkbox()
	{
		checkBox.click();
	}
	
	public void click_continue()
	{
		btnContinue.click();
	}
	
}
