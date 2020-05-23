package com.newtours.bookfligtht.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/com/newtours/bookfligtht/pruebas/features/register.feature", 
		glue = "com.newtours.bookfligtht.pruebas.stepdefinitions", 
		snippets = SnippetType.CAMELCASE)

		// Se pulsa Show in y se selecciona Terminal
		// SE ingresa en la carpeta tarjet site Serenity
		//Se busca en tarjet

public class RegisterRunner {

}
