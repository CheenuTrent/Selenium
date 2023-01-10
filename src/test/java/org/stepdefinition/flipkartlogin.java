package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class flipkartlogin extends BaseClass{
	 
LoginPojo l; 
	
	@Given("To launch the chromebrowser and maximise it")
	public void to_launch_the_chromebrowser_and_maximise_it() {
		launchbrowser();
		windowmaximize();
		
	}

	@When("To launch the URL of flipkart application")
	public void to_launch_the_URL_of_flipkart_application() throws InterruptedException {
		launchurl("https://www.flipkart.com/");
		
 
	}

	@When("To pass the valid username in username field")
	public void to_pass_the_valid_username_in_username_field() {
		l=new LoginPojo();
		passText("srisiva.886@gmail.com",l.getName());
		
	}

	@When("To pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
		l=new LoginPojo();
		passText("123456",l.getPwd());
	   
	}

	@When("to click the login button")
	public void to_click_the_login_button() {
	   l=new LoginPojo();
	   clickBtn(l.getButton());
		
	}
	@When("to check whether the application navigate to homepage or not")
	public void to_check_whether_the_application_navigate_to_homepage_or_not() {
	 
		System.out.println("To check you Login credentials...");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	    
	}


	
	
	
	

}
