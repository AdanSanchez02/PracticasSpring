package com.mx.Usuarios.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.Usuarios.dominio.Asignacion;
import com.mx.Usuarios.dominio.Rol;
import com.mx.Usuarios.dominio.Usuario;

public interface AsignacionDao extends CrudRepository<Asignacion, Long>{



}
