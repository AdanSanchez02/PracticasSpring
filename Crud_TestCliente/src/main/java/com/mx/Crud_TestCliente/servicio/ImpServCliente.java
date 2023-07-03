package com.mx.Crud_TestCliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.Crud_TestCliente.dao.ClienteDao;
import com.mx.Crud_TestCliente.dao.DireccionDao;
import com.mx.Crud_TestCliente.dominio.Cliente;
import com.mx.Crud_TestCliente.dominio.Direccion;

@Service
public class ImpServCliente implements ServCliente{

	@Autowired
	ClienteDao cliDao;
	
	@Autowired
	DireccionDao dirDao;
	
	@Override
	public String guardar(Cliente cl) {
		String text = null;
		int aux1=0, aux2 = 1;
		
		for(Cliente c: cliDao.findAll()) {
			if(c.getId() == cl.getId()) {
				aux1 =1;
			}
		}
		
		for(Direccion d: dirDao.findAll()) {
			if(d.getId() == cl.getDireccion().getId()) {
				aux2 = 0;
			}
		}
		
		if(aux1 == 1) {
			text = "ESE ID DE CLIENTE YA EXISTE";
		}else if(aux2 == 1) {
			text = "ESA DIRRECCION NO EXISTE";
		}else {
			cliDao.save(cl);
			text = "ALTA DE CLIENTE CORRECTAMENTE";
		}
		
		return text;
	}

	@Override
	public void editar(Cliente cl) {
		// TODO Auto-generated method stub
		cliDao.save(cl);
	}

	@Override
	public void eliminar(Cliente cl) {
		// TODO Auto-generated method stub
		cliDao.delete(cl);
	}

	@Override
	public Cliente buscar(Cliente cl) {
		// TODO Auto-generated method stub
		return cliDao.findById(cl.getId()).orElse(null);
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return (List<Cliente>) cliDao.findAll();
	}
	
	public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Long.parseLong(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

}
