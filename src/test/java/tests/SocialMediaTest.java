package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import helpers.DataDriven;
import helpers.Generics;
import pages.facebook.FacebookPage;
import pages.head.HeadPage;
import pages.head.HeadUIElements;
import pages.login.LoginPage;
import setup.BaseTest;

class SocialMediaTest extends BaseTest {
	


	@Test
	void validaAccesoFacebook()  throws Exception{
		
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//HACEMOS LOGIN
		getDriver().get(DataDriven.URL_LOGIN);
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//BAJAMOS EL SCROLL
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript(DataDriven.WINDOW_SCROLL_BY_0_1000);
		
		
		//DAMOS CLICK EN BOTON FACEBOOK
		HeadPage headPage = new HeadPage(getDriver());
		headPage.click_iconoFacebook();
		Generics.saveEvidencePage(getDriver(), testName);
		Thread.sleep(3000);

		//NOS POSICIONAMOS EN LA PAGINA DE FACEBOOK QUE SE ABRE
		Generics.switchWindowByTitle(getDriver(), "Sauce Labs | Facebook");
		Generics.saveEvidencePage(getDriver(), testName);

		//VALIDAMOS QUE SE INGRESO A LA PAGINA DE FACEBOOK
		FacebookPage facebookPage = new FacebookPage(getDriver());
		assertTrue (facebookPage.valida_lblFacebook(), "Se muestra correctamente la etiquete en facebook");
		Generics.saveEvidencePage(getDriver(), testName);

		
		
	}

}
