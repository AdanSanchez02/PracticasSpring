package com.mx.CrudAlumnos.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudAlumnos.dominio.Alumnos;

public interface AlumnosDao extends CrudRepository<Alumnos, Integer>{

	// lista por nombre
	public List<Alumnos> findByNombre(String nombre);
}
