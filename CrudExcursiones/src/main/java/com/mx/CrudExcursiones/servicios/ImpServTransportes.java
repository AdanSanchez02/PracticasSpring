package com.mx.CrudExcursiones.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudExcursiones.dao.TransportesDao;
import com.mx.CrudExcursiones.dominio.Transportes;

@Service
public class ImpServTransportes implements TransportesServ{
	
	@Autowired
	TransportesDao transporteDao;

	@Transactional
	@Override
	public void guardar(Transportes trans) {
		transporteDao.save(trans);
	}

	@Transactional
	@Override
	public void editar(Transportes trans) {
		transporteDao.save(trans);
	}

	@Transactional
	@Override
	public void eliminar(Transportes trans) {
		transporteDao.delete(trans);
	}

	@Transactional(readOnly = true)
	@Override
	public Transportes buscar(Transportes trans) {
		return transporteDao.findById(trans.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Transportes> listar() {
		return (List<Transportes>) transporteDao.findAll();
	}

}
