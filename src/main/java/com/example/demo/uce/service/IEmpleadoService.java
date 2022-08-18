package com.example.demo.uce.service;

import com.example.demo.uce.repository.model.Empleado;

public interface IEmpleadoService {
	public void crear(Empleado emp);
	public void actualizar(Empleado emp); 
	public void elimiar(Integer id); 
	public Empleado buscarPorId(Integer id); 
}
