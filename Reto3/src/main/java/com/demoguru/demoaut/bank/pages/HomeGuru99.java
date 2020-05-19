package com.demoguru.demoaut.bank.pages;

import static org.junit.Assert.assertThat;
import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomeGuru99 {
	
	WebDriver driver;
	By txtUserId= By.name("uid");
	By txtPassword= By.name("password");
	By btblogin= By.name("btnLogin");
	By linkWelcomePage=By.xpath("//marquee[@class='heading3']");
	
	
	public HomeGuru99 (WebDriver driver) {
		
		this.driver = driver;
		
	}

	public void escribirUsuario (String usuario) {
	
		driver.findElement(txtUserId).sendKeys(usuario);
	
	}
	
	public void escribirClave (String clave) {
		
		driver.findElement(txtPassword).sendKeys(clave);
		
	}
	
	public void clickEnLogin () {
		
		driver.findElement(btblogin).click();
			
	}
	
	public void validarPresenciaWelcomePage() {
		assertThat(driver.findElement(linkWelcomePage).isDisplayed(), Matchers.is(true));
	}
	
}