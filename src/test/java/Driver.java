import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import testCases.HomePageCases;

public class Driver {
	private static WebDriver driver = new  ChromeDriver();
//	private static HomePageCases homePageCases = new HomePageCases(driver);

	public static void main(String[] args) throws InterruptedException {
		
		
	}
	
//	@BeforeTest
//	public static void base() {
//		driver.get("https://www.corporatebrokers.com/");
//	}
//	
//	@Test
//	public static void testCases() throws InterruptedException {
//		
//		homePageCases.clickCategotyBox();
//		Thread.sleep(5000);
//		homePageCases.selectCategory();
//		Thread.sleep(5000);
//		homePageCases.selectSale();
//		Thread.sleep(5000);
//		homePageCases.selectRecruiting();
//		Thread.sleep(5000);
//		homePageCases.selectGeneralInfo();
//		Thread.sleep(5000);
//	}
//	
//	@AfterTest
//	public static void afterTest() {
//		driver.quit();
//	}

}
