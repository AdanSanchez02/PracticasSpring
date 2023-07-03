package com.mx.Usuarios.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.Usuarios.dao.AsignacionDao;
import com.mx.Usuarios.dao.RolDao;
import com.mx.Usuarios.dao.UsuarioDao;
import com.mx.Usuarios.dominio.Asignacion;
import com.mx.Usuarios.dominio.Rol;
import com.mx.Usuarios.dominio.Usuario;
import com.mx.Usuarios.servicio.UsuarioServicio;

@Service
public class UsuarioServicioImp implements UsuarioServicio {

	@Autowired
	UsuarioDao usuarioDao;

	@Autowired
	RolDao rolDao;
	
	@Autowired 
	AsignacionDao asignacionDao;
	
	
	@Transactional
	@Override
	public void guardarUsuario(Usuario usuario, Rol rol) {
		int usuarioExistente = 0, rolExistencia = 0, asig = 1;
		Asignacion a = null;
		
		// Verificamos que el Username no exista
		for (Usuario u : usuarioDao.findAll()) {
			if (u.getUsername() == usuario.getUsername()) {
				System.out.println("El usuario ya existe");
				usuarioExistente = 1;
				break;
			}
		}

		//// Verificamos que el ROL exista
		for (Rol r : rolDao.findAll()) {
			if (rol.getNombre() == r.getNombre()) {
				rolExistencia = 1;
				break;
			}
		}
		
		// Si no existe el username guardamo e igual comparamos si ya esta su rol registrado
		if(usuarioExistente == 0) {
			usuarioDao.save(usuario);
			if(rolExistencia == 0) {
				rolDao.save(rol);
			}
			asig = 0;
		}
		
		// Una vez guardados asiganos a la tabla de asignacion
		if(asig == 0) {
			Usuario user = null;
			Rol rl = null;
			for (Usuario u : usuarioDao.findAll()) {
				if (u.getUsername() == usuario.getUsername()) {
					System.out.println("USUARIO ENCONTRADO");
					user = u;
					for (Rol r : rolDao.findAll()) {
						if (rol.getNombre() == r.getNombre()) {
							rl = r;
							break;
						}
					}
					break;
				}
			}
			// ya encontr y ahora guardamo
			a = new Asignacion( user, rl);
			asignacionDao.save(a);
		}
	}

	@Transactional(readOnly = true)
	@Override
	public List<Usuario> listarUsuario() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioDao.findAll();
	}

}
