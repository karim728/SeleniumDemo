package testCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageCases {

	private static WebDriver driver = new  ChromeDriver();
	private static  HomePage homePage;
//	public HomePageCases(WebDriver driver) {
//		this.driver = driver;
//	}
	
	@Test(priority = 1)
	public static void clickCategotyBox() {
		WebElement categoryBox =homePage.getCategoryBox(driver);
		homePage.options(driver).selectByIndex(2);
		categoryBox.click();
		Assert.assertTrue(homePage.getCategoryOptionBox(driver).isDisplayed());
	}
	
	@Test(priority = 2)
	public static void selectCategory() {
		WebElement categoryBox =homePage.getCategoryBox(driver);
		homePage.options(driver).selectByIndex(0);
		categoryBox.click();
	}
	
	@Test(priority = 3)
	public static void selectSale() {
		WebElement categoryBox =homePage.getCategoryBox(driver);
		homePage.options(driver).selectByIndex(1);
		categoryBox.click();
	}
	
	@Test(priority = 4)
	public static void selectRecruiting() {
		WebElement categoryBox =homePage.getCategoryBox(driver);
		homePage.options(driver).selectByIndex(2);
		categoryBox.click();
	}
	
	@Test(priority = 5)
	public static void selectGeneralInfo() {
		WebElement categoryBox =homePage.getCategoryBox(driver);
		homePage.options(driver).selectByIndex(3);
		categoryBox.click();
	}
	
	@Test(priority = 6)
	public static void typeName() {
		homePage.getNameBox(driver).sendKeys("TestName");
		Assert.assertNotNull(homePage.getNameBox(driver).getText());
	}
	
	@Test(priority = 7)
	public static void typeEmail() {
		homePage.getEmailBox(driver).sendKeys("Email@Test.com");
		Assert.assertNotNull(homePage.getEmailBox(driver).getText());
	}
	
	@Test(priority = 8)
	public static void typeMessage() {
		homePage.getMessageBox(driver).sendKeys("This is just an automation test demo");
		Assert.assertNotNull(homePage.getMessageBox(driver).getText());
	}
	
	@Test(priority = 9)
	public static void submit() {
		homePage.getSubmitbtn(driver).click();
	}
	
	@BeforeTest
	public static void base() {
		driver.get("https://www.corporatebrokers.com/");
	}
	
	@AfterTest
	public static void afterTest() {
		driver.quit();
	}
	
	@AfterMethod
	public static void afterMethod() throws InterruptedException {
		Thread.sleep(5000);
	}
}
