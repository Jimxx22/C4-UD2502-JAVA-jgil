package com.c4.ud25.controller;

import java.io.Console;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.MBeanServerNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud25.dto.Departamento;
import com.c4.ud25.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentosServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos(){
		return departamentosServiceImpl.listarDepartamentos();
	}
	
	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		return departamentosServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento departamentoXId(@PathVariable(name="id") Long id) {
		
		Departamento fabricante = new Departamento();
		
		fabricante=departamentosServiceImpl.departamentoXID(id);
		
		return fabricante;
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamento actualizarDepartamento(@PathVariable(name="id") Long id, @RequestBody Departamento departamento) {
		
		Departamento departamentosSel = new Departamento();
		Departamento departamentosAct = new Departamento();
		
		departamentosSel=departamentosServiceImpl.departamentoXID(id);
		
		departamentosSel.setNombre(departamento.getNombre());
		departamentosSel.setPresupuesto(departamento.getPresupuesto());
		
		departamentosAct= departamentosServiceImpl.actualizarDepartamento(departamentosSel);
		
		return departamentosAct;
		
	}
	
	@DeleteMapping("/departamentos/{id}")
	public String eliminarDepartamento(@PathVariable(name="id")Long id) {
				
		try {
			departamentosServiceImpl.eliminarDepartamento(id);
			return "Departamento borrado";
		}catch (Exception e) {
			return "ERROR: no puedes eliminar un departamento sin haver eliminado sus empleados antes.";
		}
		
	}
	
}
