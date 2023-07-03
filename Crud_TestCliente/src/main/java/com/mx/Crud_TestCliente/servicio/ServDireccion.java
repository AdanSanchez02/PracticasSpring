package com.mx.Crud_TestCliente.servicio;

import java.util.List;

import com.mx.Crud_TestCliente.dominio.Direccion;

public interface ServDireccion {
	
	public void guardar(Direccion dir);

	public void editar(Direccion dir);

	public void eliminar(Direccion dir);

	public Direccion buscar(Direccion dir);

	public List<Direccion> listar();

}
