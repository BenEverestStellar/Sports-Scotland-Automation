package Hooks;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import Utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	 WebDriver driver;
	
	@Before	
	public void setup() throws FileNotFoundException {
	
		Properties prop = ConfigReader.initializeProperties();
		driver = DriverFactory.getDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		//driver.close();
		//driver.quit();
	}
	
	
}
