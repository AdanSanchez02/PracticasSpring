package com.mx.CrudWorkEmployees.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.CrudWorkEmployees.dominio.Employees;

public interface EmployeesDao extends CrudRepository<Employees, Integer>{

}
