package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinition extends BaseClass{
	
	
	@Given("User should launch the chrome and load the url and maximize")
	public void user_should_launch_the_chrome_and_load_the_url_and_maximize() {
//		launchChrome();
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();

	}

	@When("User should type the invalid username and invalid password")
	public void user_should_type_the_invalid_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("greens");
		driver.findElement(By.id("pass")).sendKeys("greens@123");
	   
	}
	
	@When("User should click the login button")
	public void user_should_click_the_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	 
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
		
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Verify the incorrect page", current.contains("privacy"));
		System.out.println("Test case is passed");
	  
	}
	
	@Then("User should navigate to incorrect credential page and close the browser")
	public void user_should_navigate_to_incorrect_credential_page_and_close_the_browser() {
		String current = driver.getCurrentUrl();
		Assert.assertTrue("Verify the incorrect page", current.contains("privacy"));
		System.out.println("Test case is passed");
		//closeChrome();
	}

	
	@When("User should type valid username and invalid password")
	public void user_should_type_valid_username_and_invalid_password() {
		driver.findElement(By.id("email")).sendKeys("sql");
		driver.findElement(By.id("pass")).sendKeys("sql@123");
	}
	
	@When("User should type the invalid username {string} and valid password {string}")
	public void user_should_type_the_invalid_username_and_valid_password(String s1, String s2) {
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
	    
	}
	
	@When("User should type the invalid username and invalid passworD")
	public void userShouldTypeTheInvalidUsernameAndInvalidPassworD(io.cucumber.datatable.DataTable d) {
		
	     // 2D Map
			List<Map<String, String>> mp = d.asMaps();
			String s1 = mp.get(1).get("course");
		
	
		driver.findElement(By.id("email")).sendKeys(s1); // Selenium
		
		driver.findElement(By.id("pass")).sendKeys(mp.get(2).get("cricket")); //Raina
		
		
		
	
	}

	
	

	
	

}
