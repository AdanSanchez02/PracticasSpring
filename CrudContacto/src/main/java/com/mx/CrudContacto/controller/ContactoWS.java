package com.mx.CrudContacto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudContacto.dominio.Contacto;
import com.mx.CrudContacto.servicio.ImpServContacto;

@RestController
@RequestMapping("Api/ContactoWS")
@CrossOrigin("*")
public class ContactoWS {

	@Autowired
	ImpServContacto impContacto;

	// http://localhost:9005/Api/ContactoWS/listar
	@GetMapping("listar")
	public List<Contacto> listar() {
		return impContacto.listar();
	}

	@PostMapping("guardar")
	public void guardar(@RequestBody Contacto c) {
		impContacto.guardar(c);
	}
	
	@PostMapping("buscar")
	public Contacto buscar(@RequestBody Contacto c) {
		return impContacto.buscar(c);
	}
	
	@PostMapping("editar")
	public void editar(@RequestBody Contacto c) {
		impContacto.editar(c);
	}
	
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Contacto c) {
		impContacto.eliminar(c);
	}

}
