package com.mx.CrudExcursiones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.CrudExcursiones.dominio.Transportes;
import com.mx.CrudExcursiones.servicios.ImpServTransportes;

@Controller
@RequestMapping("api/TransportesCtrl")
public class TransportesCtrl {

	@Autowired
	ImpServTransportes impTransporte;

	// http://localhost:9000/api/TransportesCtrl/listar
	@GetMapping("listar")
	public String listar(Model model) {
		var lista = impTransporte.listar();
		model.addAttribute("lista", lista);
		return "indexTransporte";
	}
	
	// http://localhost:9000/api/TransportesCtrl/guardar
	@PostMapping("guardar")
	public String guardar(Transportes tr) {
		impTransporte.guardar(tr);
		return "redirect:listar";
	}
	
	@GetMapping("buscar/{id}")
	public String buscar(Transportes tr, Model model) {
		tr = impTransporte.buscar(tr);
		model.addAttribute("tr", tr);
		return "editarTransporte";
	}
	
	@PostMapping("editar")
	public String editar(Transportes tr) {
		impTransporte.editar(tr);
		return "redirect:listar";
	}
	
	@GetMapping("buscarE/{id}")
	public String buscarE(Transportes tr, Model model) {
		tr = impTransporte.buscar(tr);
		model.addAttribute("tr", tr);
		return "eliminarTransporte";
	}

	@PostMapping("eliminar")
	public String eliminar(Transportes tr) {
		impTransporte.eliminar(tr);
		return "redirect:listar";
	}
	
}
