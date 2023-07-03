package com.mx.CrudGS.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.CrudGS.dao.DirectorioDao;
import com.mx.CrudGS.dominio.Directorio;

@Repository
@Service
public class ImpServDirectorio implements ServDirectorio{

	@Autowired
	DirectorioDao directorio;
	
	@Autowired
	DataSource dt;
	
	@Transactional
	@Override
	public List<Directorio> listar() {
		// TODO Auto-generated method stub
		return (List<Directorio>) directorio.findAll();
	}
	
	public List<Directorio> Listar(){
		List<Directorio> listDir = new ArrayList<Directorio>();
		try {
			Connection con = dt.getConnection();
			PreparedStatement s = con.prepareStatement("SELECT * FROM TESTGS");
			ResultSet rs = s.executeQuery();
			while(rs.next()) {
				listDir.add(new Directorio(rs.getInt("ID"), rs.getString("ITEM"), rs.getInt("PADRE"), rs.getInt("ACCESO"), rs.getString("RUTA") ));
			}
			
		} catch (Exception e) {
			System.out.println("ERROR EN LA CONEXION");
		}
		return listDir;
	}

}
