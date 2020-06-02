package com.stepdefinations;
import java.util.Map;

import org.junit.Assert;

import com.pages.Createaccountpage;
import com.pages.Homepage;
import com.pages.Signinpage;
import com.utility.Testbase;

//cntrl+shift+o-import all given when then 
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signinstepdefination extends Testbase{

	Homepage homepage;
	Signinpage signinpage;
	Createaccountpage createaccountpage;
	
	
	@Given("^user opens browser and user is on homepage$")
	public void user_opens_browser_and_user_is_on_homepage() throws Throwable {
	    intialization();
	    homepage=new Homepage();
	    String title=homepage.hometile();
		Assert.assertEquals(title, "My Store");
		   
	}

	@Then("^user clicks on siginlink$")
	public void user_clicks_on_siginlink() throws Throwable {
		signinpage=homepage.clickonsignin();
	}
		   

	@Then("^user enter emailaddress in create new account$")
	public void user_enter_emailaddress_in_create_new_account() throws Throwable {
	    signinpage.enteremail();
	}

	@When("^user clicks on create an account$")
	public void user_clicks_on_create_an_account() throws Throwable {
	    
		createaccountpage=signinpage.clickoncreate();
	}

	@Then("^user enter following details$")
	public void user_enter_following_details(DataTable registerdata) throws Throwable {
		for(Map<String,String> data:registerdata.asMaps(String.class, String.class))
		{
			createaccountpage.gender();
			createaccountpage.enterfirstname(data.get("Firstname"));
			createaccountpage.enterlastname(data.get("Lastname"));
			createaccountpage.enteremail(data.get("Email"));
			createaccountpage.enterpassword(data.get("Password"));
			createaccountpage.entersecondfname(data.get("firstname"));
			createaccountpage.entersecondlname(data.get("lastname"));
			createaccountpage.enteraddress(data.get("Address"));
			createaccountpage.entercityname(data.get("City"));
			createaccountpage.statename();
			createaccountpage.enterpostalcode(data.get("Zip"));
			createaccountpage.countryname();
			createaccountpage.entermobilenum(data.get("Mobilenum"));
			createaccountpage.enteraliasname(data.get("Alias"));
			
			
		}
	   
	}

	@Then("^user clicks on registration button$")
	public void user_clicks_on_registration_button() throws Throwable {
	   
		createaccountpage.clickonregistration();
	    String accounttile=createaccountpage.verifyttile();
	    System.out.println(accounttile);
	    Assert.assertEquals(accounttile,"My account - My Store");
	    driver.quit();
	}


}
