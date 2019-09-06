Feature: Registration

Scenario: Registration to the Application
		Given User open "chrome" browser
		And   User navitages to the page with the URL "www.google.com"
		When  User click on Sign up link
		Then  Page title should be "Signup"
		When  User enters first name as "raja", last name as "sekhar" and email as "jj@gamil.com"
		And   User click on Register button
		Then  Page title should be "confirmation"
		And   User is should see confirmation message about successful registration
Scenario: scenario description
    Given a precondition is valid
    When an action is performed
    Then something should be asserted