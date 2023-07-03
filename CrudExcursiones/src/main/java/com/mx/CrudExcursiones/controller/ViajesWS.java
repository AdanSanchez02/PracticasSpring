package com.mx.CrudExcursiones.controller;

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

import com.mx.CrudExcursiones.dominio.Viajes;
import com.mx.CrudExcursiones.servicios.ImpServViajes;

@RestController
@RequestMapping("ViajesWS")
@CrossOrigin("*")
public class ViajesWS {

	@Autowired
	ImpServViajes impViajes;

	// http://localhost:9000/ViajesWS/listar
	@GetMapping("listar")
	public List<Viajes> listar() {
		return impViajes.listar();
	}
	
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Viajes v){
		impViajes.guardar(v);
		return new ResponseEntity<String>("Se guardo correctamente", HttpStatus.OK);
	}

	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Viajes v){
		impViajes.editar(v);
		return new ResponseEntity<String>("Se edito correctamente", HttpStatus.OK);
	}
	
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Viajes v){
		impViajes.eliminar(v);
		return new ResponseEntity<String>("Se elimino correctamente", HttpStatus.OK);
	}
	
	@PostMapping("buscar")
	public Viajes buscar(@RequestBody Viajes v) {
		return impViajes.buscar(v);
	}
}
