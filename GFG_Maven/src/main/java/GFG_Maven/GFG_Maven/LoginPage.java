package GFG_Maven.GFG_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private CommonMethods commonMethods;
	
	public LoginPage(WebDriver driver) {
		this.commonMethods = new CommonMethods(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement login;
	
	
	public void enterEmail(String text) {
		commonMethods.waitAndEnter(email, text);
	}
	
	public void enterPassword(String text) {
		commonMethods.waitAndEnter(password, text);
	}
	
	public void clickLogin() {
		commonMethods.waitAndClick(login);
	}

	
	
	
}
