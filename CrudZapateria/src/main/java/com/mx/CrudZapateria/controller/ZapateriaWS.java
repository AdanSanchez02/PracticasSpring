package com.mx.CrudZapateria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudZapateria.dominio.Zapateria;
import com.mx.CrudZapateria.servicio.ZapateriaImpServ;

@RestController
@RequestMapping("ZapateriaWS")
@CrossOrigin
public class ZapateriaWS {

	@Autowired
	ZapateriaImpServ zap;

	// http://localhost:9000/ZapateriaWS/listar
	@GetMapping("listar")
	public List<Zapateria> listar() {
		List<Zapateria> listZap = zap.listar();
		return listZap;
	}

	// http://localhost:9000/ZapateriaWS/listarMarca
	@GetMapping("listarMarca")
	public List<Zapateria> listarMarca(@RequestBody Zapateria zp) {
		List<Zapateria> listZap = zap.listarMarca(zp);
		return listZap;
	}

	// http://localhost:9000/ZapateriaWS/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Zapateria zp) {
		zap.guardar(zp);
	}

	// http://localhost:9000/ZapateriaWS/editar
	@PostMapping("editar")
	public void editar(@RequestBody Zapateria zp) {
		zap.editar(zp);
	}

	// http://localhost:9000/ZapateriaWS/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Zapateria zp) {
		zap.eliminar(zp);
	}

	// http://localhost:9000/ZapateriaWS/buscar
	@PostMapping("buscar")
	public Zapateria buscar(@RequestBody Zapateria zp) {
		return zap.buscar(zp);
	}

	// http://localhost:9000/ZapateriaWS/buscarModelo
	@PostMapping("buscarModelo")
	public Zapateria buscarModelo(@RequestBody Zapateria zp) {
		return zap.buscarModelo(zp);
	}

	// http://localhost:9000/ZapateriaWS/listarModelo
	@GetMapping("listarModelo")
	public List<Zapateria> listarModelo(@RequestBody Zapateria zp) {
		List<Zapateria> listZap = zap.listMM(zp);
		return listZap;
	}

	// http://localhost:9000/ZapateriaWS/guardarNC
	@PostMapping("guardarNC")
	public void guardarNC(@RequestBody Zapateria zp) {
		Zapateria zz = new Zapateria();
		zz = zap.guardarNC(zp);
		zap.guardar(zz);
	}

}
