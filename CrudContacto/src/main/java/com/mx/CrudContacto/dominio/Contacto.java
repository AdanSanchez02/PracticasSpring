package com.mx.CrudContacto.dominio;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CONTACTO")
public class Contacto {

	@Id
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	int id;

	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String nombre;
	
	@Column(name = "APS", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String aps;
	
	@Column(name = "FECHA", columnDefinition = "DATE", nullable = false)
	Date fecha;
	
	@Column(name = "CORREO", columnDefinition = "NVARCHAR2(50)", nullable = false)
	String correo;
	
	@Column(name = "COMENTARIO", columnDefinition = "NVARCHAR2(250)", nullable = false)
	String comentario;

	public Contacto() {
	}

	public Contacto(int id) {
		this.id = id;
	}

	public Contacto(int id, String nombre, String aps, Date fecha, String correo, String comentario) {
		this.id = id;
		this.nombre = nombre;
		this.aps = aps;
		this.fecha = fecha;
		this.correo = correo;
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Contacto [id=" + id + ", nombre=" + nombre + ", aps=" + aps + ", fecha=" + fecha + ", correo=" + correo
				+ ", comentario=" + comentario + "]\n";
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
