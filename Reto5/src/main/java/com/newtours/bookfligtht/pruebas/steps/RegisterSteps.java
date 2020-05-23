package com.newtours.bookfligtht.pruebas.steps;

import com.newtours.bookfligtht.pruebas.pageobjects.RegisterPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

public class RegisterSteps extends KrakenWeb {
	
	RegisterPageObject registerPOM = new RegisterPageObject();
	
	public void abrirNavegadorEnNewTours() {

		configuracionesIniciales();
		abrirNavegadorEn(registerPOM);
	}
	
	public void clickEnRegistro(){
		
		click(registerPOM.getMsRegistro());
	}
	
	public void escribirFirtsName(String nombre) {
		
	escribirTexto(registerPOM.getTxtFirtsName(), nombre);
		
	}
	
	public void escribirLastName(String apellido) {
		
		escribirTexto(registerPOM.getTxtLastName(), apellido);
			
		}
	
	public void escribirPhone(String phone) {
		
		escribirTexto(registerPOM.getTxtPhone(), phone);
			
		}
	
	public void escribirEmail(String email) {
		
		escribirTexto(registerPOM.getTxtEmail(), email);
			
		}	
	
	public void escribirDireccion(String address) {
		
		escribirTexto(registerPOM.getTxtDireccion(), address);
			
		}
	
	public void escribirCity(String city) {
		
		escribirTexto(registerPOM.getTxtCity(), city);
			
		}
	
	public void escribirState(String state) {
		
		escribirTexto(registerPOM.getTxtState(), state);
			
		}
	
	public void escribirCountry(String country) {
		
		//escribirTexto(registerPOM.getTxtCountry(), country);
		elegirDeListaSegunElTexto(registerPOM.getTxtCountry(), country);
		}
	
	public void escribirUserEmail(String userName) {
		
		escribirTexto(registerPOM.getTxtEmailNom(), userName);
			
		}
	
	public void escribirPassword(String password) {
		
		escribirTexto(registerPOM.getTxtPassword(), password);
			
		}
	
	public void escribirConfirmPassword(String confirmpassword) {
		
		escribirTexto(registerPOM.getTxtConfirmarPass(), confirmpassword);
			
		}
	
	public void clickEnSubmit(){
		
		click(registerPOM.getBtbSubmit());
	}
	
	public void validarTextExitoso(String textoEsperado) {
		
		validarIgual(registerPOM.getMsgLogin(), textoEsperado);
			
		}


}
