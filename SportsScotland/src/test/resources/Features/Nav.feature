Feature: Site navigation

	Scenario: Navigation bar home
		Given I am on the Sports Scotland main page
		When I click the home nav option
		Then I should be at the home page
		
	Scenario: Nav Bar Teams
		Given I am on the Sports Scotland main page
		When I click the teams nav option
		Then I should be at the Teams page
		
	Scenario: Nav Bar Fixtures
		Given I am on the Sports Scotland main page
		When I click the teams Fixtures option
		Then I should be at the fixtures page
	
	Scenario: Nav Bar Gallery
		Given I am on the Sports Scotland main page
		When I click the teams gallery option
		Then I should be at the gallery page
		
	 Scenario: Nav Bar news
		Given I am on the Sports Scotland main page
		When I click the News option
		Then I should be at the news page
		
	Scenario: Nav Bar Contact Us
		Given I am on the Sports Scotland main page
		When I click the Contact Us option
		Then I should be at the Contact Us page
		
	Scenario: Main page gallery link
		Given I am on the Sports Scotland main page
		When I click the gallery view more button
		Then I should be at the gallery page
		
	Scenario: Main page news link
		Given I am on the Sports Scotland main page
		When I click the latest news button
		Then I should be at the news page
		
	Scenario: Main page fixtures link
		Given I am on the Sports Scotland main page
		When I click the latest fixtures button
		Then I should be at the fixtures page
		
	Scenario: Main page recent results link
		Given I am on the Sports Scotland main page
		When I click the recent results button
		Then I should be at the fixtures page
	
		
		