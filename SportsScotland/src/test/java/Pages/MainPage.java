package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	By homeNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Home']");
	By homePageCheck = By.xpath("//p[contains(text(),'Kingston FC is a proud football club based in Edin')]");
	By teamsNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Teams']");
	By teamsPageCheck = By.xpath("//div[@class='elementor-element elementor-element-f5b2c68 elementor-widget elementor-widget-image']//img[@decoding='async']");
	By galleryNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Gallery']");
	By galleryPageCheck = By.xpath("//img[@fetchpriority='high']");
	By contactNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Contact Us']");
	By contactPageCheck = By.xpath("//input[@id='wpforms-73-field_1']");
	
	public void clickHomeNav(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(homeNavButton).click();
	}
	
	public boolean checkHome(WebDriver driver) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean loginSuccess = driver.findElement(teamsPageCheck).isDisplayed();
		return loginSuccess;
	}
	
	public void clickTeamsNav(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(teamsNavButton).click();
	}
	
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
	
	public void clickGalleryNav(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(galleryNavButton).click();
	}
	
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
	
	public void clickContactNav(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(contactNavButton).click();
	}
	
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