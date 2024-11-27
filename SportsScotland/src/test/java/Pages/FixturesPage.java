package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FixturesPage {
	By fixturesPageCheck = By.xpath("//h2[normalize-space()='Fixtures']");
	

	public boolean checkFixtures(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loginSuccess = driver.findElement(fixturesPageCheck).isDisplayed();
		return loginSuccess;
	}
}