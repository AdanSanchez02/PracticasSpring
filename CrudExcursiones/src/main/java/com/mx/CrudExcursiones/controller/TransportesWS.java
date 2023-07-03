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

import com.mx.CrudExcursiones.dominio.Transportes;
import com.mx.CrudExcursiones.servicios.ImpServTransportes;

@RestController
@RequestMapping("TransportesWS")
@CrossOrigin("*")
public class TransportesWS {

	@Autowired
	ImpServTransportes impTransportes;

	// http://localhost:9000/TransportesWS/listar
	@GetMapping("listar")
	public List<Transportes> listar() {
		return impTransportes.listar();
	}
	
	@PostMapping("guardar")
	public ResponseEntity<String> guardar(@RequestBody Transportes t){
		impTransportes.guardar(t);
		return new ResponseEntity<String>("Se guardo correctamente", HttpStatus.OK);
	}

	@PostMapping("editar")
	public ResponseEntity<String> editar(@RequestBody Transportes t){
		impTransportes.editar(t);
		return new ResponseEntity<String>("Se edito correctamente", HttpStatus.OK);
	}
	
	@PostMapping("eliminar")
	public ResponseEntity<String> eliminar(@RequestBody Transportes t){
		impTransportes.eliminar(t);
		return new ResponseEntity<String>("Se elimino correctamente", HttpStatus.OK);
	}
	
	@PostMapping("buscar")
	public Transportes buscar(@RequestBody Transportes t) {
		return impTransportes.buscar(t);
	}

}
