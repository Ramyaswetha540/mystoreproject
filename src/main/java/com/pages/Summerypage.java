package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utility.Testbase;

public class Summerypage extends Testbase{

	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']/span")
	WebElement proceedbutton;
	
	@FindBy(id="id_address_delivery")//select
	WebElement address;
	
	@FindBy(xpath="//div[@id='ordermsg']//textarea")
	WebElement textarea;
	
	@FindBy(id="cgv")
	WebElement acceptterms;
	
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement proceedaddress;
	
    @FindBy(xpath="//button[@name='processCarrier']/span")
    WebElement proceedcarrier;
    
    @FindBy(xpath="//a[@title='Pay by bank wire']/span")
    WebElement bankwire;
    
    
    @FindBy(xpath="//button[@class='button btn btn-default button-medium']")
    WebElement confirmorder;
    
    @FindBy(id="email")
    WebElement email;
    
    @FindBy(id="passwd")
    WebElement password;
    
    @FindBy(id="SubmitLogin")
    WebElement signin;
    
	public Summerypage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterlogindetails()
	{
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,8000)");
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();
	}
	
	public void clickonproceed()
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,1000)");
		proceedbutton.click();
	}
	public void selctaddress()
	{
		Select sel=new Select(address);
		sel.selectByIndex(0);
	}
	
	public void entertext()
	{
		textarea.sendKeys("colour is good");
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,800)");
		proceedaddress.click();
	}
	public void acceptbutton()
	{
		acceptterms.click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,800)");
		proceedcarrier.click();
	}

	public void clickonbankwire()
	{
		bankwire.click();
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,800)");
		confirmorder.click();
	}
	public String ordersucessfull()
	{
		return driver.getTitle();//Order confirmation - My Store
	}
	
}
