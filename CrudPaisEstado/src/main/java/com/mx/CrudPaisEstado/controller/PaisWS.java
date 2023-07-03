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

import com.mx.CrudPaisEstado.dominio.Pais;
import com.mx.CrudPaisEstado.servicio.PaisImpServ;

@RestController
@RequestMapping("PaisWS")
@CrossOrigin("*") // seguridad - solo accede al nombre del proyecto
public class PaisWS {

	@Autowired
	PaisImpServ impPais;

	// http://localhost:9000/PaisWS/listar
	@GetMapping("listar")
	public List<Pais> listar() {
		return impPais.listar();
	}
	
	// http://localhost:9000/PaisWS/listar
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Pais p) {
		impPais.guardar(p);
		return new ResponseEntity<String>(" Se guardo correctamente el pais", HttpStatus.OK);
	}
	
	// http://localhost:9000/PaisWS/editar
	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Pais p) {
		impPais.editar(p);
		return new ResponseEntity<String>(" Se edito correctamente el pais", HttpStatus.OK);
	}
	
	// http://localhost:9000/PaisWS/eliminar
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Pais p) {
		impPais.eliminar(p);
		return new ResponseEntity<String>(" Se elimino correctamente el pais", HttpStatus.OK);
	}
	
	// http://localhost:9000/PaisWS/buscar
	@PostMapping("buscar")
	public Pais buscar(@RequestBody Pais p) {
		return impPais.buscar(p);
	}

}


















