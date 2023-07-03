package com.mx.CrudGS.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TESTGS")
public class Directorio {

	@Id
	int id;
	String item;
	int padre;
	int acceso;
	String ruta;

	public Directorio() {
	}

	public Directorio(int id) {
		this.id = id;
	}

	public Directorio(int id, String item, int padre, int acceso, String ruta) {
		super();
		this.id = id;
		this.item = item;
		this.padre = padre;
		this.acceso = acceso;
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Directorio [id=" + id + ", item=" + item + ", padre=" + padre + ", acceso=" + acceso + ", ruta=" + ruta
				+ "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPadre() {
		return padre;
	}

	public void setPadre(int padre) {
		this.padre = padre;
	}

	public int getAcceso() {
		return acceso;
	}

	public void setAcceso(int acceso) {
		this.acceso = acceso;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	


}
