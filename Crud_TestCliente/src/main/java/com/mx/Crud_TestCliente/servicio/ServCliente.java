package com.mx.Crud_TestCliente.servicio;

import java.util.List;

import com.mx.Crud_TestCliente.dominio.Cliente;


public interface ServCliente {

	public String guardar(Cliente cl);

	public void editar(Cliente cl);

	public void eliminar(Cliente cl);

	public Cliente buscar(Cliente cl);

	public List<Cliente> listar();
}
