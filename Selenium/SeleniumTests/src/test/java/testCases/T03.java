package testCases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import main.baseTest;

public class T03 extends baseTest {
	
	@Test
	public void pricingDetails() {
		//click on submit
		WebElement submit = driver.findElement(By.xpath("//a[@class='main-nav-link dark-link']"));
		submit.click();
		//switching to next tab
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		String expectedTitle = "Entrata Summit 2024 | The Best Week in Multifamily Sept 23-26";
		// verifying the title
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Page title did not match");
		//click on price
		WebElement pricing = driver.findElement(By.xpath("//a[normalize-space()='Pricing']"));
		pricing.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> pricingCards = driver.findElements(By.xpath("//div[contains(@class, 'pricing-card')]"));

        // define the current date in MM-dd-yyyy format
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        //example (MM-dd-yyyy format)
        String today = "09-08-2024"; 
        Date currentDate;

        try {
            currentDate = sdf.parse(today);

            //loop through each pricing card
            for (WebElement card : pricingCards) {
                // Extract the expiry date text for this specific pricing card
                WebElement dateElement = card.findElement(By.xpath(".//div[contains(@class, 'pricing-date')]"));
                String expiryDateText = dateElement.getText().trim();
                Date expiryDate = sdf.parse(expiryDateText);

                // Check if the pricing detail is expired
                if (expiryDate.before(currentDate)) {
                    System.out.println("The pricing detail with expiry date " + expiryDateText + " is expired.");
                    Assert.fail("Expired pricing found: " + expiryDateText);
                } else {
                    System.out.println("The pricing detail with expiry date " + expiryDateText + " is still valid.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("An error occurred during date parsing or processing.");
        }
    }
}


	
