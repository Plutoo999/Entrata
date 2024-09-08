package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.baseTest;

public class T01 extends baseTest {
	
	@Test
	public void titleVerification() {
		
		// verifying the title of the home page
        String expectedTitle = "Property Management Software | Entrata";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title did not match");
	}
}
