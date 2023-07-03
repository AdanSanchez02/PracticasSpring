package com.mx.CrudContacto.servicio;

import java.util.List;

import com.mx.CrudContacto.dominio.Contacto;

public interface ServContacto {
	
	public void guardar(Contacto c);

	public void editar(Contacto c);
	
	public void eliminar(Contacto c);
	
	public Contacto buscar(Contacto c);
	
	public List<Contacto> listar();
}
