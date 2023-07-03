package com.mx.CrudEmpleados.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudEmpleados.dominio.Empleados;

//JPARepository -- Esto es una clase de spring data que contiene los metodos o procediientos de las operaciones CRUD
public interface EmpleadosDao extends JpaRepository<Empleados, Integer> {

	// lista por nombre
	public List<Empleados> findByNombre(String nombre);
}
