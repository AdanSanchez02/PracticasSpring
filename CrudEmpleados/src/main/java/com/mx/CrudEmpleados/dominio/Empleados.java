package com.mx.CrudEmpleados.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Estereotipos o anotaciones, indicamos que esta clase va a pertenecer a una tabla
@Entity
@Table(name = "EMPLEADOS_OX")
public class Empleados {

	// Atributos
	/*
	 * CREATE TABLE EMPLEADOS_OX( ID NUMBER PRIMARY KEY, NOMBRE NVARCHAR2(50), APP
	 * NVARCHAR2(50), APM NVARCHAR2(50), NSS NUMBER, NUM_CEL NUMBER, SUELDO NUMBER,
	 * CORREO NVARCHAR2(50) );
	 */

	// Mapear la tabla
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR(50)", nullable = false)
	String nombre;

	@Column(name = "APP", columnDefinition = "NVARCHAR(50)", nullable = false)
	String app;

	@Column(name = "APM", columnDefinition = "NVARCHAR(50)", nullable = false)
	String apm;

	@Column(name = "NSS", columnDefinition = "NUMBER", nullable = false)
	long nss;

	@Column(name = "NUM_CEL", columnDefinition = "NUMBER", nullable = false)
	long num_cel;

	@Column(name = "SUELDO", columnDefinition = "NUMBER", nullable = false)
	double sueldo;

	@Column(name = "CORREO", columnDefinition = "NVARCHAR(50)", nullable = false)
	String correo;

	public Empleados() {
	}

	public Empleados(int id) {
		this.id = id;
	}

	public Empleados(String nombre) {

		this.nombre = nombre;
	}

	public Empleados(int id, String nombre, String app, String apm, long nss, long num_cel, double sueldo,
			String correo) {
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.apm = apm;
		this.nss = nss;
		this.num_cel = num_cel;
		this.sueldo = sueldo;
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", app=" + app + ", apm=" + apm + ", nss=" + nss
				+ ", num_cel=" + num_cel + ", sueldo=" + sueldo + ", correo=" + correo + "]\n";
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

	public long getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

	public long getNum_cel() {
		return num_cel;
	}

	public void setNum_cel(long num_cel) {
		this.num_cel = num_cel;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
