package com.mx.CrudPaisEstado.servicio;

import java.util.List;

import com.mx.CrudPaisEstado.dominio.Pais;


public interface PaisService {

	public void guardar(Pais pais);

	public void editar(Pais pais);

	public void eliminar(Pais pais);

	public Pais buscar(Pais pais);

	public List<Pais> listar();
}
