package com.mx.CrudWorkEmployees.dominio;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_WORKED_HOURS")
public class Worked {

	// Atributos
	// ID NUMBER PRIMARY KEY NOT NULL,
	// EMPLOYEE_ID NUMBER NOT NULL,
	// WORKED_HOURS NUMBER NOT NULL,
	// WORKED_DATE DATE NOT NULL,

	@Id
	int id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPLOYEE_ID")
	Employees employees;

	int worked_hours;
	Date worked_date;

	public Worked() {
	}

	public Worked(int id) {
		this.id = id;
	}

	public Worked(int id, Employees employees, int worked_hours, Date worked_date) {
		this.id = id;
		this.employees = employees;
		this.worked_hours = worked_hours;
		this.worked_date = worked_date;
	}

	@Override
	public String toString() {
		return "Worked [id=" + id + ", employees=" + employees + ", worked_hours=" + worked_hours + ", worked_date="
				+ worked_date + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public int getWorked_hours() {
		return worked_hours;
	}

	public void setWorked_hours(int worked_hours) {
		this.worked_hours = worked_hours;
	}

	public Date getWorked_date() {
		return worked_date;
	}

	public void setWorked_date(Date worked_date) {
		this.worked_date = worked_date;
	}

}
