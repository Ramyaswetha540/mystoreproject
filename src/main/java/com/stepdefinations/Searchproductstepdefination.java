package com.stepdefinations;

import org.junit.Assert;


import com.pages.Homepage;
import com.pages.Tshirtspage;
import com.utility.Testbase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchproductstepdefination extends Testbase{

	Homepage homepage;
	Tshirtspage tshirtpage;
//		
//		
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
		intialization();
		homepage=new Homepage();
		String title=homepage.hometile();
		Assert.assertEquals(title,"My Store");
	}
//
	@When("^user mousehover on Women tab and clicks on tshirts$")
	public void user_mousehover_on_Women_tab_and_clicks_on_tshirts() throws Throwable {
//		
			tshirtpage=homepage.clickonwomenlink();
//		
	}
//	
	@Then("^user will get Text of the first product in the page$")
	public void user_will_get_Text_of_the_first_product_in_the_page() throws Throwable {
//	   
		
		String productname=tshirtpage.productname();
		System.out.println(productname);
    	Assert.assertEquals(productname,"Faded Short Sleeve T-shirts");
	}
//
	@When("^user enters the product name and clicks on submit button$")
	public void user_enters_the_product_name_and_clicks_on_submit_button() throws Throwable {
		
		tshirtpage.enterinsearch();
		tshirtpage.clickbutton();
		
	}

	@Then("^user will  Validate that same product is displayed on searched page by taking screenshot$")
	public void user_will_Validate_that_same_product_is_displayed_on_searched_page_by_taking_screenshot() throws Throwable {		homepage=new Homepage();
		
		tshirtpage.takescreenshot();
		String text=tshirtpage.getsearchtext();
		System.out.println(text);
		Assert.assertEquals(text,"\"FADED SHORT SLEEVE T-SHIRTS\"");
		 driver.quit();
	}

}
