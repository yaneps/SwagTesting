package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import helpers.DataDriven;
import helpers.Generics;
import pages.MyAccount.MyAccountPage;
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

}
