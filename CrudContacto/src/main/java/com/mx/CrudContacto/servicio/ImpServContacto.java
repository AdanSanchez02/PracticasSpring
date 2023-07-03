package com.mx.CrudContacto.servicio;

import java.util.*;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudContacto.controller.EmailService;
import com.mx.CrudContacto.dao.ContactoDao;
import com.mx.CrudContacto.dominio.Contacto;

@Service
public class ImpServContacto implements ServContacto{

	@Autowired
	ContactoDao contacto;
	
	@Autowired
	EmailService email;
	
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy/mm/dd");
	
	@Transactional
	@Override
	public void guardar(Contacto c) {
		contacto.save(c);
		String fecha = sdf.format(c.getFecha());
		email.sendEmail(c.getCorreo(),fecha,c.getComentario());
	}

	@Transactional
	@Override
	public void editar(Contacto c) {
		contacto.save(c);
	}

	@Transactional
	@Override
	public void eliminar(Contacto c) {
		contacto.delete(c);
	}

	@Transactional(readOnly = true)
	@Override
	public Contacto buscar(Contacto c) {
		return contacto.findById(c.getId()).orElse(null);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Contacto> listar() {
		return (List<Contacto>) contacto.findAll();
	}

}
