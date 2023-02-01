package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import helpers.DataDriven;

public class BaseTest {
	
	private WebDriver driver;
	private WebDriverWait wait;

	
	public WebDriverWait getWaiter() {
		this.driver=driver;
		return this.wait= new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME );
		
	}
	
	protected WebDriver getDriver() {
		return this.driver;	
	}
	
	@BeforeEach
	public void init () throws Exception{
		
		Drivers Drivers  = new Drivers();
		driver = Drivers.getDriver(Browsers.CHROME);
		driver.get(DataDriven.URL_LOGIN);
		driver.manage().deleteAllCookies();
		
	}
	
	@AfterEach
	public void end () throws Exception {
		
		driver.quit();
		
	}
	
	
	
}
