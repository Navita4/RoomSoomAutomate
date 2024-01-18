package com.qa.room.util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.room.base.Base;

public class ImageClicker extends Base
{
public WebDriver driver;
	
	public static void imageGenerator(WebDriver driver, String imageName)
	{
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("Image/"+imageName+".png"));
		System.out.println("Image clicked successfully");
		}
		
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}
	}
}
