package pages.complete;

import org.openqa.selenium.WebDriver;

public class CompletePage extends CompletePageUIElements {

	public CompletePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isDisplayed_lblComplete() throws Exception {
		
		try {
			return lblComplete.isDisplayed();
			
		}catch (Exception e) {
			throw new Exception("Error al cargar la etiqueta THANK YOU FOR YOUR " + e.getMessage());
		}
	}
	
	

}
