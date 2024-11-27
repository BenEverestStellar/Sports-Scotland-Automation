package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamsPage {
	By teamsPageCheck = By.xpath("//div[@class='elementor-element elementor-element-f5b2c68 elementor-widget elementor-widget-image']//img[@decoding='async']");
	
	public boolean checkTeams(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loginSuccess = driver.findElement(teamsPageCheck).isDisplayed();
		return loginSuccess;
	}
	
}