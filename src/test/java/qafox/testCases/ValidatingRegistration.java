package qafox.testCases;

import org.testng.annotations.Test;

import Utilities.GenerateRandomString;

import java.io.IOException;

import qafox.pageObject.Registration;
import qafox.pageObject.Startpage;

public class ValidatingRegistration extends BaseTest {
	

	@Test
	public void validatereg() throws IOException, InterruptedException
	{
		Startpage obj2 = new Startpage(driver);
		obj2.clickMyaccount();
		obj2.clickRegister();
		
		Registration obj = new Registration(driver);
	
		GenerateRandomString obj4 = new GenerateRandomString();
		String name = obj4.randomstring();
		System.out.println("Random String: "+name);
		
		
		
		Thread.sleep(3000);
		obj.enter_firstname(name);
		Thread.sleep(3000);
		obj.enter_lastname(name);
		Thread.sleep(3000);
		obj.enter_email(name);
		Thread.sleep(3000);
		obj.enter_telephone(name);
		Thread.sleep(3000);
		obj.enter_password(name);
		Thread.sleep(3000);
		obj.enter_confirmpassword(name);
	}
}
