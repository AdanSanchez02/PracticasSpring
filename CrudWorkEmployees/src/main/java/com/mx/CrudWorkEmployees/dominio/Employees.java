package com.mx.CrudWorkEmployees.dominio;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class Employees {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// GENDER_ID NUMBER NOT NULL,
	// JOB_ID NUMBER NOT NULL,
	// NAME NVARCHAR2(255) NOT NULL,
	// LAST_NAME NVARCHAR2(255) NOT NULL,
	// BIRTHDATE DATE NOT NULL,

	@Id
	int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "GENDER_ID")
	Genders genders;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "JOB_ID")
	Jobs jobs;

	String name;
	String last_name;
	Date birthdate;

	@OneToMany(mappedBy = "employees", cascade = CascadeType.ALL)
	List<Worked> listaEst = new ArrayList<Worked>();

	public Employees() {
	}

	public Employees(int id) {
		this.id = id;
	}

	public Employees(int id, Genders genders, Jobs jobs, String name, String last_name, Date birthdate,
			List<Worked> listaEst) {
		this.id = id;
		this.genders = genders;
		this.jobs = jobs;
		this.name = name;
		this.last_name = last_name;
		this.birthdate = birthdate;
		this.listaEst = listaEst;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", genders=" + genders + ", jobs=" + jobs + ", name=" + name + ", last_name="
				+ last_name + ", birthdate=" + birthdate + ", listaEst=" + listaEst + "]}n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Genders getGenders() {
		return genders;
	}

	public void setGenders(Genders genders) {
		this.genders = genders;
	}

	public Jobs getJobs() {
		return jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

}
