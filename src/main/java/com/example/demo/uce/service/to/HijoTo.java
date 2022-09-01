package com.example.demo.uce.service.to;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class HijoTo extends RepresentationModel<HijoTo> implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7957361076473095099L;
	private Integer id; 
	private String nombre; 
	private String apellido; 
	private String genero;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
