package com.mx.CrudExcursiones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudExcursiones.dominio.Viajes;
import com.mx.CrudExcursiones.servicios.ImpServViajes;

@Controller
@RequestMapping("api/ViajesCtrl")
public class ViajesCtrl {

	@Autowired
	ImpServViajes impViaje;

	// http://localhost:9000/api/ViajesCtrl/listar
	@GetMapping("listar")
	public String listar(Model model) {
		var lista = impViaje.listar();
		model.addAttribute("lista", lista);
		return "indexViajes";
	}
	
	@GetMapping("abrir")
	public String abrir(Viajes vj) {
		return "altaViajes";
	}
	
	
	@PostMapping("guardar")
	public String guardar(Viajes vj) {
		impViaje.guardar(vj);
		return "redirect:listar";
	}
	
	@GetMapping("buscar/{id}")
	public String buscar(Viajes vj, Model model) {
		vj = impViaje.buscar(vj);
		model.addAttribute("vj", vj);
		return "editarViajes";
	}
	
	@PostMapping("editar")
	public String editar(Viajes vj) {
		impViaje.editar(vj);
		return "redirect:listar";
	}
	
	@GetMapping("buscarE/{id}")
	public String buscarE(Viajes vj, Model model) {
		vj = impViaje.buscar(vj);
		model.addAttribute("vj", vj);
		return "eliminarViajes";
	}

	@PostMapping("eliminar")
	public String eliminar(Viajes vj) {
		impViaje.eliminar(vj);
		return "redirect:listar";
	}
	
}
