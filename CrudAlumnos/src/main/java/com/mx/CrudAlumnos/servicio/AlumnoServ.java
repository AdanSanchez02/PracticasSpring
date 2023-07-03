package com.mx.CrudAlumnos.servicio;

import java.util.List;

import com.mx.CrudAlumnos.dominio.Alumnos;

public interface AlumnoServ {

	public void guardar(Alumnos alm);

	public void editar(Alumnos alm);

	public void eliminar(Alumnos alm);

	public Alumnos buscar(Alumnos alm);

	public List<Alumnos> listar();

}
