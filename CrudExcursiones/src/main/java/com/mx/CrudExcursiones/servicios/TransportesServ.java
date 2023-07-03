package com.mx.CrudExcursiones.servicios;

import java.util.List;

import com.mx.CrudExcursiones.dominio.Transportes;

public interface TransportesServ {

	public void guardar(Transportes trans);

	public void editar(Transportes trans);

	public void eliminar(Transportes trans);

	public Transportes buscar(Transportes trans);

	public List<Transportes> listar();
}
