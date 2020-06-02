package com.stepdefinations;

import org.junit.Assert;

import com.pages.Homepage;
import com.pages.MyAccountpage;
import com.pages.Productpage;
import com.pages.Signinpage;
import com.pages.Summerypage;
import com.pages.Tshirtspage;
import com.utility.Testbase;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class BuyProductstepdefination extends Testbase{
	
	
	Homepage homepage;
	Tshirtspage tshirtpage;
	Signinpage signinpage;
	MyAccountpage myaccountpage;
	Productpage productpage;
	Summerypage summerypage;

	@Given("^user is on homepage and clicks signinlink$")
	public void user_is_on_homepage_and_clicks_signinlink() throws Throwable {
		
		intialization();
		homepage=new Homepage();
	 	signinpage=homepage.clickonsignin();
		
	   
	}

	@Then("^user enter emailaddress and password and click submitbutton$")
	public void user_enter_emailaddress_and_password_and_click_submitbutton() throws Throwable {
		
		myaccountpage=signinpage.enteremailpassword();
		
	}

	@Then("^user mousehover on Women and clicks submenu T-shirts$")
	public void user_mousehover_on_Women_and_clicks_submenu_T_shirts() throws Throwable {
	   	
		tshirtpage=myaccountpage.clickonwomenlink();
			
	}
	
	@When("^user mousehover on displayed product and clicks the more button$")
	public void user_mousehover_on_displayed_product_and_clicks_the_more_button() throws Throwable {
	    
		productpage=tshirtpage.mousehovertoproduct();
		
	}

	@Then("^user increase the quantity and select size and colour$")
	public void user_increase_the_quantity_and_select_size_and_colour() throws Throwable {
	    
		productpage.enterquantity();
		productpage.selectsize();
		productpage.selectcolour();
	}

	@Then("^user clicks on Add to Cart button$")
	public void user_clicks_on_Add_to_Cart_button() throws Throwable {
	    productpage.clickonaddcartbutton();
	   	}
 
@Then("^user clicks on Proceed to checkout button$")
public void user_clicks_on_Proceed_to_checkout_button() throws Throwable {
	summerypage=productpage.windowpopclickonaddcart();
}

@When("^user performs shoppingprocess$")
public void user_performs_shoppingprocess() throws Throwable {
	summerypage.clickonproceed();
	summerypage.enterlogindetails();
	summerypage.selctaddress();
	summerypage.entertext();
	summerypage.acceptbutton();
	summerypage.clickonbankwire();
  
}

@Then("^user successfully order the product$")
public void user_successfully_order_the_product() throws Throwable {
    
	String ordertext=summerypage.ordersucessfull();
	Assert.assertEquals(ordertext, "Order confirmation - My Store");
	 driver.quit();
	
}

}
