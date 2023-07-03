package com.mx.CrudWorkEmployees.dominio;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOBS")
public class Jobs {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// NAME NVARCHAR2(255) NOT NULL,
	// SALARY NUMBER NOT NULL

	@Id
	int id;
	String name;
	double salary;
	
	@OneToMany(mappedBy = "jobs", cascade = CascadeType.ALL)
	List<Employees> listaEst = new ArrayList<Employees>();

	public Jobs() {
	}

	public Jobs(int id) {
		this.id = id;
	}

	public Jobs(int id, String name, double salary, List<Employees> listaEst) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.listaEst = listaEst;
	}

	@Override
	public String toString() {
		return "Jobs [id=" + id + ", name=" + name + ", salary=" + salary + ", listaEst=" + listaEst + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
