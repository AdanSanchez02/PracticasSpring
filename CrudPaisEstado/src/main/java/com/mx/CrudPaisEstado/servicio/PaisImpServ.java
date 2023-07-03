package com.mx.CrudPaisEstado.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudPaisEstado.dao.PaisDao;
import com.mx.CrudPaisEstado.dominio.Pais;

@Service
public class PaisImpServ implements PaisService {

	@Autowired
	PaisDao paisDao;
	
	@Transactional
	@Override
	public void guardar(Pais pais) {
		paisDao.save(pais);		
	}

	@Transactional
	@Override
	public void editar(Pais pais) {
		paisDao.save(pais);
	}

	@Transactional
	@Override
	public void eliminar(Pais pais) {
		paisDao.delete(pais);
	}

	@Transactional(readOnly = true)
	@Override
	public Pais buscar(Pais pais) {
		// TODO Auto-generated method stub
		return paisDao.findById(pais.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return (List<Pais>) paisDao.findAll();
	}

}
