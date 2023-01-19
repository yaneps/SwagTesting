package helpers;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generics {

	
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

}
