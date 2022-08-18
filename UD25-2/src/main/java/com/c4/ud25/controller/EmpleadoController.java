package com.c4.ud25.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Empleado;
import com.c4.ud25.service.EmpleadoServicesImpl;
@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServicesImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleado(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {
		return empleadoServiceImpl.guardarEmpleado(empleado);
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleado empleadoXId(@PathVariable(name="dni") String dni) {
		
		Empleado Articulo = new Empleado();
		
		Articulo=empleadoServiceImpl.empleadoXID(dni);
		
		return Articulo;
	}
	
	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name="dni") String dni, @RequestBody Empleado empleado) {
		
		Empleado empleadoSel = new Empleado();
		Empleado empleadosAct = new Empleado();
		
		empleadoSel=empleadoServiceImpl.empleadoXID(dni);
		
		empleadoSel.setNombre(empleado.getNombre());
		empleadoSel.setApellido(empleado.getApellido());
		empleadoSel.setDepartamento(empleado.getDepartamento());
		
		empleadosAct= empleadoServiceImpl.actualizarEmpleado(empleadoSel);
		
		return empleadosAct;
		
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name="dni")String dni) {
		empleadoServiceImpl.eliminarEmpleado(dni);
	}
}
