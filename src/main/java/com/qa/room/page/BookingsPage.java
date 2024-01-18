package com.qa.room.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.room.base.Base;

public class BookingsPage extends Base
{
  @FindBy(xpath="//a[@href='#bookings']")
  WebElement bookingbutton;
  
  @FindBy(xpath="//input[@id='online_b_name']")
  WebElement name;
  
  @FindBy(xpath="//input[@id='online_b_phone']")
  WebElement phone;
  
  @FindBy(xpath="//input[@id='online_b_email']")
  WebElement email;
  
  @FindBy(xpath="(//input[@type='submit'])[2]")
  WebElement bookclick;
  
  
  
  public  BookingsPage()
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void open_booking_tab()

    {
	  bookingbutton.click();
	  name.sendKeys("Navita K");
	  phone.sendKeys("889042567");
	  email.sendKeys("kamble.navita04@gmail.com");
	  bookclick.click();
	  
	  JavascriptExecutor js= (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,2000)", " ");
    }
  }
