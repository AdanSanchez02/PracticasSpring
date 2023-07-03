package com.mx.Usuarios.dominio;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "USUARIOS", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

	// ATRIBUTOS
	// ID NUMBER PRIMARY KEY NOT NULL,
	// USERNAME NVARCHAR2(50) NOT NULL,
	// PASSWORD NVARCHAR2(50) NOT NULL,
	// EMAIL NVARCHAR2(50) NOT NULL,
	// NOMBRE NVARCHAR2(50) NOT NULL,
	// APELLIDO NVARCHAR2(50) NOT NULL,
	// TELEFONO NUMBER NOT NULL,
	// STATUS NVARCHAR2(10) NOT NULL,
	// PERFIL NVARCHAR2(50)NOT NULL

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	String username;
	String password;
	String email;
	String nombre;
	String apellido;
	long telefono;
	String status;
	String pefirl;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	List<Asignacion> listAsignacion = new ArrayList<Asignacion>();

	public Usuario() {
	}

	public Usuario(long id) {
		this.id = id;
	}

	public Usuario(long id, String username, String password, String email, String nombre, String apellido,
			long telefono, String status, String pefirl, List<Asignacion> listAsignacion) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.status = status;
		this.pefirl = pefirl;
		this.listAsignacion = listAsignacion;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", status=" + status
				+ ", pefirl=" + pefirl + "]\n";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPefirl() {
		return pefirl;
	}

	public void setPefirl(String pefirl) {
		this.pefirl = pefirl;
	}

}
