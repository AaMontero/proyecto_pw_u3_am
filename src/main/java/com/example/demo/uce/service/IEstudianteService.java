package com.example.demo.uce.service;

import java.util.List;

import com.example.demo.uce.repository.model.Estudiante;

public interface IEstudianteService {

	public void crear(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(Integer id);
	public Estudiante buscarPorId(Integer id);
	public List<Estudiante> buscarPorSemestre(String semestre); 

}