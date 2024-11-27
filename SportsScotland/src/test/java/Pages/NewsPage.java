package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsPage {
	
	By newsPageCheck = By.xpath("//a[normalize-space()='Sample News Post']");

	public boolean checkNews(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loginSuccess = driver.findElement(newsPageCheck).isDisplayed();
		return loginSuccess;
	}
}
	