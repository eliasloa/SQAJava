package org.petstore.swagger.pruebas.models;

public class Usuario {
	
	String idUsuario;
	String username;
	String firstName;
	String lastName;
	String email;
	String password;
	String phone;
	String userStatus;
	public Usuario(String idUsuario, String username, String firstName, String lastName, String email, String password,
			String phone, String userStatus) {
		this.idUsuario = idUsuario;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.userStatus = userStatus;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getPhone() {
		return phone;
	}
	public String getUserStatus() {
		return userStatus;
	}
	
	
}
