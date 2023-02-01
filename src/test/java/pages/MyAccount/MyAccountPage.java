package pages.MyAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage extends MyAccountUIElements{
	
	public static String actualOpcion;

	public MyAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean validaMyAccountPageVisible() throws Exception {
		try {
			return lblMyAccount.isDisplayed() ? true : false;
		}catch(Exception e) {
			
			throw new Exception ("Error al validar etiqueta my account" + e.getMessage());
		}
		
	}
	
	public void click_btnAddCart() throws Exception {
		
		try {
			btnAddCart.click();
					
		}catch(Exception e) {
			
			throw new Exception("Error al dar click en boton agregar al carrito" + e.getMessage());
			
		}
		
	}
	
	public void click_btnAddCartProducto2() throws Exception {
		
		try {
			btnAddCartProducto2.click();
					
		}catch(Exception e) {
			
			throw new Exception("Error al dar click en boton agregar al carrito producto 2" + e.getMessage());
			
		}
		
	}
	
	public void click_btnAddCartProducto3() throws Exception {
		
		try {
			btnAddCartProducto3.click();
					
		}catch(Exception e) {
			
			throw new Exception("Error al dar click en boton agregar al carrito producto 3" + e.getMessage());
			
		}
		
	}
	
	public void seleccionar_Orden_AtoZ() throws Exception {
		
		try {
			Select dropdown = new Select(comboOrden);
			dropdown.selectByVisibleText("Name (A to Z)");
			
		}catch(Exception e) {
			throw new Exception("Error al desplegar la lista del combo A to Z " + e.getMessage());
		}
	}
	
	
	
	public void seleccionar_Orden_ZtoA() throws Exception {
		
		try {
			Select dropdown = new Select(comboOrden);
			dropdown.selectByValue("za");
			actualOpcion = dropdown.getFirstSelectedOption().getText();
		}catch(Exception e) {
			throw new Exception("Error al desplegar la lista del combo Z to A " + e.getMessage());
		}
	}
	
	public void seleccionar_Orden_LowtoHigth() throws Exception {
		try {
			Select selectlista = new Select (comboOrden);
			selectlista.selectByIndex(2);
			
		}catch(Exception e) {
			throw new Exception("Error al desplegar la lista del combo Low to HIGHT " + e.getMessage());
		}
	}
	
	public void seleccionar_Orden_HigthtoLow() throws Exception {
		try {
			
			comboOrden.sendKeys("Price (high to low)");			
			
		}catch(Exception e) {
			throw new Exception("Error al desplegar la lista del combo HIGHT to Low " + e.getMessage());
		}
	}

	public void seleccionar_ElementoComboUsandoArray() throws Exception {
		try {
			
			String opciones = "Name (A to Z), Name (Z to A),Price (low to high),Price (high to low)";
			String multipleSel[] = opciones.split(",");
			
			for (String opcion : multipleSel) {
				new Select(comboOrden).selectByVisibleText(opcion);
				comboOrden.sendKeys(Keys.CONTROL);
			}
		}catch(Exception e) {
			throw new Exception("Error al seleccionar las multiples opciones" + e.getMessage());
		}
	}
}
