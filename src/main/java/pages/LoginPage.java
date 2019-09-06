package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClassForBrowserLaunch;


public class LoginPage extends BaseClassForBrowserLaunch
{
		private String elementStatus = "Not found";
		
		//========= PageFactory - Object Repository ==========
		
		@FindBy(name = "username")
		@CacheLookup
		private WebElement userName;
		
		@FindBy(name = "password")
		@CacheLookup
		private WebElement password;
		
		@FindBy(xpath = "//input[@type ='submit' and @value='Login']")
		@CacheLookup
		private WebElement loginPageSubmit;
		
		@FindBy(xpath = "//div[@id='navbar-collapse']//li[2]/a")
		@CacheLookup
		private WebElement signUpLnk;
		
		@FindBy(linkText ="Sign Up")
		@CacheLookup
		private WebElement signUpLink;
		
		@FindBy(xpath="//a[@id='bubble-image']")
		@CacheLookup 
		public WebElement image;
		
		//--------- FindBys annotations works as AND operator  
		// It will return a list of all web elements if if satisfies all findBy condition ------------
		@FindBys
		({
			@FindBy(how = How.ID_OR_NAME,using="submit"),
			@FindBy(how= How.UNSET,using="Login")
		}) private WebElement submit;
		
		
		//========== Initialize the Page Objects ==============
		public LoginPage() throws IOException
		{
			super();
			PageFactory.initElements(driver, this);
		}
		

		//------------------Actions------------------
		public String getLoginPageTitle() {
			return driver.getTitle();		
			
		}
		
		public WebElement getUserName() {
			return userName;
		}
		public WebElement getPassword() {
			return password;
		}
		public WebElement getLoginButton() {
			return loginPageSubmit;
		}
		public WebElement getSignUpLink() {
			return signUpLink;
		}
		
		
		
		
		public void checkAndClickSignUp() throws InterruptedException	{
			
			Thread.sleep(1500);
			if(signUpLink.isDisplayed() == true) {
				elementStatus = "Found";
				System.out.println("Element"+signUpLink+"Found");
				signUpLink.click();
				
			}else
				System.out.println("No such element:"+signUpLink+"found");
			//WebElement signUpLink = explicitWait.until(ExpectedConditions.elementToBeClickable(driver.findElements(By.xpath("//div[@id='navbar-collapse']//li[2]/a")));
			//signUpLink.click();
			//return new Pair<Object,String>(new SignUpPage(), elementStatus); 
		}
		
		public HomePage doLogin(String uname,String psw) throws InterruptedException, IOException 
		{
			userName.clear();
			password.clear();
			userName.sendKeys(uname);
			password.sendKeys(psw);
			Thread.sleep(100);
			//explicitWait = new WebDriverWait(driver, 500);
			//driver.findElement(new ByAll(By.xpath("//input[@type ='submit' and @value='Login']"),By.id(""))).click();
			//WebElement loginPageSubmit1 = explicitWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type ='submit' and @value='Login']")));
			loginPageSubmit.click();
			return new HomePage();
		}
	

}


