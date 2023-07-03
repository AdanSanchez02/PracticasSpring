package com.mx.CrudPaisEstado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudPaisEstado.dominio.Estados;
import com.mx.CrudPaisEstado.servicio.EstadosImpServ;

@Controller
@RequestMapping("api/EstadosCtrl")
public class EstadosCtrl {

	@Autowired
	EstadosImpServ impEst;

	// http://localhost:9000/api/EstadosCtrl/listar
	@GetMapping("listar")
	public String listar(Model model) {
		var lista = impEst.listar();
		model.addAttribute("lista", lista);
		return "indexEstados";
	}

	// Abrir formulario para alta de paises
	// http://localhost:9000/api/PaisCtrl/abrir
	@GetMapping("abrir")
	public String abrir(Estados est) {
		return "altaEstados";
	}

	// Guardar http://localhost:9000/api/EstadosCtrl/guardar
	@PostMapping("guardar")
	public String guardar(Estados est) {
		impEst.guardar(est);
		return "redirect:listar";
	}

	// Buscar
	@GetMapping("buscar/{id}")
	public String buscar(Estados est, Model model) {
		est = impEst.buscar(est);
		model.addAttribute("estado", est);
		return "editarEstado";
	}

	// Editar
	@PostMapping("editar")
	public String editar(Estados est) {
		impEst.editar(est);
		return "redirect:listar";
	}

	// Buscar
	@GetMapping("buscarE/{id}")
	public String buscarE(Estados est, Model model) {
		est = impEst.buscar(est);
		model.addAttribute("estado", est);
		return "eliminarEstado";
	}

	// Eliminar
	@PostMapping("eliminar")
	public String eliminar(Estados est) {
		impEst.eliminar(est);
		return "redirect:listar";
	}
}
