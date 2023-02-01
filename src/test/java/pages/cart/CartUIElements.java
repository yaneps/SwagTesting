package pages.cart;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class CartUIElements {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public CartUIElements(WebDriver driver) {
		
		this.driver=driver;
		this.wait= new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME );
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
	WebElement lblProduct;
	
	
	@FindBy(xpath = "//div [contains(text(), 'Sauce Labs Backpack')]" )
	WebElement lblProductEspecific;
	
	@FindBy(id = "checkout")
	WebElement btnCheckOut;
	
	@FindBys ({@FindBy(xpath="//div/button[contains(@class, 'btn btn_secondary btn_small cart_button')]")})	
	List<WebElement> productos;
	String productoSeleccionar = "id='remove-sauce-labs-bolt-t-shirt'";
	
	String lblproductoTshirt = "Sauce Labs Bolt T-Shirt";
	
	@FindBy (xpath = "//div[contains(text(), Sauce Labs Bolt T-Shirt])")
	WebElement lblproductoTshirtvisible;
	
	
}
