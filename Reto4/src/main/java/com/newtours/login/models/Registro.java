package com.newtours.login.models;

public class Registro {
	
	String nombre;
	String apellido;
	String phone;
	String email;
	String address;
	String city;
	String state;
	String postal;
	String country;
	String username;
	String password;
	String confirmarpassword;
	public Registro(String nombre, String apellido, String phone, String email, 
			String address, String city, String state, String postal, 
			String country, String username, String password, String confirmarpassword) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.postal = postal;
		this.country = country;
		this.username = username;
		this.password = password;
		this.confirmarpassword = confirmarpassword;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}

	public String getPostal() {
		return postal;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getConfirmarPassword() {
		return confirmarpassword;
	}

}

