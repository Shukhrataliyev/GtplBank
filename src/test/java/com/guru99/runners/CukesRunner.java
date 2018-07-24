package com.guru99.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"pretty", 
				"html:target/cucumber-report",
	//			"json:target/cucumber.json"
		},
		tags = "@tag",
		features= {"src/test/resources/com/guru99/features"},
		glue="com/guru99/step_definitions/",
		dryRun=false
)
public class CukesRunner extends AbstractTestNGCucumberTests {
	

}
