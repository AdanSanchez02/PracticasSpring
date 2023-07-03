package com.mx.CrudTrabajador.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudTrabajador.dominio.Trabajador;

public interface TrabajadorDao extends CrudRepository<Trabajador, Integer>{

}
