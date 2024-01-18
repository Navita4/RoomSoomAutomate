package com.qa.room.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.room.base.Base;
import com.qa.room.page.HomePage;

@Listeners(com.qa.room.util.MyListener.class)
public class HomePageTest extends Base
{
  HomePage homePage;
  
  
  public  HomePageTest()
  {
	  super();
  }
  
  @BeforeMethod
  public void setup()
  {
	  initialization();
	  homePage=new HomePage();
  }
  
  @Test
  public void open_data_test()
  {
	  homePage.open_data_with_roomsoom();
  }
}
