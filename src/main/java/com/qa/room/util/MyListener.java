package com.qa.room.util;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.room.base.Base;

public class MyListener extends Base implements ITestListener {
	
//	public void onTestFailure(ITestResult result)
//	{
//		ImageClicker.imageGenerator(driver, result.getName());
//	}
	
	public void onTestSuccess(ITestResult result)
	{
		ImageClicker.imageGenerator(driver, result.getName());
	}
	
	
	
  
}

