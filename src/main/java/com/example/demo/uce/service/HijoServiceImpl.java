package com.example.demo.uce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IHijoRepository;
import com.example.demo.uce.repository.model.Hijo;
import com.example.demo.uce.service.to.HijoTo;
@Service
public class HijoServiceImpl implements IHijoService {

	@Autowired
	private IHijoRepository hijoRepository; 
	
	@Override
	public List<HijoTo> buscarHijosEmpleado(Integer id) {
		// TODO Auto-generated method stub
		List<Hijo> lista = this.hijoRepository.buscarHijosEmpleado(id); 
		return lista.stream().map(hijo -> this.convertir(hijo)).collect(Collectors.toList());
	}
	private HijoTo convertir(Hijo hijo) {
		HijoTo aux = new HijoTo();
		aux.setId(hijo.getId());
		aux.setNombre(hijo.getNombre());
		aux.setApellido(hijo.getApellido());
		return aux; 
	}
}
