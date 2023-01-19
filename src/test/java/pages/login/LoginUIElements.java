package pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class LoginUIElements {
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public LoginUIElements(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user-name") 
	WebElement txtUserName;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(id="login-button")
	WebElement btnLogin;
	
	@FindBy(xpath = "//div[@class = 'error-message-container error']")
	WebElement lblEmailIncorrecto;
	
	

}
