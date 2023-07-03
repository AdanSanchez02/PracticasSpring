package com.mx.CrudExcursiones.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudExcursiones.dao.ViajesDao;
import com.mx.CrudExcursiones.dominio.Viajes;

@Service
public class ImpServViajes implements ViajesServ{
	
	@Autowired
	ViajesDao viajesDao;

	@Transactional
	@Override
	public void guardar(Viajes viaje) {
		viajesDao.save(viaje);
	}

	@Transactional
	@Override
	public void editar(Viajes viaje) {
		viajesDao.save(viaje);
	}

	@Transactional
	@Override
	public void eliminar(Viajes viaje) {
		viajesDao.delete(viaje);
	}

	@Transactional(readOnly = true)
	@Override
	public Viajes buscar(Viajes viaje) {
		return viajesDao.findById(viaje.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Viajes> listar() {
		return (List<Viajes>) viajesDao.findAll();
	}

}
