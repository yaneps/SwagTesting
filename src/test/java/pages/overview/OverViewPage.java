package pages.overview;

import org.openqa.selenium.WebDriver;

public class OverViewPage extends OverViewUIElements{

	public OverViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void click_btnFinish()throws Exception {
		try {
			btnFinish.click();
			
		}catch (Exception e) {
			throw new Exception ("Error al dar click en el boton finish" + e.getMessage());
		}
		
	}
	

}
