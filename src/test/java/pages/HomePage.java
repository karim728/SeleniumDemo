package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
	public static WebElement getCategoryBox(WebDriver driver) {
		return driver.findElement(By.id("input_1_1"));
	}
	
	public static WebElement getCategoryOptionBox(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[2]/div[6]\r\n"));
	}
	
	public static Select options(WebDriver driver) {
		return new Select(getCategoryBox(driver));
	}
	
	public static WebElement getNameBox(WebDriver driver) {
		return driver.findElement(By.id("input_1_2"));
	}
	
	public static WebElement getEmailBox(WebDriver driver) {
		return driver.findElement(By.id("input_1_4"));
	}
	
	public static WebElement getMessageBox(WebDriver driver) {
		return driver.findElement(By.id("input_1_5"));
	}
	
	public static WebElement getSubmitbtn(WebDriver driver) {
		return driver.findElement(By.id("gform_submit_button_1"));
	}

}
