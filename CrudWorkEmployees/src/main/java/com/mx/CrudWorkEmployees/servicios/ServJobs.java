package com.mx.CrudWorkEmployees.servicios;

import java.util.List;

import com.mx.CrudWorkEmployees.dominio.Jobs;

public interface ServJobs {

	public String guardar(Jobs j);

	public String editar(Jobs j);

	public void eliminar(Jobs j);

	public Jobs buscar(Jobs j);

	public List<Jobs> listar();
}
