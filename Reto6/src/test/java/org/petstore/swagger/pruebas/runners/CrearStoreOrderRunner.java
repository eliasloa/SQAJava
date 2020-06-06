package org.petstore.swagger.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/org/petstore/swagger/pruebas/features/CrearStoreOrder.feature",
		glue="org.petstore.swagger.pruebas.stepdefinitions",
		snippets=SnippetType.CAMELCASE)


public class CrearStoreOrderRunner {

}
