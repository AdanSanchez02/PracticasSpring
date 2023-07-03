package com.mx.CrudContacto.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudContacto.dominio.Contacto;

public interface ContactoDao extends CrudRepository<Contacto, Integer>{

}
