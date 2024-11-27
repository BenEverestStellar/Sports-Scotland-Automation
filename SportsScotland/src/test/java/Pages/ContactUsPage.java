package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {
	
	By contactPageCheck = By.xpath("//input[@id='wpforms-73-field_1']");

	public boolean checkContact(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loginSuccess = driver.findElement(contactPageCheck).isDisplayed();
		return loginSuccess;
	}
}