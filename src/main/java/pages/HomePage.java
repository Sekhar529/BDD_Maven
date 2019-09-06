package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import resources.BaseClassForBrowserLaunch;

public class HomePage extends BaseClassForBrowserLaunch{

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "mainpanel")
	private WebElement mainFrame;
	 
	@FindBy(xpath = "//table//td[contains(text(),'raja')]")
	private WebElement user;
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginUser() {
		return user.getText();
	}
}