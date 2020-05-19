package com.demoguru.demoaut.bank.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoguru.demoaut.bank.pages.EditarDemoGuru;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditarStepsDefinitions {
	
	
	WebDriver driver;
	EditarDemoGuru editar;
	
	@When("I need update my customer")
	public void iNeedUpdateMyCustomer(io.cucumber.datatable.DataTable dataTable) {
		driver=Hook.driver;
		editar=new EditarDemoGuru(driver);
		List<String> listaDatos = dataTable.asList();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		editar.clickEnEditCustomer();
		editar.escribirCustomerId(listaDatos.get(0));
		editar.clickEnSubmitId();
		editar.escribirDireccion(listaDatos.get(1));
		editar.escribirCiudad(listaDatos.get(2));
		editar.escribirEstado(listaDatos.get(3));
		editar.escribirPostal(listaDatos.get(4));
		editar.escribirCelular(listaDatos.get(5));
		editar.escribirEmail(listaDatos.get(6));
		editar.clickEnSubmit();
	}
	
	
	@Then("I should see the next text displayed text Customer details updated Successfully")
	public void iShouldSeeTheNextTextDisplayedTextCustomerDetailsUpdatedSuccessfully() {
		
		editar.validateCustomerUpdate();
		driver.quit();//Cerrar el driver
	 
	}



}