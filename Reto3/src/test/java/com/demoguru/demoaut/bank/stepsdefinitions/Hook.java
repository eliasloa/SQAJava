package com.demoguru.demoaut.bank.stepsdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {

	static WebDriver driver;

	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Documentos\\Proyectos\\SqaCapacitacion\\Reto3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


}
