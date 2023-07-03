package com.mx.Crud_TestCliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.Crud_TestCliente.dao.DireccionDao;
import com.mx.Crud_TestCliente.dominio.Direccion;

@Service
public class ImpServDireccion implements ServDireccion{
	
	
	@Autowired
	DireccionDao dirDao;

	@Transactional
	@Override
	public void guardar(Direccion dir) {
		// TODO Auto-generated method stub
		dirDao.save(dir);
	}

	@Transactional
	@Override
	public void editar(Direccion dir) {
		// TODO Auto-generated method stub
		dirDao.save(dir);
	}

	@Transactional
	@Override
	public void eliminar(Direccion dir) {
		// TODO Auto-generated method stub
		dirDao.delete(dir);
	}

	@Transactional(readOnly = true)
	@Override
	public Direccion buscar(Direccion dir) {
		// TODO Auto-generated method stub
		return dirDao.findById(dir.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Direccion> listar() {
		// TODO Auto-generated method stub
		return (List<Direccion>) dirDao.findAll();
	}

}
