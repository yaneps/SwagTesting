package pages.head;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import helpers.DataDriven;
import setup.BaseTest;
import setup.Browsers;
import setup.Drivers;

public class HeadPage extends HeadUIElements {
	
	
	public HeadPage(WebDriver driver) {		
		super(driver);

		// TODO Auto-generated constructor stub
	}

	public void click_iconoCart() throws Exception{
		
		try {
			
			
			iconoCart.click();
			
		}catch(Exception e) {
			 throw new Exception();
		}
		
	}
	
	
	public void click_iconoFacebook() throws Exception {
		try {			
			iconoFacebook.click();
		}catch (Exception e) {
			throw new Exception ("Error al dar click en el icono facebook" + e.getMessage());
		}
	}
	
	
	
	public void click_iconoLinkedin() throws Exception {
		
		try {
			iconoLinkedin.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en el icono LInkedin" + e.getMessage());
		}
	}
	
	
	
	
	public void click_logOut() throws Exception{
		try {
			
		
			Actions driverActions = new Actions(driver);
	        driverActions.moveToElement(menu)
	        		.click(menu)
	        		.pause(3000)
	        		.moveToElement(subMenu)
	        		.click(subMenu)
	        		.build()
	        		.perform();			
		}catch (Exception e) {
			
			throw new Exception ("Error al dar click en logOut  " + e.getMessage(), e);
		}
	}
	
	
	

}
