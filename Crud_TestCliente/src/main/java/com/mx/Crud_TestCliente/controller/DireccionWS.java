package com.mx.Crud_TestCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.Crud_TestCliente.dominio.Direccion;
import com.mx.Crud_TestCliente.servicio.ImpServDireccion;

@RestController
@RequestMapping("DireccionWS")
@CrossOrigin
public class DireccionWS {

	@Autowired
	ImpServDireccion impDir;
	
	// http://localhost:9000/DireccionWS/listar
		@GetMapping("listar")
		public List<Direccion> listar() {
			List<Direccion> lisalm = impDir.listar();
			return lisalm;
		}

		// http://localhost:9000/DireccionWS/guardar
		@PostMapping("guardar")
		public void guardar(@RequestBody Direccion direccion) {
			impDir.guardar(direccion);
		}

		// http://localhost:9000/DireccionWS/editar
		@PostMapping("editar")
		public void editar(@RequestBody Direccion direccion) {
			impDir.editar(direccion);
		}

		// http://localhost:9000/DireccionWS/eliminar
		@PostMapping("eliminar")
		public void eliminar(@RequestBody Direccion direccion) {
			impDir.eliminar(direccion);
		}

		// http://localhost:9000/DireccionWS/buscar
		@PostMapping("buscar")
		public Direccion buscar(@RequestBody Direccion direccion) {
			return impDir.buscar(direccion);
		}
}
