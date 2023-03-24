package Testing;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Activity {
	
	/*
	 * public static void main (String[] args) throws InterruptedException {
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\chromedriver_win32\\chromedriver.exe");
	 * 
	 * WebDriver driver=new ChromeDriver();
	 * 
	 * String url = "https://www.eduvidya.com/";
	 * 
	 * driver.get(url);
	 * 
	 * driver.findElement(By.xpath("//a[normalize-space()='Colleges']")).click();
	 * 
	 * Thread.sleep(5000);
	 * 
	 * Select drpCourse = new Select(driver.findElement(By.xpath(
	 * "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]"
	 * )));
	 * 
	 * drpCourse.selectByVisibleText("Science");
	 * 
	 * Select drpCity = new Select(driver.findElement(By.xpath(
	 * "/html[1]/body[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/select[1]"
	 * )));
	 * 
	 * drpCity.selectByVisibleText("Chennai");
	 * 
	 * driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
	 * 
	 * driver.close();
	 * 
	 * 
	 * }
	 */
	
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void dropDownForCourses(WebDriver driver,String text) {
		WebElement element = driver.findElement(By.id("ddl_Category"));
		Select selectCourse = new Select(element);
		selectCourse.selectByVisibleText(text);
	}
	
	public static void dropDownForCities(WebDriver driver,String text) {
		WebElement element = driver.findElement(By.id("ddl_City"));
		Select selectCourse = new Select(element);
		selectCourse.selectByVisibleText(text);  
	}

}
