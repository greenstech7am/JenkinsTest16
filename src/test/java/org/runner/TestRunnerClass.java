package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources", glue="org.stepdefinition",dryRun=false, monochrome=true,
snippets=SnippetType.CAMELCASE, plugin= {"html:target\\reports",
										"junit:target\\reports\\fb.xml",
										"json:target\\reports\\output.json",
										"rerun:src\\test\\resources\\Rerun\\failed.txt"}) 
public class TestRunnerClass {
	
	
	@AfterClass
	public static void greens() {
		
		JvmReport.gerateJvmReport(System.getProperty("user.dir")+"\\target\\reports\\output.json");
		

	}

}
