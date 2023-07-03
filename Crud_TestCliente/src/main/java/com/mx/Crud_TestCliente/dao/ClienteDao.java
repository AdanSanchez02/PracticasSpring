package com.mx.Crud_TestCliente.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.Crud_TestCliente.dominio.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Integer>{

}
