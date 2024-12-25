package GFG_Maven.GFG_Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	private WebDriver driver;
	
	public CommonMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitAndEnter(WebElement ele, String text) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.sendKeys(text);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void waitAndClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		try {
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
