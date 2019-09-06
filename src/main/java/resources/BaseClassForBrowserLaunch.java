package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassForBrowserLaunch {
	
	public static WebDriver driver;	
	private static Properties prop;
	private static final String propertyFilePath = "../BDD_Maven/src/main/java/Config/config.properties";
	
	public BaseClassForBrowserLaunch() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream(propertyFilePath);
		
		if(!fis.equals(null)){
			prop.load(fis);
		}
		else {
			System.out.println("Property file: config.properties not found in class path");
		}
		prop.load(fis);
	}
	
	public void launchBrowserDriver() {
		
		String browserName 		=	 prop.getProperty("Browser");
		String applicationURL 	=    prop.getProperty("URL");
		
		if(browserName.equalsIgnoreCase("CH")) 
		{
			System.setProperty("webdriver.chorme.driver","../BDD_Maven/libraries/chromedriver.exe" );
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(applicationURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);						
		}
		
		else if(browserName.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver","../BDD_Maven/libraries/IEDriverServer.exe" );
			
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.ignoreZoomSettings().introduceFlakinessByIgnoringSecurityDomains().withInitialBrowserUrl("https://classic.crmpro.com/index.html");
						
			driver = new InternetExplorerDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(applicationURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);						
		}
		
		else if(browserName.equalsIgnoreCase("Edge")) 
		{
			System.setProperty("webdriver.edge.driver","../BDD_Maven/libraries/MicrosoftWebDriver.exe" );
									
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(applicationURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);						
		}

		else if(browserName.equalsIgnoreCase("FF")) 
		{
			System.setProperty("webdriver.gecko.driver","../BDD_Maven/libraries/geckodriver.exe" );
			
			FirefoxOptions options = new FirefoxOptions();
			options.setLegacy(true);
			
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			
			driver.get(applicationURL);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);						
		}
	}
	
	public void closeTheBrowser() {
		driver.close();
		//driver.quit();
	}
	

}
