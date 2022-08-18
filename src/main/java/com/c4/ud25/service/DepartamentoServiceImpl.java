package com.c4.ud25.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c4.ud25.dao.IDepartamentoDAO;
import com.c4.ud25.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{

	@Autowired
	IDepartamentoDAO iDepartamentosDAO;
	
	@Override
	public List<Departamento> listarDepartamentos() {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public Departamento departamentoXID(Long id) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.findById(id).get();
	}

	@Override
	public Departamento actualizarDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		return iDepartamentosDAO.save(departamento);
	}

	@Override
	public void eliminarDepartamento(Long id) {
		// TODO Auto-generated method stub
		iDepartamentosDAO.deleteById(id);
	}

}
