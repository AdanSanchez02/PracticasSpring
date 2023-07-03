package com.mx.CrudAlumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudAlumnos.dominio.Alumnos;
import com.mx.CrudAlumnos.servicio.AlumnosImpServ;

@RestController
@RequestMapping("AlumnosWS")
@CrossOrigin
public class AlumnosWS {

	@Autowired
	AlumnosImpServ imp;

	// http://localhost:9000/AlumnosWS/listar
	@GetMapping("listar")
	public List<Alumnos> listar() {
		List<Alumnos> lisalm = imp.listar();
		return lisalm;
	}

	// http://localhost:9000/AlumnosWS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Alumnos alum) {
		imp.guardar(alum);
	}

	// http://localhost:9000/AlumnosWS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Alumnos alm) {
		imp.editar(alm);
	}

	// http://localhost:9000/AlumnosWS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Alumnos alm) {
		imp.eliminar(alm);
	}

	// http://localhost:9000/AlumnosWS/buscar
	@PostMapping("buscar")
	public Alumnos buscar(@RequestBody Alumnos alm) {
		return imp.buscar(alm);
	}

	// http://localhost:9000/AlumnosWS/buscarAlumno
	@PostMapping("buscarAlumno")
	public Alumnos buscarAlumno(@RequestBody Alumnos alm) {
		return imp.buscarAlumno(alm);
	}

	// http://localhost:9000/AlumnosWS/eliminarCorreo
	@PostMapping("eliminarCorreo")
	public void eliminarCorreo(@RequestBody Alumnos alm) {
		imp.eliminarCorreo(alm);
	}

	// http://localhost:9000/AlumnosWS/listarNombre
	@GetMapping("listarNombre")
	public List<Alumnos> listarNombre(@RequestBody Alumnos alm) {
		List<Alumnos> listalmn = imp.listarNombre(alm);
		return listalmn;
	}

}
