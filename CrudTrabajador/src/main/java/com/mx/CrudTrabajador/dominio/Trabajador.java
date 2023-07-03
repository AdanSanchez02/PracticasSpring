package com.mx.CrudTrabajador.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRABAJADOR")
public class Trabajador {

	// TABLE TRABAJADOR --> ATRIBUTOS <--
	// ID NUMBER PRIMARY KEY NOT NULL,
	// NOMBRE NVARCHAR2(20),
	// APS NVARCHAR2(20),
	// CEL NUMBER,
	// SAL_QUIN NUMBER,
	// COMISIONES NUMBER

	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR(20)", nullable = false)
	String nombre;

	@Column(name = "APS", columnDefinition = "NVARCHAR(20)", nullable = false)
	String aps;

	@Column(name = "CEL", columnDefinition = "NUMBER", nullable = false)
	long cel;

	@Column(name = "SALARIO", columnDefinition = "NUMBER", nullable = false)
	int salario;

	@Column(name = "COMISIONES", columnDefinition = "NUMBER", nullable = false)
	int comisiones;

	public Trabajador() {
	}

	public Trabajador(int id) {
		this.id = id;
	}

	public Trabajador(int id, String nombre, String aps, long cel, int sal_quin, int comisiones, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.aps = aps;
		this.cel = cel;
		this.salario = salario;
		this.comisiones = comisiones;
	}

	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", aps=" + aps + ", cel=" + cel + ", salario="
				+ salario + ", comisiones=" + comisiones + "]\n";
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

	public String getAps() {
		return aps;
	}

	public void setAps(String aps) {
		this.aps = aps;
	}

	public long getCel() {
		return cel;
	}

	public void setCel(long cel) {
		this.cel = cel;
	}

	public long getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public long getComisiones() {
		return comisiones;
	}

	public void setComisiones(int comisiones) {
		this.comisiones = comisiones;
	}

}
