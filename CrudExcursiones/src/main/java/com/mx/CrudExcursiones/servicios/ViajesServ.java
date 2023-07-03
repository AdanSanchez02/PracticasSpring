package com.mx.CrudExcursiones.servicios;

import java.util.List;

import com.mx.CrudExcursiones.dominio.Viajes;

public interface ViajesServ {

	public void guardar(Viajes viaje);

	public void editar(Viajes viaje);

	public void eliminar(Viajes viaje);

	public Viajes buscar(Viajes viaje);

	public List<Viajes> listar();
}
