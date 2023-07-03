package com.mx.CrudZapateria.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.CrudZapateria.dominio.Zapateria;

//JPARepository 
public interface ZapateriaDao extends JpaRepository<Zapateria, Integer>{

	// Lista para buscar por marca
	public List<Zapateria> findByMarca(String marca);
}
