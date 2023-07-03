package com.mx.Usuarios.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.Usuarios.dominio.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {

}
