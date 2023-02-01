package pages.login;

import org.openqa.selenium.WebDriver;

public class LoginPage extends LoginUIElements {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void llenarFormulario(String name, String password) throws Exception  {
		
		try {
			txtUserName.sendKeys(name);
			txtPassword.sendKeys(password);
				
		}catch(Exception e) {
		throw new Exception("Error al llenar el formulario " + e.getMessage());
		}
	}
	
	
	public void clickBottonLogin() throws Exception{
		
		try {
			btnLogin.click();
		}catch (Exception e) {
			throw new Exception("Error al dar click en el boton Login" + e.getMessage());
		}
	}
	
	public boolean validaEmailIncorrecto() throws Exception{
		try {
			return lblEmailIncorrecto.isDisplayed();
			
		}catch (Exception e) {
			throw new Exception("Error al validar etiqueta; Email incorrecto" + e.getMessage());
		}
	}
	
	public boolean visible_btnLogin() throws Exception{
		try {
			return btnLogin.isDisplayed();
			
		}catch (Exception e) {
			throw new Exception("Error al validar que el boton login este visible" + e.getMessage());
		}
		
	}
	

}
