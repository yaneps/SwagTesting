package pages.facebook;

import org.openqa.selenium.WebDriver;

public class FacebookPage extends FacebookUIElements {
	
	public FacebookPage(WebDriver driver) {
		super(driver);
	}
	
	
	public boolean valida_lblFacebook() throws Exception {
		
		try {
			
			return lblFacebook.isDisplayed();
			
		}catch (Exception e) {
			throw new Exception ("Error al mostrar la etique de  SAUCE LAB en facebook" + e.getMessage());
		}
	}

	public void click_urlFacebook() throws Exception {
		
		try {
			
			 urlFacebook.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en la url dE SAUCELAB.COM" + e.getMessage());
		}
	}

	
	
}
