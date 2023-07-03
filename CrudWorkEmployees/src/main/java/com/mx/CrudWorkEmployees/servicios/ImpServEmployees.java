package com.mx.CrudWorkEmployees.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudWorkEmployees.dao.EmployeesDao;
import com.mx.CrudWorkEmployees.dao.JobsDao;
import com.mx.CrudWorkEmployees.dominio.Employees;
import com.mx.CrudWorkEmployees.dominio.Jobs;

@Service
public class ImpServEmployees implements ServEmployees {

	@Autowired
	EmployeesDao empDao;
	@Autowired
	JobsDao jobDao;

	Date fecha = new Date();

	@SuppressWarnings("deprecation")
	@Transactional
	@Override
	public String guardar(Employees emp) {
		String text = null;
		int control = 0, trabajo = 1, edad = 1;

		for (Employees p : empDao.findAll()) {
			if (p.getId() == emp.getId()) {
				return "id";
			}
		}

		for (Employees p : empDao.findAll()) {
			if (p.getName().equals(emp.getName())) {
				if (p.getLast_name().equals(emp.getLast_name())) {
					control = 1;
					break;
				}
			}
		}

		for (Jobs p : jobDao.findAll()) {
			if (p.getId() == emp.getJobs().getId()) {
				trabajo = 0;
				break;
			}
		}

		int date1 = fecha.getYear();
		int date2 = emp.getBirthdate().getYear();
		if (date1 - date2 > 18) {
			edad = 0;
		}

		if (control == 1) {
			text = "nombre";
		} else if (trabajo == 1) {
			text = "puesto";
		} else if (edad == 1) {
			text = "menor";
		} else {
			empDao.save(emp);
			text = "true";
		}
		return text;
	}

	@SuppressWarnings("deprecation")
	@Transactional
	@Override
	public String editar(Employees emp) {
		String text = null;
		int trabajo = 1, edad = 1;

		for (Jobs p : jobDao.findAll()) {
			if (p.getId() == emp.getJobs().getId()) {
				trabajo = 0;
				break;
			}
		}

		int date1 = fecha.getYear();
		int date2 = emp.getBirthdate().getYear();
		if (date1 - date2 > 18) {
			edad = 0;
		}

		if (trabajo == 1) {
			text = "puesto";
		} else if (edad == 1) {
			text = "menor";
		} else {
			empDao.save(emp);
			text = "true";
		}
		return text;
	}

	@Transactional
	@Override
	public void eliminar(Employees emp) {
		empDao.delete(emp);
	}

	@Transactional
	@Override
	public Employees buscar(Employees emp) {
		return empDao.findById(emp.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Employees> listar() {
		return (List<Employees>) empDao.findAll();
	}

	@Transactional(readOnly = true)
	public List<Employees> listarJob(Employees emp) {
		List<Employees> aux = new ArrayList<Employees>();
		for (Employees t : empDao.findAll()) {
			if (t.getJobs().getId() == emp.getJobs().getId()) {
				aux.add(t);
			}
		}
		aux.sort((Employees t1, Employees t2) -> t1.getLast_name().compareTo(t2.getLast_name()));
		return aux;
	}

}
