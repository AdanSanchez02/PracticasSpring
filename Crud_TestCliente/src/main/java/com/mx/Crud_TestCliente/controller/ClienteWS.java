package com.mx.Crud_TestCliente.controller;

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

import com.mx.Crud_TestCliente.dominio.Cliente;
import com.mx.Crud_TestCliente.servicio.ImpServCliente;

@RestController
@RequestMapping("ClienteWS")
@CrossOrigin
public class ClienteWS {

	@Autowired
	ImpServCliente impCli;
	
	// http://localhost:9000/ClienteWS/listar
		@GetMapping("listar")
		public List<Cliente> listar() {
			List<Cliente> lisalm = impCli.listar();
			return lisalm;
		}

		// http://localhost:9000/ClienteWS/guardar
		@PostMapping("guardar")
		public ResponseEntity<String> guardar(@RequestBody Cliente cliente) {
			String resp;
			resp = impCli.guardar(cliente);
			return new ResponseEntity<String>(resp, HttpStatus.OK);
		}

		// http://localhost:9000/ClienteWS/editar
		@PostMapping("editar")
		public void editar(@RequestBody Cliente cliente) {
			impCli.editar(cliente);
		}

		// http://localhost:9000/ClienteWS/eliminar
		@PostMapping("eliminar")
		public void eliminar(@RequestBody Cliente cliente) {
			impCli.eliminar(cliente);
		}

		// http://localhost:9000/ClienteWS/buscar
		@PostMapping("buscar")
		public Cliente buscar(@RequestBody Cliente cliente) {
			return impCli.buscar(cliente);
		}
}
