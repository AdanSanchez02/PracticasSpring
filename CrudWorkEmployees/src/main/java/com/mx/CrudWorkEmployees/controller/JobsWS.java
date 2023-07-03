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

import com.mx.CrudWorkEmployees.dominio.Jobs;
import com.mx.CrudWorkEmployees.servicios.ImpServJobs;

@RestController
@RequestMapping("JobsWS")
@CrossOrigin("*")
public class JobsWS {

	@Autowired
	ImpServJobs impJob;

	// http://localhost:9000/JobsWS/listar
	@GetMapping("listar")
	public List<Jobs> listar() {
		return impJob.listar();
	}

	// http://localhost:9000/JobsWS/guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Jobs j) {
		String resp;
		resp = (String) impJob.guardar(j);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	// http://localhost:9000/JobsWS/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Jobs j) {
		String resp;
		resp = (String) impJob.editar(j);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

	// http://localhost:9000/JobsWS/editar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Jobs j) {
		impJob.eliminar(j);
	}

	// http://localhost:9000/JobsWS/buscar
	@PostMapping("buscar")
	public Jobs buscar(@RequestBody Jobs j) {
		return impJob.buscar(j);
	}

}
