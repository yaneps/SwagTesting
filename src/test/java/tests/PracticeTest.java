package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;

import helpers.DataDriven;
import helpers.Generics;
import pages.MyAccount.MyAccountPage;
import pages.facebook.FacebookPage;
import pages.head.HeadPage;
import pages.login.LoginPage;
import pages.practice.PracticePage;
import setup.BaseTest;

class PracticeTest extends BaseTest{

	@Test
	void practiceNewElementsAndcssSelector() throws Exception{
		
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		getDriver().get(DataDriven.URL_LOGIN);
		
		//HACEMOS LOGIN
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		Generics.saveEvidencePage(getDriver(), testName);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		PracticePage practicePage = new PracticePage(getDriver());
		practicePage.click_btnAddCart();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		practicePage.click_btIiconoCart();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		practicePage.click_btnCheckOut();
		Generics.saveEvidencePage(getDriver(), testName);
		
		practicePage.llenarFormularioConCSS(DataDriven.NAME, DataDriven.LASTNAME, DataDriven.POSTAL_CODE);
		Generics.saveEvidencePage(getDriver(), testName);
		
		practicePage.click_btnContinuar();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		practicePage.click_btnCancel();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		practicePage.click_hermanoSigueintebtnCart();
		Generics.saveEvidencePage(getDriver(), testName);
		
		practicePage.click_padreHijobtnRemove();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//practicePage.click_btnContinueShopping();
		//Generics.saveEvidencePage(getDriver(), testName);
		
		
	}

	
	@Test
	void seleccionar_combo() throws Exception{
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		getDriver().get(DataDriven.URL_LOGIN);
		//HACEMOS LOGIN
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		//SELECCIONAMOS COMBO A TO Z POR TEXT
		MyAccountPage myAccount = new MyAccountPage(getDriver());
		//myAccount.seleccionar_Orden_AtoZ();
		//Thread.sleep(2000);
		//Generics.saveEvidencePage(getDriver(), testName);	
		//SELECCIONAMOS DEL COMBO Z TO A POR VALUE
		myAccount.seleccionar_Orden_ZtoA();
		Generics.saveEvidencePage(getDriver(), testName);	
		//SELECCIONAMOS DEL COMBO LOW TO HIGHT POR INDEX
		//myAccount.seleccionar_Orden_LowtoHigth();
		//Generics.saveEvidencePage(getDriver(), testName);
		//SELECCIONAMOS DEL COMBO HIGHT TO LOW POR SEND KEY
		//myAccount.seleccionar_Orden_HigthtoLow();
		//Generics.saveEvidencePage(getDriver(), testName);	
		
		String opcionEsperada = "Name (Z to A)";
		
		assertEquals(opcionEsperada,MyAccountPage.actualOpcion, "LAS OPCIONES COMPARADAS SON IGUALES");
		
	}
	
	@Test
	void seleccionarElementosComboPorArray() throws Exception{
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		getDriver().get(DataDriven.URL_LOGIN);
		//HACEMOS LOGIN
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);	
		
		//SELECCIONAMOS TODAS LAS OPCIONES DEL COMBO RECORRIENDO EL ARREGLO
		MyAccountPage myAccount = new MyAccountPage(getDriver());
		myAccount.seleccionar_ElementoComboUsandoArray();
		Generics.saveEvidencePage(getDriver(), testName);	
	}
	
	@Test
	void manejoVentanas() throws Exception{
		getDriver().get(DataDriven.URL_LOGIN);
		System.out.println("Nombre de la ventana por titulo: " + getDriver().getTitle());
		System.out.println("Nombre de la ventan por handle" + getDriver().getWindowHandles());
		
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//HACEMOS LOGIN
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
		
		//BAJAMOS EL SCROLL
		JavascriptExecutor jse1 = (JavascriptExecutor) getDriver();
		jse1.executeScript(DataDriven.WINDOW_SCROLL_BY_0_300);
		
		//DAMOS CLICK EN LINK SAUCELABS.COM -------------PENDIENTE MAPEAR EL ELEMENTO
		FacebookPage facebookPage = new FacebookPage(getDriver());
		facebookPage.click_urlFacebook();
		Thread.sleep(3000);

		
		//NOS POSICIONAMOS EN LA PAGINA SAUCELABS ---------PENDIENTE
		Generics.switchWindowByTitle(getDriver(), DataDriven.TITTLE_PAGE_SAUCELAB);
		Generics.saveEvidencePage(getDriver(), testName);
		
		//DAMOS CLICK EN TRY FOR FREE ---------PENDIENTE MAPEAR EL ELEMENTO
		facebookPage.click_btnTryFree();
		Generics.saveEvidencePage(getDriver(), testName);


		
	}
	
	@Test
	void getTittle() throws Exception{
		getDriver().get(DataDriven.URL_SAUCELABS);
		System.out.println("Nombre de la ventana por titulo: " + getDriver().getTitle());

		
		
	}
	
	@Test
	void alert()throws Exception{
		
		getDriver().get(DataDriven.URL_LOGIN);

		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//HACEMOS LOGIN
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME_PROBLEM, DataDriven.PASSWORD);
		loginPage.clickBottonLogin();
		Generics.saveEvidencePage(getDriver(), testName);
		Thread.sleep(2000);

		
		 // aceptar alert
		/*JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("alert('TEST ALERT');");
		Thread.sleep(3000);
		getWaiter().until(ExpectedConditions.alertIsPresent());
		getDriver().switchTo().alert().accept();
		*/
		// dimiss alert + getText
		/*js.executeScript("alert('TEST ALERT');");
		Thread.sleep(3000);
		getWaiter().until(ExpectedConditions.alertIsPresent());
		String textAlert = getDriver().switchTo().alert().getText();
		System.out.println("TEXTO ALERTA = " + textAlert);
		getDriver().switchTo().alert().dismiss();
		*/
		
		Alert alertConfirmation = getDriver().switchTo().alert();
		System.out.println("MENSAJE YANE"+ alertConfirmation.getText());
		Thread.sleep(5000);
		alertConfirmation.accept();
		
		
	
		
	}
}
