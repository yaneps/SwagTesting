package pages.MyAccount;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MyAccountUIElements{

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
	

}
