package com.mx.CrudPaisEstado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudPaisEstado.dominio.Pais;
import com.mx.CrudPaisEstado.servicio.PaisImpServ;

@Controller
@RequestMapping("api/PaisCtrl")
public class PaisCtrl {

	// Inyeccion de dependencias
	@Autowired
	PaisImpServ paisImp;

	// http://localhost:9000/api/PaisCtrl/listar
	@GetMapping("listar")
	public String listar(Model model) {
		var lista = paisImp.listar();
		model.addAttribute("lista", lista);
		return "indexPais";
	}

	// Abrir formulario para alta de paises
	// http://localhost:9000/api/PaisCtrl/abrir
	@GetMapping("abrir")
	public String abrir(Pais pais) {
		return "altapaises";
	}

	// http://localhost:9000/api/PaisCtrl/guardar
	// Guardar
	@PostMapping("guardar")
	public String guardar(Pais pais) {
		paisImp.guardar(pais);
		return "redirect:listar";
	}

	// Para editar primero hay que buscar

	// http://localhost:9000/api/PaisCtrl/buscar
	// Buscar
	@GetMapping("buscar/{id}")
	public String buscar(Pais pais, Model model) {
		pais = paisImp.buscar(pais);
		model.addAttribute("pais", pais);
		return "editarPais";
	}

	// localhost:9000/api/PaisCtrl/editar
	// Editar
	@PostMapping("editar")
	public String editar(Pais pais) {
		paisImp.editar(pais);
		return "redirect:listar";
	}

	// Para eliminar hay que buscar
	// http://localhost:9000/api/PaisCtrl/buscarE

	// BuscarE
	@GetMapping("buscarE/{id}")
	public String buscarE(Pais pais, Model model) {
		pais = paisImp.buscar(pais);
		model.addAttribute("pais", pais);
		return "eliminarPais";
	}

	// Eliminar
	@PostMapping("eliminar")
	public String eliminar(Pais pais) {
		paisImp.eliminar(pais);
		return "redirect:listar";
	}

}
