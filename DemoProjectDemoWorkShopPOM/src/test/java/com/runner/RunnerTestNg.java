package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
	    plugin = {
	        "pretty","json:target/cucumber-reports/OrangeHrmLogin.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedrerun.txt" },
	    features = {"src/test/resources/com/features/LoginPage.feature","src/test/resources/com/features/ProductSearch.feature","src/test/resources/com/features/ShareProct.feature"},
	    glue = "com.definitions",
	    monochrome = true,
	    dryRun = false
	)
	public class RunnerTestNg extends AbstractTestNGCucumberTests {
	}
