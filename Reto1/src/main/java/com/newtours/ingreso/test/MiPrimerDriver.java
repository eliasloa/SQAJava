package com.newtours.ingreso.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utilidades.Utilidades;

public class MiPrimerDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdrive.chrome.driver", "C:\\Documentos\\Proyectos\\Reto1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("userName")).sendKeys("icer13");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("/html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/a")).click();
		driver.findElement(By.name("firstName")).sendKeys("Elias");
		driver.findElement(By.name("lastName")).sendKeys("Loaiza");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.id("userName")).sendKeys("juan.loaiza@sqasa.co");
		driver.findElement(By.name("address1")).sendKeys("avenida siempre viva 123");
		driver.findElement(By.name("city")).sendKeys("Medellin");
		driver.findElement(By.name("state")).sendKeys("Antioquia");
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("COLOMBIA");
		//country.selectByIndex(45);
		driver.findElement(By.name("email")).sendKeys("icer13");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("confirmPassword")).sendKeys("admin");
		driver.findElement(By.name("register")).click();
		driver.quit();//Cerrar el driver

	}

}
