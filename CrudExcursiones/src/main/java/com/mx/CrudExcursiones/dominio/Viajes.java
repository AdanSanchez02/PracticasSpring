package com.mx.CrudExcursiones.dominio;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "VIAJES")
public class Viajes {

	// ATRIBUTOS
	// ID NUMBER PRIMARY KEY NOT NULL,
	// ORIGEN NVARCHAR2(50) NOT NULL,
	// DESTINO NVARCHAR2(50) NOT NULL,
	// INICIO DATE NOT NULL,
	// FIN DATE NOT NULL,
	// PASAJEROS NUMBER NOT NULL,
	// COSTO NUMBER NOT NULL,
	// ID_VEHICULO NVARCHAR2(50) NOT NULL, // esta solo va para vincular la otra
	// clase

	@Id
	int id;
	String origen;
	String destino;
	Date inicio;
	Date fin;
	int pasajeros;
	double costo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_VEHICULO")
	Transportes transportes;

	public Viajes() {
	}

	public Viajes(int id) {
		this.id = id;
	}

	public Viajes(int id, String origen, String destino, Date inicio, Date fin, int pasajeros, double costo,
			Transportes transportes) {
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.inicio = inicio;
		this.fin = fin;
		this.pasajeros = pasajeros;
		this.costo = costo;
		this.transportes = transportes;
	}

	@Override
	public String toString() {
		return "Viajes [id=" + id + ", origen=" + origen + ", destino=" + destino + ", inicio=" + inicio + ", fin="
				+ fin + ", pasajeros=" + pasajeros + ", costo=" + costo + ", transportes=" + transportes + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getInicio() {
		return inicio;
	}

	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Transportes getTransportes() {
		return transportes;
	}

	public void setTransportes(Transportes transportes) {
		this.transportes = transportes;
	}

}
