package com.mx.CrudEmpleados.servicio;

import java.util.List;

import com.mx.CrudEmpleados.dominio.Empleados;

public interface EmpleadoServ {

	public void guardar(Empleados empleado);

	public void editar(Empleados empleado);

	public void eliminar(Empleados empleado);

	public Empleados buscar(Empleados empleado);

	public List<Empleados> listar();
	
	public Empleados buscarname(Empleados empleado);
	
	public List<Empleados> listarname(Empleados name);

}
