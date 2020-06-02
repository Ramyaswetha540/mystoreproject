package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Testbase;

public class Homepage extends Testbase{
	
	@FindBy(linkText="Contact us")
	WebElement contactuslink;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement signinlink;

	@FindBy(xpath="//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Women']")
	WebElement womenlink;
	
	@FindBy(xpath="//ul[@class='submenu-container clearfix first-in-line-xs']/li/ul/li/a[@title='T-shirts']")
	WebElement tshirts;
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String hometile()
	{
		
		return driver.getTitle();
	}
	
	
   public Signinpage clickonsignin()
   {
	   signinlink.click();
	   
	   return new Signinpage();
   }
   
   public Tshirtspage clickonwomenlink()
   {
	   Actions action=new Actions(driver);
	   action.moveToElement(womenlink).build().perform();
	   action.moveToElement(tshirts).click().build().perform();
	    //tshirts.click();
	    JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,1000)");
	    return new Tshirtspage();
	
   }

}
