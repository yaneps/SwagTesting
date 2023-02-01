package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import helpers.DataDriven;
import helpers.Generics;
import pages.MyAccount.MyAccountPage;
import pages.head.HeadPage;
import pages.login.LoginPage;
import setup.BaseTest;

class JUnitLoginTest extends BaseTest{

	@Test
	void LoginUserCorrect() throws Exception{
		
		//Nombre del test
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//Ir a url login
		getDriver().get(DataDriven.URL_LOGIN);
				
		//login => LoginPage
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		Generics.saveEvidencePage(getDriver(), testName);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		//VALIDAR EL LOGIN
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		assertTrue(myAccountPage.validaMyAccountPageVisible(), "ASSERT MY ACCOUNT PAGE VISIBLE");
		

	}
	
	@Test
	void LoginEmailIncorrecto() throws 	Exception{
		
		//ir a url login
		getDriver().get(DataDriven.URL_LOGIN);
		
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME_INCORRECTO, DataDriven.PASSWORD_INCORRECTO);
		loginPage.clickBottonLogin();
		assertTrue(loginPage.validaEmailIncorrecto(), "ASSERT ETIQUETA EMAIL INCORRECTO VISIBLE");
		
	}
	
	@Test
	void logOut() throws Exception {
		
		//Nombre del test
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
				
		//Ir a url login
		getDriver().get(DataDriven.URL_LOGIN);
		
		//INICIAR SESION
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		//HACER LOGOUT
		HeadPage headPage = new HeadPage(getDriver());
		headPage.click_logOut();
		Generics.saveEvidencePage(getDriver(), testName);	

		
		assertTrue(loginPage.visible_btnLogin(), "el boton login es visible");
		
		
	}

}
