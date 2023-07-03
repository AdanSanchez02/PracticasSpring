package com.mx.CrudAlumnos.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudAlumnos.dao.AlumnosDao;
import com.mx.CrudAlumnos.dominio.Alumnos;

@Service
public class AlumnosImpServ implements AlumnoServ {

	@Autowired
	AlumnosDao alumDao;

	@Transactional
	@Override
	public void guardar(Alumnos alm) {
		// TODO Auto-generated method stub
		alumDao.save(alm);

	}

	@Transactional
	@Override
	public void editar(Alumnos alm) {
		// TODO Auto-generated method stub
		alumDao.save(alm);
	}

	@Transactional
	@Override
	public void eliminar(Alumnos alm) {
		// TODO Auto-generated method stub
		alumDao.delete(alm);
	}

	@Transactional(readOnly = true)
	@Override
	public Alumnos buscar(Alumnos alm) {
		// TODO Auto-generated method stub
		return alumDao.findById(alm.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Alumnos> listar() {
		// TODO Auto-generated method stub
		var ls = alumDao.findAll();
		return (List<Alumnos>) ls;
	}

	public void eliminarCorreo(Alumnos alm) {
		int val = 0;
		Alumnos am = new Alumnos();
		for (Alumnos z : alumDao.findAll()) {
			if (z.getCorreo().equals(alm.getCorreo())) {
				am = z;
				val = 1;
				break;
			}
		}
		if (val == 1) {
			alumDao.delete(am);
			System.out.println("Eliminado");
		} else {
			System.out.println("No Encontrado");
		}
	}

	@Transactional(readOnly = true)
	public Alumnos buscarAlumno(Alumnos alm) {
		Alumnos al = new Alumnos();
		int val = 0;
		for (Alumnos z : alumDao.findAll()) {
			if (z.getNombre().equals(alm.getNombre()) && z.getApp().equals(alm.getApp())) {
				val = 1;
				al = z;
				break;
			}
		}
		if (val == 1) {
			System.out.println("Encontrado");
		} else {
			al = null;
			System.out.println("No encontro");
		}
		return al;
	}

	@Transactional(readOnly = true)
	public List<Alumnos> listarNombre(Alumnos alm) {
		var al = alumDao.findByNombre(alm.getNombre());
		return al;
	}

}

























