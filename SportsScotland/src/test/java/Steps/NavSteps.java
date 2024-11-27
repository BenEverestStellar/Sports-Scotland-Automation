package Steps;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import Pages.ContactUsPage;
import Pages.FixturesPage;
import Pages.GalleryPage;
import Pages.MainPage;
import Pages.NewsPage;
import Pages.TeamsPage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavSteps {
	
	WebDriver driver;
	MainPage mainPage = new MainPage();
	TeamsPage TP = new TeamsPage();
	FixturesPage FP = new FixturesPage();
	GalleryPage GP = new GalleryPage();
	NewsPage NP = new NewsPage();
	ContactUsPage CP = new ContactUsPage();
	
	 @Before
	    public void before(Scenario scenario) {
	        driver = DriverFactory.getDriver();
	    }
	
	@Given("I am on the Sports Scotland main page")
	public void i_am_on_the_sports_scotland_main_page() {
	}

	@When("I click the home nav option")
	public void i_click_the_home_nav_option() throws InterruptedException {
	    mainPage.clickHomeNav(driver);
	}

	@Then("I should be at the home page")
	public void i_should_be_at_the_home_page() {
	    mainPage.checkHome(driver);
	}

	@When("I click the teams nav option")
	public void i_click_the_teams_nav_option() throws InterruptedException {
	    mainPage.clickTeamsNav(driver);
	}

	@Then("I should be at the Teams page")
	public void i_should_be_at_the_teams_page() {
	    TP.checkTeams(driver);
	}
	
	@When("I click the teams Fixtures option")
	public void i_click_the_teams_fixtures_option() {
	    mainPage.clickFixturesNav(driver);
	}

	@Then("I should be at the fixtures page")
	public void i_should_be_at_the_fixtures_page() {
	    FP.checkFixtures(driver);
	}

	@When("I click the teams gallery option")
	public void i_click_the_teams_gallery_option() {
	    mainPage.clickGalleryNav(driver);
	}

	@Then("I should be at the gallery page")
	public void i_should_be_at_the_gallery_page() {
	    GP.checkGallery(driver);
	}

	@When("I click the News option")
	public void i_click_the_news_option() {
	    mainPage.clickNewsNav(driver);
	}

	@Then("I should be at the news page")
	public void i_should_be_at_the_news_page() {
	    NP.checkNews(driver);
	}
	
	@When("I click the Contact Us option")
	public void i_click_the_contact_us_option() {
	    mainPage.clickContactNav(driver);
	}

	@Then("I should be at the Contact Us page")
	public void i_should_be_at_the_contact_us_page() {
	    CP.checkContact(driver);
	}
}