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
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	WebElement btnAddCart;
	
	@FindBy (id ="add-to-cart-sauce-labs-bike-light")
	WebElement btnAddCartProducto2;
	
	@FindBy(css = "button[id^='add'")
	WebElement btnAddCartProducto3;
	
	@FindBy (xpath = "//select [@class = 'product_sort_container']" )
	WebElement comboOrden;
	
	

}
