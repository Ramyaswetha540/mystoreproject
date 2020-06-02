package com.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Testbase;

public class Signinpage extends Testbase{
	
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement emailaddress;

	@FindBy(xpath="//button[@id='SubmitCreate']")
	WebElement createbutton;
	
	@FindBy(xpath="//input[@id='email_create']")
	WebElement email;
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	WebElement submitbutton;
	
	
	
	
	public  Signinpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteremail()
	{
		
	emailaddress.sendKeys(prop.getProperty("emailaddress"));
	}
	
	public Createaccountpage clickoncreate()
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].click();", createbutton);
		return new Createaccountpage();
		
	}
		
	public MyAccountpage enteremailpassword()
	{
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));
		submitbutton.click();
		return new MyAccountpage();
			
	}
	
	
	

}
