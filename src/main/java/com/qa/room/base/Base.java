package com.qa.room.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.qa.room.util.Utility;

public class Base {
	

	public static WebDriver driver=null;
	public static Properties prop;
	public static String propertiesPath="C:\\Users\\Admin\\eclipse-workspace\\RoomSoomAutomate\\src\\main\\java\\com\\qa\\room\\configuration\\config.properties";
	public static FileInputStream fis;
	
	
	public Base()
	{
		try
		{
		fis= new FileInputStream(propertiesPath);
		prop= new Properties();
		prop.load(fis);
	    }
		catch(FileNotFoundException f)
		{
			System.out.println("Please check your file location");
		}
		catch(IOException i)
		{
			System.out.println("Please check read and write permission");
		}
   }
		
       public void initialization()
       {
    	   String browserName=prop.getProperty("browser");
    	   if(browserName.equalsIgnoreCase("chrome"))
    	   {
    		   driver= new ChromeDriver();
    	   }
    	    if(browserName.equalsIgnoreCase("firefox"))
    	   {
    		   driver= new FirefoxDriver();
    	   }
    	    if(browserName.equalsIgnoreCase("edge"))
    	   {
    		   driver= new EdgeDriver();
    	   }
    	   else
    	   {
    		   System.out.println("Please enter Chrome,firefox and edge only");
    	   }
    	   
    	  
    	   
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.pageload));
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utility.implicit));
    	   driver.manage().deleteAllCookies();
    	   driver.get(prop.getProperty("testurl"));
    	   
    	  


}

}