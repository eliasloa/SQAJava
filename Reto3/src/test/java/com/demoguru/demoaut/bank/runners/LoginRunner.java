package com.demoguru.demoaut.bank.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/com/demoguru/demoaut/registro/testing/login.feature",
		glue="com.demoguru.demoaut.bank.stepsdefinitions",
		snippets=SnippetType.CAMELCASE
		)

public class LoginRunner {
	
}
