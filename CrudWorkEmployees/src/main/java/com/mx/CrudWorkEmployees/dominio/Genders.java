package com.mx.CrudWorkEmployees.dominio;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "GENDERS")
public class Genders {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// NAME NVARCHAR2(255) NOT NULL

	@Id
	int id;
	String name;

	@OneToMany(mappedBy = "genders", cascade = CascadeType.ALL)
	List<Employees> listaEst = new ArrayList<Employees>();

	public Genders() {
	}

	public Genders(int id) {
		this.id = id;
	}

	public Genders(int id, String name, List<Employees> listaEst) {
		this.id = id;
		this.name = name;
		this.listaEst = listaEst;
	}

	@Override
	public String toString() {
		return "Genders [id=" + id + ", name=" + name + ", listaEst=" + listaEst + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
