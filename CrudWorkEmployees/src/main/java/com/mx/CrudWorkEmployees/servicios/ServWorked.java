package com.mx.CrudWorkEmployees.servicios;

import java.util.List;

import com.mx.CrudWorkEmployees.dominio.Worked;

public interface ServWorked {

	public String guardar(Worked w);

	public String editar(Worked w);

	public void eliminar(Worked w);

	public Worked buscar(Worked w);

	public List<Worked> listar();
}
