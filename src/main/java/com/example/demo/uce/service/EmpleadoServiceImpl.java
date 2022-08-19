package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IEmpleadoRepository;
import com.example.demo.uce.repository.model.Empleado;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoRepository empleadoRepository; 
	
	@Override
	public void crear(Empleado emp) {
		// TODO Auto-generated method stub
		this.empleadoRepository.crear(emp);
		
	}

	@Override
	public void actualizar(Empleado emp) {
		// TODO Auto-generated method stub
		this.empleadoRepository.actualizar(emp);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.empleadoRepository.eliminar(id);
	}

	@Override
	public Empleado buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.empleadoRepository.buscar(id);
	}

}
