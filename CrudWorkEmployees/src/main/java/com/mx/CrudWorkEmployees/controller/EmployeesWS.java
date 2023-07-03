package com.mx.CrudWorkEmployees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudWorkEmployees.dominio.Employees;
import com.mx.CrudWorkEmployees.servicios.ImpServEmployees;

@RestController
@RequestMapping("EmployeesWS")
@CrossOrigin("*")
public class EmployeesWS {

	@Autowired
	ImpServEmployees impEmp;

	// http://localhost:9000/EmployeesWS/listar
	@GetMapping("listar")
	public List<Employees> listar() {
		return impEmp.listar();
	}

	// http://localhost:9000/EmployeesWS/guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Employees em) {
		String resp;
		resp = (String) impEmp.guardar(em);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	// http://localhost:9000/EmployeesWS/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Employees em) {
		String resp;
		resp = (String) impEmp.editar(em);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	// http://localhost:9000/EmployeesWS/editar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Employees em) {
		impEmp.eliminar(em);
	}

	// http://localhost:9000/EmployeesWS/buscar
	@PostMapping("buscar")
	public Employees buscar(@RequestBody Employees em) {
		return impEmp.buscar(em);
	}

	// http://localhost:9000/EmployeesWS/listarJob
	@GetMapping("listarJob")
	public List<Employees> listarJob(@RequestBody Employees em) {
		return impEmp.listarJob(em);
	}
}
