package com.mx.CrudPaisEstado.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudPaisEstado.dao.EstadosDao;
import com.mx.CrudPaisEstado.dominio.Estados;

@Service
public class EstadosImpServ implements EstadosService{
	
	@Autowired
	EstadosDao estDao;

	@Transactional
	@Override
	public void guardar(Estados est) {
		estDao.save(est);		
	}

	@Transactional
	@Override
	public void editar(Estados est) {
		estDao.save(est);
	}

	@Transactional
	@Override
	public void eliminar(Estados est) {
		estDao.delete(est);
	}

	@Transactional(readOnly = true)
	@Override
	public Estados buscar(Estados est) {
		// TODO Auto-generated method stub
		return estDao.findById(est.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Estados> listar() {
		// TODO Auto-generated method stub
		return (List<Estados>) estDao.findAll();
	}
	
	

}
