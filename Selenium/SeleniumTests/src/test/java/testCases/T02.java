package testCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import webElements.demoPage;
import main.baseTest;

public class T02 extends baseTest {

	@Test
	public void watchDemo() {

		// click on button Watch Demo
		demoPage.watchDemo().click();
		// checking the titles of the web page
		String expectedTitle = "Entrata | Optimize Property Management with One Platform";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Home page title did not match");
		// filling out the forms
		// typing first name
		demoPage.firstName().sendKeys("Varun");
		// typing lastname
		demoPage.lastName().sendKeys("Chandrashekar");
		// typing mail ID
		demoPage.emailID().sendKeys("varun.c.3054@gmail.com");
		// typing company name
		demoPage.companyName().sendKeys("Entrata");
		// typing mobile number
		demoPage.mobileNumber().sendKeys("9036969712");
		// selecting unitcode
		Select unitCodeDropDown = new Select(demoPage.unitCode());
		unitCodeDropDown.selectByIndex(2);
		// typing job title
		demoPage.jobTitle().sendKeys("SDET");
		// selecting I am dropdown
		Select iAmDropDown = new Select(demoPage.iAm());
		iAmDropDown.selectByIndex(2);
	}

}
