package setup;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {

	private WebDriver driver;
	
	public WebDriver getDriver(Browsers navegador ) throws Exception {
		
		switch(navegador) {
		case CHROME:
			driver = NavegadorChrome();
			break;
		
		case FIREFOX:
			break;
		
		case EDGE:
			driver=NavegadorEdge();
			break;
		default:			
		}
		return driver;
	}
	
	private static String DRIVER_DIR = System.getProperty("user.dir")
			//+"/"
			//File.pathSeparator
			//+"Documents"
			//+File.pathSeparator
			//+"Taller_Selenium_Java"
			//+ File.separator
			//+ "ejercicios_ejemplos"
			//+ File.separator
			//+ "swagTesting"
			+ File.separator
			+ "drivers"
			+ File.separator;
	
	private String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
	private String FIREFOX_DRIVER_PATH = DRIVER_DIR + "chromedriver.exe";
	
	
	
	private WebDriver NavegadorChrome() {
		System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
		return new ChromeDriver();
	}
	
	private WebDriver NavegadorEdge() {
		
		System.setProperty("webdriver.chrome.driver", FIREFOX_DRIVER_PATH);
		return new FirefoxDriver();
	}
	
}
