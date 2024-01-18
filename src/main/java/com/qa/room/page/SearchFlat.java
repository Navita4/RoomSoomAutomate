package com.qa.room.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.room.base.Base;

public class SearchFlat extends Base
{
  @FindBy(xpath="//select[@name='city']")
  
  WebElement city;
  
  @FindBy(xpath="//input[@placeholder='Search your second home']")
    
  WebElement search_home;
  
  @FindBy(xpath="//select[@id='proptype']")
  
  WebElement flats;
  
  @FindBy(xpath="//input[@value='Search']")
  
  WebElement searchButton;
  
   @FindBy(xpath="(//button[contains(text(),'View Detail')])[2]")
  
  WebElement view_details;
  
  
  
  public SearchFlat()
  {
	  PageFactory.initElements(driver, this);
  }
  
  public void search_flat_in_city() 
  {
	  Select select= new Select(city);
		select.selectByVisibleText("Bangalore");
		search_home.sendKeys("3BHK");
		
		Select select1=new Select(flats);
		select1.selectByIndex(1);
		
		searchButton.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)", " ");
	view_details.click();
	//driver.navigate().back();
	
		
		
  }
}
