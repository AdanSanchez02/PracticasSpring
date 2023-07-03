package com.mx.Usuarios.servicio;

import java.util.List;

import com.mx.Usuarios.dominio.Rol;
import com.mx.Usuarios.dominio.Usuario;

public interface UsuarioServicio {
	
	public void guardarUsuario(Usuario usuario, Rol rol);

	public List<Usuario> listarUsuario();
}
