package helpers;

import java.io.File;

public class DataDriven {

	//URLS
	public static String URL_LOGIN = "https://www.saucedemo.com/";
	public static String URL_PRODUCTS = "https://www.saucedemo.com/inventory.html";
	
	//DATA USERS
	public static String USER_NAME = "standard_user";
	public static String PASSWORD = "secret_sauce";
	public static String USER_NAME_INCORRECTO = "test01";
	public static String PASSWORD_INCORRECTO = "12345";
	
	//CONFIG
	public static int MAX_WAIT_TIME=10;
	public static String EVIDENCIA_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "evidencia"
			+ File.separator;
	
	
	
}
