Feature: Free CRM Login Feautre

Background: 
Given User is on Login Page of Free CRM


@validLogin
Scenario: Login with valid crendentials
	When  User enter username and password
	And   User click on Login button
	Then  User landed on Home page of CRM
	
	
@invalidLogin1
Scenario: Login with invalid crendentials	
	When  User provided "validUserName" and "validPassword"
	And   User click on Login button
	Then  User landed on Home page of CRM
	
	
@invalidLogin2
Scenario: Login with invalid crendentials	
	When  I entered credentials to login
		|UserName     | Password    |
		|david        | dfs         |	
	And   User click on Login button
	Then  User landed on Home page of CRM
	

@invalidLoginWithExamples
Scenario Outline: Login with invalid credentials	
	When  Enter "<username>" and "<password>"	
	And   User click on Login button
	Then  User landed on Home page of CRM
	Examples:
		| username | password |
		| raj   | 123      |
		| sekhar   | 234      |
	

