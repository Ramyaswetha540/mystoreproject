package com.pages;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utility.Testbase;

public class Productpage extends Testbase{
	
	
	@FindBy(id="quantity_wanted")
	WebElement quantity;
	
	@FindBy(id="group_1")//select
	WebElement size;
	
	@FindBy(id="color_14")
	WebElement colour;
	
	@FindBy(xpath="//button[@class='exclusive']/span")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']/span")
	WebElement proceedbutton;

	public Productpage()
	{
		PageFactory.initElements(driver,this);
	}

	public String verifyproducttile()
	{
		return driver.getTitle();
	}
	
	public void enterquantity()
	{
	  quantity.sendKeys(prop.getProperty("productquantity"));	
	}
	
	public void selectsize()
	{
		Select sel=new Select(size);
		sel.selectByVisibleText(prop.getProperty("productsize"));
	}
	public void selectcolour()
	{
		colour.click();
	}
	
	public void clickonaddcartbutton()
	{
		addtocart.click();

	
	}
	
	
	public Summerypage windowpopclickonaddcart()
	{
		for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
		 proceedbutton.click();
		 for (String handle : driver.getWindowHandles()) {
		    	driver.switchTo().window(handle);
		    	}
		 return new Summerypage();
	}
	
	
	

}
