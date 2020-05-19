package com.newtours.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/newtours/testing/features/login.feature",
		glue="com.newtours.pruebas.stepdefinitions",
		snippets=SnippetType.CAMELCASE
		)

//gradle clean test aggregate se ejecuta con el CMD dentro de la carpeta raiz del proyecto
//Se busca en tarjet
public class loginRunner {

}
