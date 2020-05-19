package com.demoguru.demoaut.bank.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demoguru.demoaut.bank.pages.HomeGuru99;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsDefinitions {
	
	WebDriver driver;
	HomeGuru99 home;
	Hook hook=new Hook();
	
	@Given("I want to write Guru99 Homepage")
	public void iWantToWriteGuru99Homepage() {
		hook.setUp();
		driver=Hook.driver;
		home=new HomeGuru99(driver);
		driver.get("http://demo.guru99.com/V4/index.php");
		
	}
	
	@When("I write my creditials")
	public void iWriteMyCreditials(io.cucumber.datatable.DataTable dataTable) {
		List<String> listaDatos=dataTable.asList();
		home.escribirUsuario(listaDatos.get(0));
		home.escribirClave(listaDatos.get(1));
		home.clickEnLogin();
		
	}
	@Then("displayed text Welcome to manager")
	public void displayedTextWelcomeToManager() {
		home.validarPresenciaWelcomePage();
				try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.quit();
	}

}
