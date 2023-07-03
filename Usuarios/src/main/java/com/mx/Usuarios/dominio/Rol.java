package com.mx.Usuarios.dominio;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROL")
public class Rol {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// NOMBRE NVARCHAR2(50) NOT NULL

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;

	@OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
	List<Asignacion> listAsignacion = new ArrayList<Asignacion>();

	public Rol() {
	}

	public Rol(long id) {
		this.id = id;
	}

	public Rol(long id, String nombre, List<Asignacion> listAsignacion) {
		this.id = id;
		this.nombre = nombre;
		this.listAsignacion = listAsignacion;
	}

	@Override
	public String toString() {
		return "Rol [id=" + id + ", nombre=" + nombre + "]\n";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
