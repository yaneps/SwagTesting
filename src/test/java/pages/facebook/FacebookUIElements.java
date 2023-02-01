package pages.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class FacebookUIElements {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public FacebookUIElements(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME_30 );
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[contains(text(), 'Sauce Labs')]")
	WebElement lblFacebook;

	@FindBy(xpath = "//div/a[@href='https://l.facebook.com/l.php?u=https%3A%2F%2Fsaucelabs.com%2F%3Ffbclid%3DIwAR1huyk5Q_jfUKWi_UlM0mp2T07aD_5mDiXNDnnFVSowFn9U80hS_64V4Is&h=AT1YidKwfD_lackt92KPhkbUH7UYqTuJgQEcMtiRCmek2rmnCwhBa1k_jxsgxjD2-qINm45pLN-iaB8y8XSKzv0E6GAvWTGXp9GTJLq0DK2Mq2ZWoY5I4EdpLe95G3ClnBFJKvhOGOw']")
	WebElement urlFacebook;
	
	
	@FindBy(xpath = "//ul/li/a/span[contains(text(), 'Try it free')]")
	WebElement btnTryfree;
}
