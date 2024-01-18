package com.qa.room.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.room.base.Base;

public class HomePage extends Base
{
   @FindBy(xpath="//button[@class='close']")
   
   WebElement popup;
   
   public HomePage()
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void open_data_with_roomsoom()
   {
	   popup.click();
   }
}
