package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.IEmpleadoDAO;
import com.c4.ud25.dto.Empleado;

@Service
public class EmpleadoServicesImpl implements IEmpleadoService{

	@Autowired
	IEmpleadoDAO iEmpleadosDAO;
	
	@Override
	public List<Empleado> listarEmpleados() {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public Empleado empleadoXID(String dni) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.findById(dni).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpleadosDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		// TODO Auto-generated method stub
		iEmpleadosDAO.deleteById(dni);
	}

}
