package page.checkOut;

import org.openqa.selenium.WebDriver;

public class PageCheckOut extends CheckOutUIElements {

	public PageCheckOut(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void llenarFormulario(String name, String lastName, int postal_code ) throws Exception{
		
		try {
			txtFirstName.sendKeys(name);
			txtLastName.sendKeys(lastName);
			txtPostalCode.sendKeys(String.valueOf(postal_code));
			
		}catch (Exception e) {
			throw new Exception ("Error al llenar fomulario" + e.getMessage());
			
		}
	}
	
	public void click_btnContinue() throws Exception {
		
		try {
			btnContinue.click();
		}catch (Exception e) {
			throw new Exception("Error al dar click al boton continue despues de llenar formulario" + e.getMessage());
		}
	}
	

}
