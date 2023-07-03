package com.mx.CrudPaisEstado.dominio;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PAIS")
public class Pais {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// NOMBRE NVARCHAR2(50) NOT NULL,
	// POBLACION NUMBER NOT NULL,
	// EXTE_TERRITORIAL NUMBER NOT NULL,
	// NUM_IDIOMAS NUMBER NOT NULL

	// Mapear la tabla
	@Id
	int id;
	String nombre;
	long poblacion;
	double exte_territorial;
	int num_idiomas;

	@OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
	List<Estados> listaEst = new ArrayList<Estados>();

	public Pais() {
	}

	public Pais(int id) {
		this.id = id;
	}

	public Pais(int id, String nombre, long poblacion, double exte_territorial, int num_idiomas,
			List<Estados> listaEst) {
		this.id = id;
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.exte_territorial = exte_territorial;
		this.num_idiomas = num_idiomas;
		this.listaEst = listaEst;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nombre=" + nombre + ", poblacion=" + poblacion + ", exte_territorial="
				+ exte_territorial + ", num_idiomas=" + num_idiomas + ", listaEst=" + listaEst + "]\n";
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

	public long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}

	public double getExte_territorial() {
		return exte_territorial;
	}

	public void setExte_territorial(double exte_territorial) {
		this.exte_territorial = exte_territorial;
	}

	public int getNum_idiomas() {
		return num_idiomas;
	}

	public void setNum_idiomas(int num_idiomas) {
		this.num_idiomas = num_idiomas;
	}

}
