package com.example.demo.uce.repository;

import java.util.List;

import com.example.demo.uce.repository.model.Hijo;

public interface IHijoRepository {
	public void crear(Hijo hijo) ; 
	public void actualizar (Hijo hijo); 
	public void eliminar(Integer id); 
	public Hijo buscar(Integer id);
	public List<Hijo> buscarHijosEmpleado(Integer id);
}
