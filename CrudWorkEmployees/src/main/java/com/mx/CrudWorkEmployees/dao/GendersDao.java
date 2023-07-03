package com.mx.CrudWorkEmployees.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudWorkEmployees.dominio.Genders;

public interface GendersDao extends CrudRepository<Genders, Integer>{

}
