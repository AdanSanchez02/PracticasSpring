package com.mx.CrudEmpleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudEmpleados.dominio.Empleados;
import com.mx.CrudEmpleados.servicio.EmpleadosImpServ;

@RestController
@RequestMapping("EmpleadosWS")
@CrossOrigin
public class EmpleadosWS {

	// @RestController -- Nos permite marcar como controlador de solicitudes y se
	// utiliza para crear servicion web restful --> web service de tipo res
	// @RequestMapping -- Se utiliza para asignar solicitudes web a los entornos de
	// spring controller
	// @CrossOrigin -- Es por la seguridad que permite restringir los recursos
	// implementados en los navegadores

	// Inyeccion de dependencias
	@Autowired
	EmpleadosImpServ emp;

	// Peticiones utilizando el protoco http o endpoint --> GET POST VIEW
	// URL ==> URL del servidor local + path de nuesta clase + path del metodo

	// http://localhost:9000/EmpleadosWS/listar
	@GetMapping("listar")
	public List<Empleados> listar() {
		List<Empleados> listEmp = emp.listar();
		return listEmp;
	}

	// http://localhost:9000/EmpleadosWS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Empleados empleado) {
		emp.guardar(empleado);
	}

	// http://localhost:9000/EmpleadosWS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Empleados empleado) {
		emp.editar(empleado);
	}

	// http://localhost:9000/EmpleadosWS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Empleados empleado) {
		emp.eliminar(empleado);
	}

	// http://localhost:9000/EmpleadosWS/buscar
	@PostMapping("buscar")
	public Empleados buscar(@RequestBody Empleados empleado) {
		return emp.buscar(empleado);
	}

	// http://localhost:9000/EmpleadosWS/listarname
	@GetMapping("listarname")
	public List<Empleados> listarname(@RequestBody Empleados empleado) {
		List<Empleados> listEmp = emp.listarname(empleado);
		return listEmp;
	}

	// http://localhost:9000/EmpleadosWS/buscarname
	@PostMapping("buscarname")
	public Empleados buscarname(@RequestBody Empleados empleado) {
		return emp.buscarname(empleado);
	}

}
