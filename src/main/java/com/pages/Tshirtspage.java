package com.pages;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Testbase;

public class Tshirtspage extends Testbase {
	@FindBy(xpath="//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")
	WebElement fadedshortsleevetshirt;
	
	@FindBy(xpath="//input[@id='search_query_top']")
	WebElement searchfeild;
	
	@FindBy(xpath="//div[@id='search_block_top']//button[@type='submit']")
	WebElement button;
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement imageoftheproduct;
	
	
	@FindBy(xpath="//a[@title='View']")
	WebElement morebutton;
		
	
    @FindBy(xpath="//div[@id='center_column']/h1/span[@class='lighter']")
    WebElement searchtext;
	
	public Tshirtspage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String productname()
	{
	return	fadedshortsleevetshirt.getText();
		
	}
	
	
	public void enterinsearch()
	{
		searchfeild.sendKeys("Faded Short Sleeve T-shirts");
	}
	
	public void clickbutton() 
	{
		button.click();
		
	}
	
	public void takescreenshot() throws Exception
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,500)");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));	
	}
	
	
	public Productpage mousehovertoproduct()
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,800)");	
    	
    	Actions action=new Actions(driver);
       	action.moveToElement(imageoftheproduct).build().perform();
       	boolean b=morebutton.isDisplayed();
       	System.out.println(b);
       	
       	morebutton.click();
       	return new Productpage();
    	
       	
	}
	
	
	public String getsearchtext()
	{
		return searchtext.getText();
	}
	
}
