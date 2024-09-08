package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import main.baseTest;

public class demoPage extends baseTest{
	
	public static WebElement watchDemo() {
		WebElement watchDemoButton = driver.findElement(By.xpath("//a[@id='header-demo-button']"));
		return watchDemoButton;	
	}
	
	public static WebElement firstName() {
		WebElement firstNameField = driver.findElement(By.xpath("//input[@id='FirstName']"));
		return firstNameField;
	}
	public static WebElement lastName() {
		WebElement lastNameField = driver.findElement(By.xpath("//input[@id='LastName']"));
		return lastNameField;
	}
	public static WebElement emailID() {
		WebElement emailIDField = driver.findElement(By.xpath("//input[@id='Email']"));
		return emailIDField;
	}
	public static WebElement companyName() {
		WebElement companyNameField = driver.findElement(By.xpath("//input[@id='Company']"));
		return companyNameField;
	}
	public static WebElement mobileNumber() {
		WebElement mobileNumberField = driver.findElement(By.xpath("//input[@id='Phone']"));
		return mobileNumberField;
	}
	public static WebElement unitCode() {
		WebElement unitCodeDropDown = driver.findElement(By.xpath("//select[@id='Unit_Count__c']"));
		return unitCodeDropDown;
	}
	public static WebElement jobTitle() {
		WebElement jobTitleField = driver.findElement(By.xpath("//input[@id='Title']")); 
		return jobTitleField;
	}
	public static WebElement iAm() {
		 WebElement iAmDropDown = driver.findElement(By.xpath("//select[@id='demoRequest']"));
		 return iAmDropDown;
	}

}
