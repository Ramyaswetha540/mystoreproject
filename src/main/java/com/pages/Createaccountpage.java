package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utility.Testbase;

public class Createaccountpage extends Testbase{
	
	
	@FindBy(id="id_gender2")
	WebElement gender;
	@FindBy(id="customer_firstname")
	WebElement firstname;
	@FindBy(id="customer_lastname")
	WebElement lastname;
	@FindBy(id="email")
	WebElement emailid;
	@FindBy(id="passwd")
	WebElement password;
	@FindBy(id="firstname")
	WebElement firstName;
	@FindBy(id="lastname")
	WebElement lastName;
	@FindBy(id="address1")
	WebElement address;
	@FindBy(id="city")
	WebElement cityname;
	@FindBy(id="id_state")//select class
	WebElement statename;
	@FindBy(id="postcode")
	WebElement pin;
	@FindBy(id="id_country")//select
	WebElement countryname;
	@FindBy(id="phone_mobile")
	WebElement phonenum;
	@FindBy(id="alias")
	WebElement aliasaddress;
	@FindBy(id="submitAccount")
	WebElement registerbutton;
	
	public  Createaccountpage()
	{
		PageFactory.initElements(driver, this);
	}
	
  public void gender()
  {
	  gender.click();//radiobutton
  }
 
  
  
  
//  public void testdata(String fn,String ln,String em,String pass,String Fn,String Ln,String add,String cname,String postalc,String mp,String aadd)
//  {
//	  firstname.sendKeys(fn);
//	  lastname.sendKeys(ln);
//	  emailid.sendKeys(em);
//	  password.sendKeys(pass);
//	  firstName.sendKeys(Fn);
//	  lastName.sendKeys(Ln);
//	  address.sendKeys(add);
//	  cityname.sendKeys(cname);
//	  pin.sendKeys(postalc);
//	  phonenum.sendKeys(mp);
//	  aliasaddress.sendKeys(aadd);
//	  
//  }
	public void enterfirstname(String fn)
	{
		firstname.sendKeys(fn);	
	}
	
	public void enterlastname(String ln)
	{
		lastname.sendKeys(ln);	
	}
	
	public void enteremail(String e)
	{
		emailid.clear();
		emailid.sendKeys(e);
	}
	
	public void enterpassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void entersecondfname(String sfn)
	{
		firstName.sendKeys(sfn);
	}
	
	public void entersecondlname(String sln)
	{
		 lastName.sendKeys(sln);
	}
	
	
	public void enteraddress(String add)
	{
		 address.sendKeys(add);
	}
	
	public void enteraliasname(String aadd)
	{
		aliasaddress.sendKeys(aadd);
		
	}
	 public void statename()
	  {
		  Select select=new Select(statename);
		  select.selectByIndex(7);
	  }
	public void enterpostalcode(String postalc)
	{
		pin.sendKeys(postalc);
	}
	
	public void countryname()
	  {
		  Select select1=new Select(countryname); 
		  select1.selectByValue("21");
			
		  }
	public void entermobilenum(String mp)
	{
		phonenum.sendKeys(mp);
	}
	public void entercityname(String cname)
	{
		cityname.sendKeys(cname);
	}
  
  public MyAccountpage clickonregistration()
  {
	  registerbutton.click();
	 
	  return new MyAccountpage();
	 
  }
  
  public String verifyttile()
  {
	  return driver.getTitle();
  }
  

}
