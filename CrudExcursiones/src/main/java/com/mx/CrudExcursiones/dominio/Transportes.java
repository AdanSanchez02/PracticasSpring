package com.mx.CrudExcursiones.dominio;

import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "TRANSPORTE")
public class Transportes {
	
	//ATRIBUTOS
	//ID NVARCHAR2(50) PRIMARY KEY NOT NULL,
	//VEHICULO NVARCHAR2(50) NOT NULL,
	//NUM_ASIENTOS NUMBER NOT NULL,
	//COMBUSTIBLE NVARCHAR2(20) NOT NULL,
	//DISPONIBILIDAD NVARCHAR2(10)NOT NULL
	@Id
	String id;
	String vehiculo;
	int num_asientos;
	String combustible;
	String disponibilidad;
	
	@OneToMany(mappedBy = "transportes", cascade = CascadeType.ALL)
	List<Viajes> listViajes = new ArrayList<Viajes>();

	public Transportes() {
	}

	public Transportes(String id) {
		this.id = id;
	}

	public Transportes(String id, String vehiculo, int num_asientos, String combustible, String disponibilidad,
			List<Viajes> listViajes) {
		this.id = id;
		this.vehiculo = vehiculo;
		this.num_asientos = num_asientos;
		this.combustible = combustible;
		this.disponibilidad = disponibilidad;
		this.listViajes = listViajes;
	}
	
	

	@Override
	public String toString() {
		return "Transportes [id=" + id + ", vehiculo=" + vehiculo + ", num_asientos=" + num_asientos + ", combustible="
				+ combustible + ", disponibilidad=" + disponibilidad + ", listViajes=" + listViajes + "]\n";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getNum_asientos() {
		return num_asientos;
	}

	public void setNum_asientos(int num_asientos) {
		this.num_asientos = num_asientos;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public String getDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	

}
