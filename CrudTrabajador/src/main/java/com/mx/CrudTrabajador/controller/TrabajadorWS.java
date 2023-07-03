package com.mx.CrudTrabajador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudTrabajador.dominio.Trabajador;
import com.mx.CrudTrabajador.servicio.TrabajadorImpServ;

@RestController
@RequestMapping("TrabajadorWS")
@CrossOrigin
public class TrabajadorWS {

	@Autowired
	TrabajadorImpServ imp;

	// http://localhost:9000/TrabajadorWS/listar
	@GetMapping("listar")
	public List<Trabajador> listar() {
		List<Trabajador> listr = imp.listar();
		return listr;
	}

	// http://localhost:9000/TrabajadorWS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Trabajador tra) {
		imp.guardar(tra);
	}

	// http://localhost:9000/TrabajadorWS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Trabajador tra) {
		imp.eliminar(tra);
	}

	// http://localhost:9000/TrabajadorWS/buscar
	@PostMapping("buscar")
	public Trabajador buscar(@RequestBody Trabajador tra) {
		return imp.buscar(tra);
	}

	// http://localhost:9000/TrabajadorWS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Trabajador tra) {
		imp.editar(tra);
	}

	// http://localhost:9000/TrabajadorWS/eliminarNumCel
	@PostMapping("eliminarNumCel")
	public void eliminarNumCel(@RequestBody Trabajador tra) {
		imp.eliminarNumCel(tra);
	}

	// http://localhost:9000/TrabajadorWS/guardarValCel
	@PostMapping("guardarValCel")
	public void guardarValCel(@RequestBody Trabajador tra) {
		imp.guardarValCel(tra);
	}

	// http://localhost:9000/TrabajadorWS/listarSueldo
	@GetMapping("listarSueldo")
	public List<Trabajador> listarSueldo(@RequestBody Trabajador tra) {
		List<Trabajador> listr = imp.listarSueldo(tra);
		return listr;
	}

	// http://localhost:9000/TrabajadorWS/buscarNoAp
	@PostMapping("buscarNoAp")
	public Trabajador buscarNoAp(@RequestBody Trabajador tra) {
		return imp.buscarNoAp(tra);
	}
}
