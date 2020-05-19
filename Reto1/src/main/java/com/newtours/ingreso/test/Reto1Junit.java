package com.newtours.ingreso.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reto1Junit {

	
	WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdrive.chrome.driver", "C:\\Documentos\\Proyectos\\Reto1\\chromedriver.exe");
		
	}

	@Before
	public void setUp() throws Exception {
		
		driver= new ChromeDriver();
		driver.get("https://www.google.com/?hl=es");
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();//Cerrar el driver
		
	}

	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("userName")).sendKeys("icer13");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
	}

}
