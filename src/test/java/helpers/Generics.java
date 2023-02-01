package helpers;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import setup.BaseTest;

public class Generics extends BaseTest{

	
	public static void saveEvidencePage(WebDriver driver, String testName) throws Exception {
		try {
			TakesScreenshot captura = (TakesScreenshot) driver;
			File tmpFile = captura.getScreenshotAs(OutputType.FILE);
			
			//obtener directorio especifico para fecha de ejecucion			
			LocalDate fecha = LocalDate.now();
		    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyLLdd");
		    String fechaEjecucion = fecha.format(dtf);

			//calcular el directorio de salida para el screenshot
			String pathEvidencia = DataDriven.EVIDENCIA_DIR 
									+ fechaEjecucion 
									+ File.separator 
									+ testName 
									+ File.separator;
			System.out.println(pathEvidencia);
			
			//validar si existe el directorio de salida, de lo contrario se crea
			File directorio = new File(pathEvidencia);

			if(!directorio.exists()){
				 System.out.println("CREAR ARCHIVO");
				 directorio.mkdirs();
			}		
			
			String screenshot = pathEvidencia + "screenshot_" + System.currentTimeMillis() + ".png";
			tmpFile.renameTo(new File(screenshot));

		}
		catch(Exception ex) {
			System.out.println("Error al hacer tomar screenshot: " + ex.getMessage());
		} 
	}
	
	public static boolean switchWindowByTitle(WebDriver driver, String windowsTitle) throws Exception {
		try {
			Boolean result = false;

	        for (String handle: driver.getWindowHandles()) {
	        	driver.switchTo().window(handle);
	       
	        	if (driver.getTitle().toString().contains(windowsTitle)) {
	        		result = true;
	        		break;
	        	}
	        }
	        return result;
		}
		catch(Exception ex) {
			throw new Exception("Error al hacer switch a la ventana: " + windowsTitle);
		} 
	}
	
	
	public void sCrollDown() throws Exception{
		try {
			JavascriptExecutor jse = (JavascriptExecutor) getDriver();
			jse.executeScript(DataDriven.WINDOW_SCROLL_BY_0_1000);
			
		}catch(Exception e) {
			throw new Exception ("Error albajaar el scroll" + e.getMessage());
		}
		
		
	}
	
	
	
	

}
