package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	By homeNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Home']");
	By homePageCheck = By.xpath("//p[contains(text(),'Kingston FC is a proud football club based in Edin')]");
	By teamsNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Teams']");
	By galleryNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Gallery']");
	By contactNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Contact Us']");
	By fixturesNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Fixtures']");
	By newsNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='News']");
	
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
		boolean loginSuccess = driver.findElement(homePageCheck).isDisplayed();
		return loginSuccess;
	}
	
	public void clickTeamsNav(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(teamsNavButton).click();
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
	
	public void clickContactNav(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(contactNavButton).click();
	}
	
	
	public void clickFixturesNav(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(fixturesNavButton).click();
	}
	
	public void clickNewsNav(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(newsNavButton).click();
	}
}