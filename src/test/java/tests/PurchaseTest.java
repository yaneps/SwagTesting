package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import helpers.DataDriven;
import helpers.Generics;
import page.checkOut.PageCheckOut;
import pages.MyAccount.MyAccountPage;
import pages.cart.PageCart;
import pages.complete.CompletePage;
import pages.head.HeadPage;
import pages.login.LoginPage;
import pages.overview.OverViewPage;
import setup.BaseTest;

class PurchaseTest extends BaseTest {

	@Test
	void AddCart() throws Exception {
		
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//HACEMOS LOGIN
		getDriver().get(DataDriven.URL_LOGIN);
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		Generics.saveEvidencePage(getDriver(), testName);
		loginPage.clickBottonLogin();
		
		//AGREGAMOS PRODUCTO AL CARRITO
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		myAccountPage.click_btnAddCart();
		Generics.saveEvidencePage(getDriver(), testName);
		HeadPage headPage = new HeadPage(getDriver());
		headPage.click_iconoCart();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//VALIDAMOS LA PRUEBA
		PageCart pageCart = new PageCart(getDriver());
		//assertTrue(pageCart.valida_lblProduct(), "ASSERT PRODUCT IS VISIBLE");
		assertEquals("Sauce Labs Backpack",pageCart.lblProductEspecific());
	}
	
	
	@Test 
	void checkOut() throws Exception{
		
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//HACEMOS LOGIN
		getDriver().get(DataDriven.URL_LOGIN);
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		Generics.saveEvidencePage(getDriver(), testName);
		loginPage.clickBottonLogin();
		
		//VAMOS AL CARRITO DE COMPRAS
		HeadPage headPage = new HeadPage(getDriver());
		headPage.click_iconoCart();
		
		//DAMOS CLICK EN  CHECKOUT
		PageCart pageCart = new PageCart(getDriver());
		pageCart.clickBtnCheckOut();
		
		//LlENAMOS FORMULARIO
		PageCheckOut pageCheckOut = new PageCheckOut(getDriver());
		pageCheckOut.llenarFormulario(DataDriven.NAME, DataDriven.LASTNAME, DataDriven.POSTAL_CODE);
		Generics.saveEvidencePage(getDriver(), testName);
		pageCheckOut.click_btnContinue();
		
		//REVISAMOS INFO Y DAMOS CLICK EN FINISH
		OverViewPage overViewPage = new OverViewPage(getDriver());
		Generics.saveEvidencePage(getDriver(), testName);
		overViewPage.click_btnFinish();
		
		// VALIDAMOS LA COMPRA
		CompletePage completePage = new CompletePage(getDriver());
		assertTrue(completePage.isDisplayed_lblComplete(), "La etiqueta de compra finalizada se mostro correctamente");		
		
	}
	
	@Test
	void eliminarProductoCarrito() throws Exception {
		String testName = new Object(){}.getClass().getEnclosingMethod().getName();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//HACEMOS LOGIN
		getDriver().get(DataDriven.URL_LOGIN);
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.llenarFormulario(DataDriven.USER_NAME, DataDriven.PASSWORD);
		Generics.saveEvidencePage(getDriver(), testName);
		loginPage.clickBottonLogin();
		
		//AGREGAMOS PRODUCTO 1 AL CARRITO
		MyAccountPage myAccountPage = new MyAccountPage(getDriver());
		myAccountPage.click_btnAddCart();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//AGREGAMOS PRODUCTO 2 AL CARRITO
		myAccountPage.click_btnAddCartProducto2();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//AGREGAMOS PRODUCTO 3 AL CARRITO
		myAccountPage.click_btnAddCartProducto3();
		Generics.saveEvidencePage(getDriver(), testName);
		
		//VAMOS AL CARRITO DE COMPRAS
		HeadPage headPage = new HeadPage(getDriver());
		headPage.click_iconoCart();
		Generics.saveEvidencePage(getDriver(), testName);

		//ELIMINAMOS EL PRODUCTO 3
		PageCart pageCart = new PageCart(getDriver());
		pageCart.click_RemoveSpecificProducto();
		//pageCart.click_removeFirstProduct();
		//pageCart.click_removeLastProduct();
		Generics.saveEvidencePage(getDriver(), testName);

		
		//assertFalse(pageCart.lbl_visibleproduct3(),"El producto 3 ya no se encuentra en la lista");
		assertFalse(pageCart.click_productovisible(),"El producto 3 ya no se encuentra en la lista");
		Generics.saveEvidencePage(getDriver(), testName);

		
				
	}

}
