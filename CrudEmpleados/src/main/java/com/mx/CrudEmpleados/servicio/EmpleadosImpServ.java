package com.mx.CrudEmpleados.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudEmpleados.dao.EmpleadosDao;
import com.mx.CrudEmpleados.dominio.Empleados;

//para indicar que me realice un servicio
@Service
public class EmpleadosImpServ implements EmpleadoServ{

	//Inyecion de dependencias --- Autowired  --- permite tener un mejor control de los objetos que se inicializan
	@Autowired 
	EmpleadosDao empleadosDao;
	
	@Transactional // Me permite realizar la transaccin en un metodo
	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		empleadosDao.save(empleado);
		
	}

	@Transactional
	@Override
	public void editar(Empleados empleado) {
		// TODO Auto-generated method stub
		empleadosDao.save(empleado);
	}

	@Transactional
	@Override
	public void eliminar(Empleados empleado) {
		// TODO Auto-generated method stub
		empleadosDao.delete(empleado);
	}

	@Transactional(readOnly = true)
	@Override
	public Empleados buscar(Empleados empleado) {
		// TODO Auto-generated method stub
		return empleadosDao.findById(empleado.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Empleados> listar() {
		// TODO Auto-generated method stub
		return empleadosDao.findAll();
	}
	
	@Transactional(readOnly = true)
	@Override
	public Empleados buscarname(Empleados empleado) {
		Empleados emp = new Empleados();
		// Declaramos nuestro ciclo
		for(Empleados e: empleadosDao.findAll()) {
			if(e.getNombre().equals(empleado.getNombre())) {
				emp = e;
			}
		}
		return emp;
	}

	@Transactional(readOnly = true)
	@Override
	public List<Empleados> listarname(Empleados name) {
		// TODO Auto-generated method stub
		var lista = empleadosDao.findByNombre(name.getNombre());
		return lista;
	}
	
}

























