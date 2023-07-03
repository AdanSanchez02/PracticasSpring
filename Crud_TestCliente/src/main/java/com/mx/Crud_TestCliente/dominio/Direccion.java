package com.mx.Crud_TestCliente.dominio;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIRECCION_CLIENTE")
public class Direccion {

	/*
	 * Atributos ID NUMBER PRIMARY KEY NOT NULL, CALLE NVARCHAR2(50) NOT NULL,
	 * NUM_INT NUMBER NOT NULL, NUM_EXT NUMBER NOT NULL, CP NUMBER NOT NULL
	 */

	@Id
	int id;
	String calle;
	int num_int;
	int num_ext;
	int cp;
	
	@OneToMany(mappedBy = "direccion", cascade = CascadeType.ALL)
	List<Cliente> listCliente = new ArrayList<Cliente>();

	public Direccion() {
	}

	public Direccion(int id) {
		this.id = id;
	}

	public Direccion(int id, String calle, int num_int, int num_ext, int cp, List<Cliente> listCliente) {
		super();
		this.id = id;
		this.calle = calle;
		this.num_int = num_int;
		this.num_ext = num_ext;
		this.cp = cp;
		this.listCliente = listCliente;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", num_int=" + num_int + ", num_ext=" + num_ext + ", cp="
				+ cp + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNum_int() {
		return num_int;
	}

	public void setNum_int(int num_int) {
		this.num_int = num_int;
	}

	public int getNum_ext() {
		return num_ext;
	}

	public void setNum_ext(int num_ext) {
		this.num_ext = num_ext;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	
	
}
