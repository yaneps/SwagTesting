package pages.cart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import setup.BaseTest;

public class PageCart extends CartUIElements {
	
	int posicionLastProduct = productos.size()-1;


	public PageCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	

	
	public boolean valida_lblProduct() throws Exception{
		
		try {
			return lblProduct.isDisplayed();
			
		}catch (Exception e) {
			throw new  Exception();
		}
		
	}
	public String lblProductEspecific() throws Exception{
		
		try {
			return lblProductEspecific.getText();
			
		}catch (Exception e) {
			throw new  Exception("Error al obtener texto del producto" + e.getMessage());
		}
		
	}
	
	public void clickBtnCheckOut() throws Exception{
		
		try {
			btnCheckOut.click();
		}catch (Exception e) {
			throw new  Exception ("Error al dar click en el boton ChecKOUT" + e.getMessage()); 
		}
	}
	
	public void click_RemoveSpecificProducto() throws Exception{
		try {
			for (int i=0; i<productos.size(); i++) {
				
				if (productos.get(i).getAttribute("outerHTML").contains(productoSeleccionar)){
						productos.get(i).click();	
						break;	
				}
			}	
		}catch(Exception e) {
			throw new Exception ("Error al dar click en remove del producto 3" + e.getMessage());
			}
	}
	
	
	public boolean click_productovisible() throws Exception{
		try {
			for (int i=0; i<productos.size(); i++) {
				
				if (productos.get(i).getText().contains(lblproductoTshirt)){
					
					 return lblproductoTshirtvisible.isDisplayed();
				}
				
			}
			return false;
		}catch(Exception e) {
			throw new Exception ("Error al validar el producto 3 visible" + e.getMessage());
			}
	}
	
	public void click_removeFirstProduct() throws Exception{
		try {
			for (int i=0; i<productos.size(); i++) {
				
				
				productos.get(0).click();
				}
		}catch(Exception e) {
			throw new Exception ("Error al dar click en remove del first producto " + e.getMessage());
			}
	}

	public void click_removeLastProduct() throws Exception{
		try {
			for (int i=0; i<productos.size(); i++) {
				//int tamano=productos.size();
				//System.out.print("TAMANO DE LA LISTA DE PRODUCTOS"+tamano);
				
				if(i == productos.size()-1) {
					productos.get(productos.size()-1).click();
					// 
					}
				}
		}catch(Exception e) {
			throw new Exception ("Error al dar click en remove del ultimo producto" + e.getMessage());
			}
	}

	public boolean lbl_visibleproduct3() throws Exception{
		try {	
					return productos.get(posicionLastProduct).isDisplayed();
			
		}catch(Exception e) {
			throw new Exception ("Error al validar el producto 3 visible" + e.getMessage());
			}
	}
	
}

