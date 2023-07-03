package com.mx.CrudPaisEstado.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTADOS")
public class Estados {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// NOMBRE NVARCHAR2(50) NOT NULL,
	// NUMERO_HAB NUMBER,
	// EXTENSION_TERR NUMBER,

	// Mapear la tabla
	@Id
	int id;
	String nombre;
	long numero_hab;
	double extension_terr;

	// Cardinalidad -- muchos estados pertenecen a un pais
	@ManyToOne(fetch = FetchType.EAGER) // fetch - Me indica que debe cargar la entidad ---- FetchType.EAGER - me indica que la cardinalidad debe ser cargada al momento 	
	@JoinColumn(name = "ID_PAIS")
	Pais pais;

	public Estados() {
	}

	public Estados(int id) {
		this.id = id;
	}

	public Estados(int id, String nombre, long numero_hab, double extension_terr, int id_pais, Pais pais) {
		this.id = id;
		this.nombre = nombre;
		this.numero_hab = numero_hab;
		this.extension_terr = extension_terr;
		this.pais = pais;
	}

	

	@Override
	public String toString() {
		return "Estados [id=" + id + ", nombre=" + nombre + ", numero_hab=" + numero_hab + ", extension_terr="
				+ extension_terr + ", pais=" + pais + "]";
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

	public long getNumero_hab() {
		return numero_hab;
	}

	public void setNumero_hab(long numero_hab) {
		this.numero_hab = numero_hab;
	}

	public double getExtension_terr() {
		return extension_terr;
	}

	public void setExtension_terr(double extension_terr) {
		this.extension_terr = extension_terr;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
