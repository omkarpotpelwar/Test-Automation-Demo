package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifySearchResults {
	
	
	//returns the top 5 search results 
	public static String[] fetchResults(WebDriver driver) {
		String[] collegeResults = new String[5];
		
		collegeResults[0] = driver.findElement(By.cssSelector("a[href='/Colleges/Asan-Memorial-College-of-Arts-and-Science']")).getText();
		
		collegeResults[1] = driver.findElement(By.xpath("//a[normalize-space()='Ethiraj College']")).getText();
		
		collegeResults[2] = driver.findElement(By.xpath("//a[normalize-space()='Loyola College Chennai']")).getText();
		
		collegeResults[3] = driver.findElement(By.xpath("//a[normalize-space()='Madras Christian College Chennai']")).getText();
		
		collegeResults[4] = driver.findElement(By.cssSelector("a[href='/Colleges/Mohamed-Sathak-College-of-Arts-and-Science']")).getText();
		
		return collegeResults;
		
	}
	
	//verifies the results are correct or not
	public static boolean checkResults(String[] results) {
		boolean cityCheck = false;
		boolean courseCheck = false;
		for(int i=0;i<results.length;i++) {
			if(results[i].contains("Science")) {
				courseCheck = true;
				break;
			}
		}
		
		for(int i=0;i<results.length;i++) {
			if(results[i].contains("Chennai")) {
				cityCheck = true;
				break;
			}
		}
		if(cityCheck && courseCheck) {
			return true;
		}
		return false;
		
	}

}
