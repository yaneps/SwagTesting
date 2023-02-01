package pages.complete;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class CompletePageUIElements {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public CompletePageUIElements(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME);
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "//h2 [contains(text(), 'THANK YOU FOR YOUR ORDER')]")
	WebElement lblComplete;
	

}
