package qafox.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Startpage extends BasePageObject {

	public Startpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*[@title=\"My Account\"]")
	WebElement myAccount;

	@FindBy(xpath = "//a[text() = \"Register\"]")
	WebElement actRegister;

	@FindBy(xpath = "//a[text() = \"Desktops\"]")
	WebElement menuDesktops;

	public void clickMyaccount() {
		myAccount.click();
	}

	public void clickRegister() {
		actRegister.click();
	}

	public String validate() {
		String txtvalidate = menuDesktops.getText();
		return txtvalidate;
	}

}
