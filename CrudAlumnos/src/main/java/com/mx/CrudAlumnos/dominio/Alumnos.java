package com.mx.CrudAlumnos.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALUMNO_ENUC")
public class Alumnos {

	// Mapeo de los campos de la tabla
	// ID NUMBER
	// NOMBRE NVARCHAR2(50)
	// APP NVARCHAR2(50)
	// APM NVARCHAR2(50)
	// NUM_CELULAR NUMBER
	// CORREO NVARCHAR2(50)

	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR(50)", nullable = false)
	String nombre;

	@Column(name = "APP", columnDefinition = "NVARCHAR(50)", nullable = false)
	String app;

	@Column(name = "APM", columnDefinition = "NVARCHAR(50)", nullable = false)
	String apm;

	@Column(name = "NUM_CELULAR", columnDefinition = "NUMBER", nullable = true)
	long num_celular;

	@Column(name = "CORREO", columnDefinition = "NVARCHAR(50)", nullable = true)
	String correo;

	public Alumnos() {
	}

	public Alumnos(int id) {
		this.id = id;
	}

	public Alumnos(int id, String nombre, String app, String apm, long num_celular, String correo) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.num_celular = num_celular;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Alumnos [id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", num_celular="
				+ num_celular + ", correo=" + correo + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getApm() {
		return apm;
	}

	public void setApm(String apm) {
		this.apm = apm;
	}

	public long getNum_celular() {
		return num_celular;
	}

	public void setNum_celular(long num_celular) {
		this.num_celular = num_celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
