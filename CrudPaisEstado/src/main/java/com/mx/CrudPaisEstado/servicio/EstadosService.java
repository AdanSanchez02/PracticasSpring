package com.mx.CrudPaisEstado.servicio;

import java.util.List;

import com.mx.CrudPaisEstado.dominio.Estados;

public interface EstadosService {

	public void guardar(Estados est);

	public void editar(Estados est);

	public void eliminar(Estados est);

	public Estados buscar(Estados est);

	public List<Estados> listar();
	
}
