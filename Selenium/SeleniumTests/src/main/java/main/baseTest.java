package main;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class baseTest {
	
	protected static WebDriver driver;
	protected WebDriverWait wait;
	
	@BeforeTest
	public void setUp() {
		//initializing the drivers
		
		// Set the relative path to the ChromeDriver executable
        String projectPath = System.getProperty("user.dir");  // Get the current project directory
        String driverPath = projectPath + "/driver/chromedriver.exe";  // Set the path to the chromedriver

        // Set the ChromeDriver executable system property
        System.setProperty("webdriver.chrome.driver", driverPath);
		// initialize the chromedriver
		driver = new ChromeDriver();
		//using explicit waits
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//maximizing the window
		driver.manage().window().maximize();
		// open the website
		driver.get("https://www.entrata.com/");
	}
	
	@AfterTest
	public void tearDown() {
		//tearing down the drivers
		driver.quit();
	}

}
