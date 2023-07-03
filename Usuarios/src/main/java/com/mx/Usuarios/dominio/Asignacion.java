package com.mx.Usuarios.dominio;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_ROL")
public class Asignacion {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// ID_USUARIO NUMBER NOT NULL,
	// ID_ROL NUMBER NOT NULL,

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_USUARIO")
	Usuario usuario;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_ROL")
	Rol rol;

	public Asignacion() {
	}

	public Asignacion(long id) {
		this.id = id;
	}
	

	public Asignacion(Usuario usuario, Rol rol) {
		this.usuario = usuario;
		this.rol = rol;
	}

	public Asignacion(long id, Usuario usuario, Rol rol) {
		this.id = id;
		this.usuario = usuario;
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Asignacion [id=" + id + ", usuario=" + usuario + ", rol=" + rol + "]\n";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

}
