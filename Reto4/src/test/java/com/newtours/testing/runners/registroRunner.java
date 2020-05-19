package com.newtours.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/newtours/testing/features/register.feature",
		glue="com.newtours.pruebas.stepdefinitions",
		snippets=SnippetType.CAMELCASE
		)

public class registroRunner {

}
