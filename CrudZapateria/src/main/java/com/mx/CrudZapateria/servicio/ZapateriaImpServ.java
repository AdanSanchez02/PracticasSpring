package com.mx.CrudZapateria.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudZapateria.dao.ZapateriaDao;
import com.mx.CrudZapateria.dominio.Zapateria;

@Service // ---> indicar un servicio
public class ZapateriaImpServ implements ZapateriaServ {

	@Autowired
	ZapateriaDao zapDao;

	@Transactional
	@Override
	public void guardar(Zapateria zap) {
		zapDao.save(zap);

	}

	@Transactional
	@Override
	public void editar(Zapateria zap) {
		zapDao.save(zap);
	}

	@Transactional
	@Override
	public void eliminar(Zapateria zap) {
		zapDao.delete(zap);
	}

	@Transactional(readOnly = true)
	@Override
	public Zapateria buscar(Zapateria zap) {
		var bc = zapDao.findById(zap.getId()).orElse(null);
		return bc;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Zapateria> listar() {
		var lz = zapDao.findAll();
		return lz;
	}

	@Transactional(readOnly = true)
	@Override
	public Zapateria buscarModelo(Zapateria zap) {
		Zapateria zp = new Zapateria();
		for (Zapateria z : zapDao.findAll()) {
			if (z.getMarca().equals(zap.getMarca()) && z.getModelo().equals(zap.getModelo())) {
				zp = z;
			}
		}
		return zp;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Zapateria> listarMarca(Zapateria zap) {
		var lm = zapDao.findByMarca(zap.getMarca());
		return lm;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Zapateria> listMM(Zapateria zp) {
		List<Zapateria> zpt = new ArrayList<Zapateria>();

		for (Zapateria z : zapDao.findAll()) {
			if (z.getModelo().equals(zp.getModelo())) {
				zpt.add(z);
			}
		}
		return zpt;
	}

	@Transactional
	@Override
	public Zapateria guardarNC(Zapateria zap) {
		Zapateria zp = new Zapateria();
		int val=0;
		for (Zapateria z : zapDao.findAll()) {
			if (z.getId() == zap.getId()) {
				val =1;
				break;
			} 
		}
		if(val == 1) {
			zp = null;	
			System.out.println("No Guardo");
		}else {
			zp = zap;
			System.out.println("Guardar zap");
		}
		return zp;
	}

}
