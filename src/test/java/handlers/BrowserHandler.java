package handlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import readers.PropertiesReader;

public class BrowserHandler {
	
	public WebDriver getWebDriver() {
		PropertiesReader propertiesReader = new PropertiesReader();
		String browserName = propertiesReader.fetchBrowserName();
		WebDriver driver = null;
		
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			break;
			
		default:
			System.out.println("The Browser name is not same as defined");
			break;
		}
		
		return driver;
	}
	
	// method to goto the url fetched from properties file
	public void launchApplication(WebDriver driver) {
		PropertiesReader prop = new PropertiesReader();
		String url = prop.fetchUrl();
		driver.get(url);
	}
	
	// method to close the browser
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}

}
