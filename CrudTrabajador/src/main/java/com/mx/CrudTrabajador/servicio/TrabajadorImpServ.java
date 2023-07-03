package com.mx.CrudTrabajador.servicio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudTrabajador.dao.TrabajadorDao;
import com.mx.CrudTrabajador.dominio.Trabajador;

@Service
public class TrabajadorImpServ implements TrabajadorServ {

	@Autowired
	TrabajadorDao trab;

	@Transactional
	@Override
	public void guardar(Trabajador tra) {
		trab.save(tra);
	}

	@Transactional
	@Override
	public void editar(Trabajador tra) {
		trab.save(tra);
	}

	@Transactional
	@Override
	public void eliminar(Trabajador tra) {
		trab.delete(tra);
	}

	@Transactional(readOnly = true)
	@Override
	public Trabajador buscar(Trabajador tra) {
		return trab.findById(tra.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Trabajador> listar() {
		var lis = trab.findAll();
		return (List<Trabajador>) lis;
	}

	@Transactional
	public void eliminarNumCel(Trabajador tra) {
		long t, b;
		for (Trabajador tr : trab.findAll()) {
			t = tr.getCel();
			b = tra.getCel();
			if (t == b) {
				trab.delete(tr);
				System.out.println("Eliminado");
				break;
			}
		}
	}

	@Transactional
	public void guardarValCel(Trabajador tra) {
		int val = 0;
		long t, b;
		for (Trabajador tr : trab.findAll()) {
			t = tr.getCel();
			b = tra.getCel();
			if (t == b) {
				val = 1;
				break;
			}
		}
		if (val == 1) {
			System.out.println("Numero de celular repetido");
		} else {
			trab.save(tra);
			System.out.println("Guardado");
		}
	}

	@Transactional(readOnly = true)
	public List<Trabajador> listarSueldo(Trabajador tra) {
		List<Trabajador> aux = new ArrayList<Trabajador>();
		int s, b;
		for (Trabajador t : trab.findAll()) {
			s = (int) t.getSalario();
			b = (int) tra.getSalario();
			if (s == b) {
				aux.add(t);
			}
		}
		return aux;
	}

	@Transactional(readOnly = true)
	public Trabajador buscarNoAp(Trabajador tra) {
		Trabajador t = new Trabajador();
		int val = 0;
		for (Trabajador j : trab.findAll()) {
			if (j.getNombre().equals(tra.getNombre()) && j.getAps().equals(tra.getAps())) {
				val = 1;
				t = j;
			}
		}
		if (val == 1) {
			System.out.println("Encontrado");
		} else {
			t = null;
			System.out.println("No encontro");
		}
		return t;
	}

}
