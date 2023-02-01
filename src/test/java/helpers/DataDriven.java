package helpers;

import java.io.File;

public class DataDriven {

	//URLS
	public static String URL_LOGIN = "https://www.saucedemo.com/";
	public static String URL_PRODUCTS = "https://www.saucedemo.com/inventory.html";
	public static String URL_SAUCELABS = "https://saucelabs.com/?fbclid=IwAR1huyk5Q_jfUKWi_UlM0mp2T07aD_5mDiXNDnnFVSowFn9U80hS_64V4Is";
	public static String URL_FACEBOOK_SWAGLABS 	= "https://www.facebook.com/saucelabs"; 
	
	//DATA USERS
	public static String USER_NAME = "standard_user";
	public static String PASSWORD = "secret_sauce";
	public static String USER_NAME_INCORRECTO = "test01";
	public static String PASSWORD_INCORRECTO = "12345";
	public static String USER_NAME_PROBLEM = "problem_user";
	
	//CONFIG
	public static int MAX_WAIT_TIME=10;
	public static int MAX_WAIT_TIME_30 = 30;
	public static String EVIDENCIA_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "evidencia"
			+ File.separator;
	//DATA FORM
	
	public static String NAME = "Yaneli";
	public static String LASTNAME = "Perez";
	public static int POSTAL_CODE = 34567;
	
	//TITTLES
	public static String TITTLE_PAGE_SAUCELAB = "Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
	
	//SCROLLS
	public static final String WINDOW_SCROLL_BY_0_300 = "window.scrollBy(0,300);";
	public static final String WINDOW_SCROLL_BY_0_1000 = "window.scrollBy(0,1000);";

	
	
	
}
