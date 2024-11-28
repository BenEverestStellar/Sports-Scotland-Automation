package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	By homeNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Home']");
	By homePageCheck = By.xpath("//p[contains(text(),'Kingston FC is a proud football club based in Edin')]");
	By teamsNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Teams']");
	By galleryNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Gallery']");
	By contactNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Contact Us']");
	By fixturesNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='Fixtures']");
	By newsNavButton = By.xpath("//a[@class='hfe-menu-item'][normalize-space()='News']");
	By latestNewsButton = By.xpath("//div[@id='home-button-news']//a[@class='elementor-button elementor-button-link elementor-size-sm']");
	By recentResultsButton = By.xpath("//div[@class='elementor-element elementor-element-10761de elementor-align-justify elementor-widget elementor-widget-button']//span[@class='elementor-button-content-wrapper']");
	By upcomingMatchesButton = By.xpath("//div[@class='elementor-element elementor-element-0d8be29 elementor-align-justify elementor-widget elementor-widget-button']//span[@class='elementor-button-content-wrapper']");
	By viewMoreButton = By.xpath("//div[@id='home-button-more']//div[@class='elementor-widget-container']");
	
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
	
	public void clickLatestNews(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(latestNewsButton).click();
	}
	
	public void clickRecentResults(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(recentResultsButton).click();
	}
	public void clickUpcomingMatches(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(upcomingMatchesButton).click();
	}
	public void clickViewMore(WebDriver driver) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(viewMoreButton).click();
	}
	
}