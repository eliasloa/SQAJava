package Utilidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Utilidades {

	public void seleccionarLista(WebDriver driver, String id, String Opc){
		Select scl= new Select(driver.findElement(By.id(id)));
		scl.selectByVisibleText(Opc);

	}

}
