package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;

public class ForgottenStepDefinition extends BaseClass{
	
	@When("User should click the forgotten password link")
	public void userShouldClickTheForgottenPasswordLink() {
		driver.findElement(By.linkText("Forgotten password?")).click();
				
	}

	@When("User should type the invalid mobile number")
	public void userShouldTypeTheInvalidMobileNumber() {
	   driver.findElement(By.id("identify_email")).sendKeys("1234567890");
	}

	@When("User should click the search button")
	public void userShouldClickTheSearchButton() throws InterruptedException {
	 driver.findElement(By.id("did_submit")).click();
	 Thread.sleep(2000);
	}

	@Then("User should navigate to password reset page")
	public void userShouldNavigateToPasswordResetPage() {
		
		WebElement reset = driver.findElement(By.xpath("(//h2[text()='Reset Your Password'])[2]"));
		String text = reset.getText();
		
		Assert.assertTrue("Verify the password reset Page", text.contains("recover"));
		
		System.out.println("Password Functionality got passed");
	 
	}

}
