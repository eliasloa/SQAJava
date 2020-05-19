package com.demoguru.demoaut.bank.stepsdefinitions;

import java.util.List;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.demoguru.demoaut.bank.pages.RegistroDemoGuru;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistroStepsDefinitions {
	
	WebDriver driver;
	RegistroDemoGuru home;

	@When("I write my data")
	public void iWriteMyData(io.cucumber.datatable.DataTable dataTable) {
		driver=Hook.driver;
		home=new RegistroDemoGuru(driver);
		List<String> listaDatos = dataTable.asList();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		home.clickEnNewCustomer();
		home.escribirCustomerName(listaDatos.get(0));
		home.escribirFecha(listaDatos.get(1));
		home.escribirDireccion(listaDatos.get(2));
		home.escribirCiudad(listaDatos.get(3));
		home.escribirEstado(listaDatos.get(4));
		home.escribirPostal(listaDatos.get(5));
		home.escribirCelular(listaDatos.get(6));
		home.escribirEmail(listaDatos.get(7));
		home.escribirPassword(listaDatos.get(8));
		home.clickEnSubmit();
		
	}

	@Then("I should see the next text Customer Registered Successfully")
	public void iShouldSeeTheNextTextCustomerRegisteredSuccessfully() {
	  
	
		home.validarPresenciaCustomer();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();//Cerrar el driver
	
	}
	
}