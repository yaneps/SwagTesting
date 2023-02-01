package pages.head;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;
import setup.BaseTest;

public class HeadUIElements{
	
	WebDriver driver;
	WebDriverWait wait;
	
	public HeadUIElements(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
	WebElement iconoCart;
	
	@FindBy (xpath ="//a[@href = \'https://www.facebook.com/saucelabs\']")
	WebElement iconoFacebook;
	
	@FindBy (xpath = "//a[contains(text(), 'LinkedIn')]")
	WebElement iconoLinkedin;
	
	@FindBy (id = "react-burger-menu-btn")
	WebElement menu;
	
	@FindBy (xpath = "//a[text() = 'Logout']")
	WebElement subMenu;
	
	

}
