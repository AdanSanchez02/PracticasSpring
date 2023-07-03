package com.mx.CrudZapateria.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ZAPATERIA")
public class Zapateria {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL
	// MARCA NVARCHAR2(20)
	// MODELO NVARCHAR2(20)
	// COLOR NVARCHAR2(20)
	// TAMANO NUMBER
	// PRECIO NUMBER
	// CANTIDAD NUMBER

	// Mapear la tabla
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;

	@Column(name = "MARCA", columnDefinition = "NVARCHAR(20)", nullable = false)
	String marca;

	@Column(name = "MODELO", columnDefinition = "NVARCHAR(20)", nullable = false)
	String modelo;

	@Column(name = "COLOR", columnDefinition = "NVARCHAR(20)", nullable = false)
	String color;

	@Column(name = "TAMANO", columnDefinition = "NUMBER", nullable = false)
	double tamano;

	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	double precio;

	@Column(name = "CANTIDAD", columnDefinition = "NUMBER", nullable = false)
	int cantidad;

	public Zapateria() {
	}

	public Zapateria(int id) {
		this.id = id;
	}

	public Zapateria(int id, String marca, String modelo, String color, double tamano, double precio, int cantidad) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamano = tamano;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Zapateria [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamano="
				+ tamano + ", precio=" + precio + ", cantidad=" + cantidad + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
