package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.model.Hijo;
@Repository
@Transactional
public class HijoRepositoryImpl implements IHijoRepository {
		@PersistenceContext
		private EntityManager em; 
	
	
	public List<Hijo> buscarHijoEmpleado(Integer id) {
		TypedQuery<Hijo> myQuery = this.em.createQuery("SELECT h from Hijo h WHERE h.empleado.id = :id",Hijo.class);
		myQuery.setParameter("id", id); 
		return myQuery.getResultList();
	}


	@Override
	public void crear(Hijo hijo) {
		// TODO Auto-generated method stub
		this.em.persist(hijo);
	}	


	@Override
	public void actualizar(Hijo hijo) {
		// TODO Auto-generated method stub
		this.em.merge(hijo);
	}


	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.em.remove(buscar(id) );
	}


	@Override
	public Hijo buscar(Integer  id) {
		// TODO Auto-generated method stub
		return this.em.find(Hijo.class, id);
	}



	@Override
	public List<Hijo> buscarHijosEmpleado(Integer id) {
		// TODO Auto-generated method stub
		TypedQuery<Hijo> myQuery = this.em.createQuery("SELECT h from Hijo h WHERE h.empleado.id = :id", Hijo.class); 
		return myQuery.getResultList(); 
	
	}
}
