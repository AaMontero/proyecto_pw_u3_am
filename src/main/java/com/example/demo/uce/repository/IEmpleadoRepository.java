package com.example.demo.uce.repository;

import com.example.demo.uce.repository.model.Empleado;

public interface IEmpleadoRepository {
	public void crear(Empleado empleado) ; 
	public void actualizar (Empleado empleado); 
	public void elimiar(Integer id); 
	public Empleado buscar(Integer id); 
}
