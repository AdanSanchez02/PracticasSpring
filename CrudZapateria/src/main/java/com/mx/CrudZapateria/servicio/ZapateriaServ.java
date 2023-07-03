package com.mx.CrudZapateria.servicio;

import java.util.List;

import com.mx.CrudZapateria.dominio.Zapateria;

public interface ZapateriaServ {

	public void guardar(Zapateria zap);

	public void editar(Zapateria zap);

	public void eliminar(Zapateria zap);

	public Zapateria buscar(Zapateria zap);

	public List<Zapateria> listar();

	public Zapateria buscarModelo(Zapateria zap);

	public List<Zapateria> listarMarca(Zapateria zap);

	public List<Zapateria> listMM(Zapateria zp);
	
	public Zapateria guardarNC(Zapateria zap);
}
