package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	private static Logger logger=Logger.getLogger(Testbase.class);
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public Testbase() 
	{
		  prop=new Properties();
		  
		  try {
			FileInputStream fis=new FileInputStream("C:\\Users\\14388\\eclipse-workspace\\mystoreecommerce_cucumber\\src\\main\\java\\com\\configuration\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		  
	}  
	
	
	public static void intialization()
	{
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver=new ChromeDriver();
	
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Timeouts.pageload_timeouts,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Timeouts.implicit_wait,TimeUnit.SECONDS);
		logger.info("lauching browser");
		driver.get(prop.getProperty("url"));
		
		
		
		
	}
		  
		  
		  
		  
	
	
	
	
	

}
