package com.mx.Usuarios.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.Usuarios.dominio.Rol;

public interface RolDao extends CrudRepository<Rol, Long>{

}
