package com.qa.room.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.room.base.Base;
import com.qa.room.page.HomePage;
import com.qa.room.page.SearchFlat;

@Listeners(com.qa.room.util.MyListener.class)
public class SearchFlatTest extends Base 
{
   HomePage homePage;
   SearchFlat searchFlat;
   
   public SearchFlatTest()
   {
	   super();
   }
   
   @BeforeMethod
	public void setup()
	{
		initialization();
		homePage= new HomePage();
		homePage.open_data_with_roomsoom();
		searchFlat= new SearchFlat();
	}
   
   @Test
   public void searchflatbasedoncity() 
   {
	   searchFlat.search_flat_in_city();
   }
}
