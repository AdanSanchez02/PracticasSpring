package com.mx.CrudWorkEmployees.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudWorkEmployees.dominio.Jobs;

public interface JobsDao extends CrudRepository<Jobs, Integer> {

}
