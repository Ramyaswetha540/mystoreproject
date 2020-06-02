package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Testbase;

public class MyAccountpage extends Testbase{
	
	
	@FindBy(xpath="//a[@title='Orders']/span")
	WebElement orderhistoryanddetails;
	@FindBy(xpath="//a[@title='Credit slips']/span")
	WebElement credit;
	@FindBy(xpath="//a[@title='Addresses']/span")
	WebElement myadd;
	@FindBy(xpath="//a[@title='Information']/span")
	WebElement info;
	@FindBy(xpath="//a[@title='My wishlists']/span")
	WebElement wishlist;
	@FindBy(xpath="//a[@title='Women']")
	WebElement women;
	@FindBy(xpath="//ul[@class='submenu-container clearfix first-in-line-xs']/li/ul/li/a[@title='T-shirts']")
	WebElement tshirts;
	
	public  MyAccountpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String  title()
	{
		return driver.getTitle();
	}
	
	
	
	
	 public Tshirtspage clickonwomenlink()
	   {
		   Actions action=new Actions(driver);
		   action.moveToElement(women).build().perform();
		   action.moveToElement(tshirts).click().build().perform();
		   return new Tshirtspage();
	   }
	

}
