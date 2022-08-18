package com.c4.ud25.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Empleados")
public class Empleado {

	@Id
	@Column(name="dni")
	private String dni;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@ManyToOne
    @JoinColumn(name="codigoDepartamento")
	private Departamento departamento;
	
	public Empleado() {
		super();
	}

	public Empleado(String dni,String nombre, String apellido, Departamento departamento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String id) {
		this.dni = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", departamento="
				+ departamento + "]";
	}
		
}
