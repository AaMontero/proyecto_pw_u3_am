package com.example.demo.uce.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.uce.repository.model.Empleado;

public interface IEmpleadoService {
	   public void crear(Empleado empleado);
	    public void actualizar(Empleado empleado);
	    public void eliminar(Integer id);
	    public Empleado buscarPorId(Integer id);
	    public List<Empleado> buscarPorSalario(BigDecimal salario); 
}