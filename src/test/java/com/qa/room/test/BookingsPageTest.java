package com.qa.room.test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.room.base.Base;
import com.qa.room.page.BookingsPage;
import com.qa.room.page.HomePage;
import com.qa.room.page.SearchFlat;

@Listeners(com.qa.room.util.MyListener.class)
public class BookingsPageTest extends Base
{
	 HomePage homePage;
	   SearchFlat searchFlat;
	   BookingsPage bookingsPage;
	   
	   public BookingsPageTest()
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
			searchFlat.search_flat_in_city();
			bookingsPage=new BookingsPage();
	   }
	   
	   @Test
	   public void get_booking_done()
	   {
		   bookingsPage.open_booking_tab();
		   
	   }
}
