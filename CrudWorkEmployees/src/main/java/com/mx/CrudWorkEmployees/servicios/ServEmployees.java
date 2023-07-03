package com.mx.CrudWorkEmployees.servicios;

import java.util.List;

import com.mx.CrudWorkEmployees.dominio.Employees;


public interface ServEmployees {

	public String guardar(Employees emp);

	public String editar(Employees emp);

	public void eliminar(Employees emp);

	public Employees buscar(Employees emp);

	public List<Employees> listar();
}
