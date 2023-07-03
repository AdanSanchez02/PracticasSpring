package com.mx.CrudWorkEmployees.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudWorkEmployees.dao.EmployeesDao;
import com.mx.CrudWorkEmployees.dao.WorkedDao;
import com.mx.CrudWorkEmployees.dominio.Employees;
import com.mx.CrudWorkEmployees.dominio.Worked;

@Service
public class ImpServWorked implements ServWorked {
	
	@Autowired
	WorkedDao woDao;

	@Autowired
	EmployeesDao empDao;
	
	@Transactional
	@Override
	public String guardar(Worked w) {
		String text = null;
		int control = 0;
		for(Employees d: empDao.findAll()) {
			if(d.getId() == w.getEmployees().getId()) {
				System.out.println("EMPLEADOS EXISTENTES");
				control = 1;
				break;
			}
		}
		if(control == 1) {
			text = "true";
			woDao.save(w);
		}else {
			text = "empleado";
		}
		return text;
	}

	@Transactional
	@Override
	public String editar(Worked w) {
		String text = null;
		int control = 0;
		for(Employees d: empDao.findAll()) {
			if(d.getId() == w.getEmployees().getId()) {
				System.out.println("EMPLEADOS EXISTENTES");
				control = 1;
				break;
			}
		}
		if(control == 1) {
			text = "true";
			woDao.save(w);
		}else {
			text = "empleado";
		}
		return text;
	}

	@Transactional
	@Override
	public void eliminar(Worked w) {
		woDao.delete(w);
	}

	@Transactional(readOnly = true)
	@Override
	public Worked buscar(Worked w) {
		return woDao.findById(w.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Worked> listar() {
		return (List<Worked>) woDao.findAll();
	}

}
