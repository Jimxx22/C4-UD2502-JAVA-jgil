package com.c4.ud25.service;

import java.util.List;

import com.c4.ud25.dto.Empleado;

public interface IEmpleadoService {
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un Empleado CREATE
	
	public Empleado empleadoXID(String dni); //Leer datos de un Empleado READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del Empleado UPDATE
	
	public void eliminarEmpleado(String dni);// Elimina el Empleado DELETE
}
