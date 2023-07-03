package com.mx.CrudGS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.CrudGS.dominio.Directorio;
import com.mx.CrudGS.servicio.ImpServDirectorio;

@RestController
@RequestMapping("DirectorioWS")
@CrossOrigin
public class DirectorioWS {
	
	@Autowired
	ImpServDirectorio impDir;
	
	// http://localhost:9000/DirectorioWS/listar
	
	@GetMapping("listar")
	public List<Directorio> listar(){
		return impDir.Listar();
	}

}
