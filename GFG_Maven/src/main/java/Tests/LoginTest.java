package Tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import GFG_Maven.GFG_Maven.LoginPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest {
	
	public WebDriver driver;
	public LoginPage loginPage;
	private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);
	
	@BeforeTest
	public void launch() {
		logger.info("SLF4J Log: In the Before Test Block");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.gumtree.com/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Login() {
		logger.info("SLF4J Log: In the Test Block");
		loginPage = new LoginPage(driver);
		loginPage.enterEmail("upadhyaysawan1234@gmail.com");
		loginPage.enterPassword("Test@1234");
		loginPage.clickLogin();
	}
	
	@AfterTest
	public void quit() {
		logger.info(" SLF4J Log: In the After Test Block ");
		logger.info("Test Comment");
		driver.quit();
	}
}