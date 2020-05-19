package com.newtours.ingreso.formulario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RetoFormulario {
	
	
	WebDriver driver;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdrive.chrome.driver", "C:\\Documentos\\Proyectos\\Reto1\\chromedriver.exe");
		
	}

	@Before
	public void setUp() throws Exception {
		
		driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();//Cerrar el driver
		
	}

	@Test
	public void test() {
		
		driver.findElement(By.name("userName")).sendKeys("icer13");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.xpath("//input[@value='roundtrip']"));
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select listaPasajeros=new Select(driver.findElement(By.name("passCount")));
		listaPasajeros.selectByValue("2");
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Select ListaPartida=new Select(driver.findElement(By.name("fromPort")));
		ListaPartida.selectByValue("London");
		
		Select ListaMes=new Select(driver.findElement(By.name("fromMonth")));
		ListaMes.selectByValue("6");
		
		Select ListaDia=new Select(driver.findElement(By.name("fromDay")));
		ListaDia.selectByValue("14");
		
		Select ListaLlegada=new Select(driver.findElement(By.name("toPort")));
		ListaLlegada.selectByValue("New York");
		
		Select ListaRegresoMes=new Select(driver.findElement(By.name("toMonth")));
		ListaRegresoMes.selectByValue("7");
		
		Select ListaRegresoDia=new Select(driver.findElement(By.name("toDay")));
		ListaRegresoDia.selectByValue("8");
				
		driver.findElement(By.xpath("//input[@value='First']")).click();
		
		Select ListaAerolinea = new Select(driver.findElement(By.name("airline")));
		ListaAerolinea.selectByVisibleText("Unified Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Pagina Reserva Vuelo
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
		driver.findElement(By.xpath("//input[@value='Pangea Airlines$632$282$16:37']")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("passFirst0")).sendKeys("Elias");
		driver.findElement(By.name("passLast0")).sendKeys("Loaiza");
		Select ListaCarne=new Select(driver.findElement(By.name("pass.0.meal")));
		ListaCarne.selectByVisibleText("Bland");
		driver.findElement(By.name("passFirst1")).sendKeys("Johana");
		driver.findElement(By.name("passLast1")).sendKeys("Sanchez");
		Select ListaCarne2=new Select(driver.findElement(By.name("pass.1.meal")));
		ListaCarne2.selectByVisibleText("Kosher");
		Select ListaTarjeta=new Select(driver.findElement(By.name("creditCard")));
		ListaTarjeta.selectByVisibleText("Visa");
		driver.findElement(By.name("creditnumber")).sendKeys("58393999022");
		Select ListaTarjetaMes=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		ListaTarjetaMes.selectByVisibleText("09");
		Select ListaTarjetaYear=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		ListaTarjetaYear.selectByValue("2009");
		driver.findElement(By.name("ticketLess")).click();
		driver.findElement(By.name("billAddress1")).sendKeys("Avenida Siempre viva123");
		driver.findElement(By.name("billCity")).sendKeys("FL");
		driver.findElement(By.name("billZip")).sendKeys("33126");
		driver.findElement(By.name("buyFlights")).click();
		
		driver.findElement(By.xpath("//table/tbody/tr/td[3]/a/img")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
