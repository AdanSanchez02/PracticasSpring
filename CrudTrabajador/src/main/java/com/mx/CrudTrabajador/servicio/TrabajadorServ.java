package com.mx.CrudTrabajador.servicio;

import java.util.List;

import com.mx.CrudTrabajador.dominio.Trabajador;



public interface TrabajadorServ {

	public void guardar(Trabajador tra);

	public void editar(Trabajador tra);

	public void eliminar(Trabajador tra);

	public Trabajador buscar(Trabajador tra);

	public List<Trabajador> listar();
}
