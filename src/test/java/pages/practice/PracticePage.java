package pages.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import setup.BaseTest;

public class PracticePage extends PracticeUIElements {

	public PracticePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void click_btnAddCart() throws Exception{
		
		try {
			btnAddCart.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton agregar al carrito , busqueda por name");
			
		}
	}
	
	public void click_btIiconoCart() throws Exception{
		
		try {
			iconoCart.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click carrito de compras , busqueda por className");
			
			
		}
	}
	
	public void click_linkedin() throws Exception{
		
		try {
			linkedin.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en linkedin , busqueda por linkText");
			
		}
	}
	public void validad_imgSwanisVisible() throws Exception{
		
		try {
			imgSwag.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar buscar la imagin swag, busqueda por tagName");
			
		}
	}
	
	public void llenarFormularioConCSS(String name, String password, int postal_Code) throws Exception{
		
		try {
			//firstName.sendKeys(name);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#first-name"))).sendKeys(name);
			lastName.sendKeys(password);
			postalCode.sendKeys(String.valueOf(postal_Code));
			
		}catch (Exception e) {
			throw new Exception ("Error al llenar formulario, busqueda por css" + e.getMessage());
			
		}
	}
	
	public void click_btnContinuar() throws Exception{
		
		try {
			btnContinuar.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton continuar, busqueda por css" + e.getMessage());
			
		}
	}
	
	
	public void click_btnCancel() throws Exception{
		
		try {
			btnCancel.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton cancelar, busqueda por css" + e.getMessage());
			
		}
	}
	
	public void click_padreHijobtnRemove() throws Exception{
		
		try {
			padreHijobtnRemove.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton remove, busqueda por css" + e.getMessage());
			
		}
	}
	
	public void click_hermanoSigueintebtnCart() throws Exception{
		
		try {
			hermanoSigueintebtnCart.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton cart, busqueda por css" +e.getMessage());
			
		}
	}
	
	public void click_btnCheckOut() throws Exception{
		
		try {
			btnCheckOut.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton cart, busqueda por css" + e.getMessage());
			
		}
	}
	
	public void click_btnContinueShopping() throws Exception{
		
		try {
			btnContinueSShopping.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en boton continueShoping, busqueda por css" + e.getMessage());
			
		}
	}
	

}
