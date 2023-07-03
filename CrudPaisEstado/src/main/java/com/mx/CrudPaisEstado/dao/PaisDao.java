package com.mx.CrudPaisEstado.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudPaisEstado.dominio.Pais;

public interface PaisDao extends CrudRepository<Pais, Integer> {

}
