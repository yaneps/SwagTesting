package pages.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.DataDriven;

public class PracticeUIElements {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public PracticeUIElements(WebDriver driver) {
		
		this.driver = driver;
		this.wait = new WebDriverWait(driver, DataDriven.MAX_WAIT_TIME);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name = "add-to-cart-sauce-labs-bike-light")
	WebElement btnAddCart;
	
	@FindBy (className = "shopping_cart_link")
	WebElement iconoCart;
	
	@FindBy (linkText = "LinkedIn")
	WebElement linkedin;
	
	@FindBy (partialLinkText = "In")
	WebElement InLinkedin;
	
	@FindBy (tagName= "img")
	WebElement imgSwag;	
	
	@FindBy (css = "#first-name")
	WebElement firstName;
		
	@FindBy (css= "input[id=\'last-name\']")
	WebElement lastName;
	
	@FindBy (css = "input[id='postal-code'][name='postalCode']")
	WebElement postalCode;
	
	@FindBy (css = "#continue")
	WebElement btnContinuar;
	
	@FindBy (css = "*[id=\'cancel\']")
	WebElement btnCancel;
	
	@FindBy (css= "div > #remove-sauce-labs-bike-light")
	WebElement padreHijobtnRemove;
	
	@FindBy (css = "div + #shopping_cart_container")
	WebElement hermanoSigueintebtnCart;
	
	@FindBy (css = "#checkout")
	WebElement btnCheckOut;
	
	@FindBy (css = ".btn btn_secondary back btn_medium#continue-shopping")
	WebElement btnContinueSShopping;
	
	//PENDIENTE PRUEBA CSS .CLASS NAME
	
	
	
	
	
	
	
	
	

}
