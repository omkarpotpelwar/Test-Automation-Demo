package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import readers.ExcelReader;
import handlers.BrowserHandler;

public class SearchForColleges {
	
public static void main(String[] args) throws Exception {
		
		BrowserHandler browserHandler = new BrowserHandler();
		WebDriver driver = browserHandler.getWebDriver();
		browserHandler.launchApplication(driver);
		driver.manage().window().maximize();
		
		WebElement element = null; 
		element = driver.findElement(By.linkText("Colleges"));
		Activity.clickOnElement(element);
		
		driver.navigate().back();
		element = driver.findElement(By.linkText("Colleges"));
		Activity.clickOnElement(element);

		String[] dataArray = ExcelReader.getDataFromExcel();
		String course = dataArray[0];
		String city = dataArray[1];
		
		Activity.dropDownForCourses(driver , course);
		Activity.dropDownForCities(driver , city);
		
		element = driver.findElement(By.id("btnSearch"));
		Activity.clickOnElement(element);
		
		String[] results = VerifySearchResults.fetchResults(driver);
		boolean test = VerifySearchResults.checkResults(results);
		if(test) {
			browserHandler.closeBrowser(driver);
		}else {
			System.out.println("Test Case has Failed");
		}
		
	}

}
