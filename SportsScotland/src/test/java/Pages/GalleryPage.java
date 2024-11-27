package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GalleryPage {
	By galleryPageCheck = By.xpath("//img[@fetchpriority='high']");
	

	
	public boolean checkGallery(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loginSuccess = driver.findElement(galleryPageCheck).isDisplayed();
		return loginSuccess;
	}
}