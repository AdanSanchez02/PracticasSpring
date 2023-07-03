package com.mx.Crud_TestCliente.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

	/*
	 * Atributos ID NUMBER PRIMARY KEY NOT NULL, NOMBRES NVARCHAR2(30) NOT NULL, APP
	 * NVARCHAR2(20) NOT NULL, APM NVARCHAR2(20) NOT NULL, NUM_CEL NUMBER NOT NULL,
	 * CORREO NVARCHAR2(50) NOT NULL, DIR_ID NUMBER NOT NULL, STATUS NUMBER NOT
	 * NULL,
	 */

	@Id
	int id;
	String nombres;
	String app;
	String apm;
	long num_cel;
	String correo;
	int status;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DIR_ID")
	Direccion direccion;

	public Cliente() {
	}

	public Cliente(int id) {
		this.id = id;
	}

	public Cliente(int id, String nombres, String app, String apm, long num_cel, String correo, int status,
			Direccion direccion) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.app = app;
		this.apm = apm;
		this.num_cel = num_cel;
		this.correo = correo;
		this.status = status;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombres=" + nombres + ", app=" + app + ", apm=" + apm + ", num_cel=" + num_cel
				+ ", correo=" + correo + ", status=" + status + ", direccion=" + direccion + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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

	public long getNum_cel() {
		return num_cel;
	}

	public void setNum_cel(long num_cel) {
		this.num_cel = num_cel;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	

}
