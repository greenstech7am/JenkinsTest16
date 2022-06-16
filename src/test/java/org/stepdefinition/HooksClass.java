package org.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class HooksClass extends BaseClass {
	@Before(order = 1)
	public void beforeScenario() {
		System.out.println("HOOKS @Before Executed");
		launchChrome();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@Before(order = 3)
	public void thirdOrder() {
		System.out.println("Order 3 Executed");

	}

	@Before(order = 2)
	public void secondOrder() {
		System.out.println("Order 2 Executed");
	}
	// Taking a screenshot after each scenario
	@After(order = 1)
	public void afterScenario() {

		driver.close();
	}

	@After(order = 2)
	public void secondAfter(Scenario s) throws IOException {
		System.out.println("Order 2 After executed");
		
		if (s.isFailed()) {
		
			
			TakesScreenshot tk = (TakesScreenshot)driver;
			byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screenshot, "image/png");
			
		}

	

	}

	@After(order = 3)
	public void thirdAfter() {
		System.out.println("HOOKS @After Executed");
		System.out.println("Order 3 After executed");

	}

}
