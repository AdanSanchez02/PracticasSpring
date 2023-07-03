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

import com.mx.CrudWorkEmployees.dominio.Worked;
import com.mx.CrudWorkEmployees.servicios.ImpServWorked;

@RestController
@RequestMapping("WorkedWS")
@CrossOrigin("*")
public class WorkedWS {

	@Autowired
	ImpServWorked impWo;

	// http://localhost:9000/WorkedWS/listar
	@GetMapping("listar")
	public List<Worked> listar() {
		return impWo.listar();
	}

	// http://localhost:9000/WorkedWS/guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Worked w) {
		String resp;
		resp = (String) impWo.guardar(w);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	// http://localhost:9000/WorkedWS/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Worked w) {
		String resp;
		resp = (String) impWo.editar(w);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	// http://localhost:9000/WorkedWS/editar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Worked w) {
		impWo.eliminar(w);
	}

	// http://localhost:9000/WorkedWS/buscar
	@PostMapping("buscar")
	public Worked buscar(@RequestBody Worked w) {
		return impWo.buscar(w);
	}

}
