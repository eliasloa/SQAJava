package com.demoguru.demoaut.bank.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.demoguru.demoaut.bank.pages.BorrarDemoGuru;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BorrarStepsDefinitions {
	
	WebDriver driver;
	BorrarDemoGuru borrar;
	
	
	@When("I need delette a customer")
	public void iNeedDeletteACustomer(io.cucumber.datatable.DataTable dataTable) {
		driver=Hook.driver;
		borrar= new BorrarDemoGuru(driver);
		List<String> listaDatos = dataTable.asList();
		borrar.PorfavorEspere();
		borrar.btnnEliminarUsuario();
		borrar.ingresaCustomerId(listaDatos.get(0));
		borrar.btnnDelete();
		
	}

	@Then("displayed text Customer delete Successfully")
	public void displayedTextCustomerDeleteSuccessfully(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	
		List<String> listaDatos=dataTable.asList();
		String alertText = driver.switchTo().alert().getText();
		borrar.ValidateDeleteSuccesfull(listaDatos.get(0), alertText);
		Thread.sleep(2500);
		driver.quit();
	}
}
