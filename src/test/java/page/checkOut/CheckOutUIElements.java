package page.checkOut;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class CheckOutUIElements {
	WebDriver driver;
	WebDriverWait wait;
	
	public CheckOutUIElements(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id = "first-name")
	WebElement txtFirstName;
	
	@FindBy (id="last-name")
	WebElement txtLastName;
	
	@FindBy (id = "postal-code")
	WebElement txtPostalCode;
	
	@FindBy (id = "continue")
	WebElement btnContinue;
	
	
}
