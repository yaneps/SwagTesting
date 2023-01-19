package pages.MyAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class MyAccountUIElements {
	
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public MyAccountUIElements(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME);
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class = 'app_logo']")
	WebElement lblMyAccount;
	

}
