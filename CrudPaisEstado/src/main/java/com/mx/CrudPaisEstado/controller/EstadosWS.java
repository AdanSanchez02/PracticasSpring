package com.mx.CrudPaisEstado.controller;

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

import com.mx.CrudPaisEstado.dominio.Estados;
import com.mx.CrudPaisEstado.servicio.EstadosImpServ;

@RestController
@RequestMapping("EstadosWS")
@CrossOrigin("*") // seguridad - solo accede al nombre del proyecto
public class EstadosWS {

	@Autowired
	EstadosImpServ impEst;

	// http://localhost:9000/EstadosWS/listar
	@GetMapping("listar")
	public List<Estados> listar() {
		return impEst.listar();
	}

	// http://localhost:9000/EstadosWS/guardar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Estados p) {
		impEst.guardar(p);
		return new ResponseEntity<String>(" Se guardo correctamente el estado", HttpStatus.OK);
	}

	// http://localhost:9000/EstadosWS/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Estados p) {
		impEst.editar(p);
		return new ResponseEntity<String>(" Se edito correctamente el estado", HttpStatus.OK);
	}

	// http://localhost:9000/EstadosWS/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Estados p) {
		impEst.eliminar(p);
		return new ResponseEntity<String>(" Se elimino correctamente el estado", HttpStatus.OK);
	}

	// http://localhost:9000/EstadosWS/buscar
	@PostMapping("buscar")
	public Estados buscar(@RequestBody Estados p) {
		return impEst.buscar(p);
	}

}
