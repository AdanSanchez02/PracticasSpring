package com.mx.CrudWorkEmployees.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudWorkEmployees.dao.JobsDao;
import com.mx.CrudWorkEmployees.dominio.Jobs;

@Service
public class ImpServJobs implements ServJobs {

	@Autowired
	JobsDao jobsDao;

	@Transactional
	@Override
	public String guardar(Jobs j) {
		String text = null;
		int idx = 0, trabajo = 0;

		for (Jobs p : jobsDao.findAll()) {
			if (p.getId() == j.getId()) {
				idx = 1;
				break;
			}
		}

		for (Jobs p : jobsDao.findAll()) {
			if (p.getName().equals(j.getName())) {
				trabajo = 1;
				break;
			}
		}

		if (idx == 1) {
			text = "id";
		} else if (trabajo == 1) {
			text = "name";
		} else {
			jobsDao.save(j);
			text = "true";
		}
		return text;
	}

	@Transactional
	@Override
	public String editar(Jobs j) {
		String text = null;
		int trabajo = 0;

		for (Jobs p : jobsDao.findAll()) {
			if (p.getName().equals(j.getName())) {
				trabajo = 1;
				break;
			}
		}

		if (trabajo == 1) {
			jobsDao.save(j);
			text = "true";
		} else {
			text = "name";
		}
		return text;
	}

	@Transactional
	@Override
	public void eliminar(Jobs j) {
		jobsDao.delete(j);
	}

	@Transactional(readOnly = true)
	@Override
	public Jobs buscar(Jobs j) {
		return jobsDao.findById(j.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Jobs> listar() {
		return (List<Jobs>) jobsDao.findAll();
	}

}
