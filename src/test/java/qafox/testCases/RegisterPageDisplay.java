package qafox.testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import qafox.pageObject.Startpage;


public class RegisterPageDisplay extends BaseTest

{
	
	
	
	@Test
	public void register_page() throws InterruptedException
	{
			logger.info("***************** Starting Test Case ********************");
			Startpage obj = new Startpage(driver);
			obj.clickMyaccount();
			logger.info("***************** Clicked on My Account ********************");
			obj.clickRegister();
			logger.info("***************** Clicked on Registration page ********************");
			logger.info("***************** Landed on Registration page ********************");
			Thread.sleep(3000);
			String name = obj.validate();
			logger.info("***************** Validating ********************");
			Assert.assertEquals(name, "Desktop", "Test Failed - Similar element not detected");
		}
		

}
