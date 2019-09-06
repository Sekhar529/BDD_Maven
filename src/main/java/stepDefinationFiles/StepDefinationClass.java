package stepDefinationFiles;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import resources.BaseClassForBrowserLaunch;

public class StepDefinationClass extends BaseClassForBrowserLaunch{	
	
	private static LoginPage login;
	private static HomePage  home;
	
	public StepDefinationClass() throws IOException {
		super();
	}
		
	@Before
	public void setUp()
	{
		System.out.println("------ I am Before Method ------");
		launchBrowserDriver();
		System.out.println("Browser launched");
		
	}
	@After
	public void tearDown() {
		System.out.println("------ I am After Method ------- \n");
		closeTheBrowser();
		System.out.println("Browser closed");
	}
	
	@Given("^User is on Login Page of Free CRM$")
	public void verifyTitleOfLoginPage() throws IOException
	{		
		login = new LoginPage();
	    login.getLoginPageTitle();
	    Assert.assertEquals(login.getLoginPageTitle(), "CRMPRO - CRM software for customer relationship management, sales, and support.");
	    System.out.println("Login page title is"+login.getLoginPageTitle());
	}

	@Given("^User click on Login button$")
	public void doClickOnLoginBtn() throws IOException, InterruptedException 
	{
		//Thread.sleep(500);
		//Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		//actions.moveToElement(login.getLoginButton()).click().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(login.getLoginButton()));
		//wait.until(ExpectedConditions.invisibilityOf(login.image));
		login.getLoginButton().click();    
		System.out.println("Login button clicked");
	}

	@Then("^User landed on Home page of CRM$")
	public void verifyHomePageTitle() throws Throwable
	{
		home = new HomePage();
		Thread.sleep(500);
		Assert.assertEquals(home.getHomePageTitle(), "CRMPRO");
		System.out.println("HOme page titles are matched");
	}

	@When("^User enter username and password$")
	public void provideLoginCredentials() throws Throwable 
	{
		 login.getUserName().sendKeys("sekhar529");
		 login.getPassword().sendKeys("Sekhar@529");	
	}

	@When("^User provided \"([^\"]*)\" and \"([^\"]*)\"$")
	public void doLoginWithCredentials(String arg1, String arg2) throws Throwable 
	{
		login.getUserName().sendKeys(arg1);
		login.getPassword().sendKeys(arg2);
	}

	@When("^I entered credentials to login$")
	public void enterCredentialsFromTables(DataTable credentials) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<dList<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		//List<List<String>> data = credentials.raw();
		for(Map<String, String> data1 : credentials.asMaps(String.class, String.class)) {
			login.getUserName().sendKeys(data1.get("UserName"));
			login.getPassword().sendKeys(data1.get("Password"));		
		}
		//login.getUserName().sendKeys(data.get(1).get(0));
		//login.getPassword().sendKeys(data.get(1).get(1));
		System.out.println(" Entered credentials from data table");
	}

	@When("^Enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_and(String arg1, String arg2) throws Throwable
	{
		login.getUserName().sendKeys(arg1);
		login.getPassword().sendKeys(arg2);
		System.out.println("Entered username and password from Examples");
	}


	
}
