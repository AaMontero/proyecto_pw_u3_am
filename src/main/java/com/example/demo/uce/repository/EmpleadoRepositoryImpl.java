package com.example.demo.uce.repository;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.model.Empleado;
import com.example.demo.uce.repository.model.Hijo;

@Repository
@Transactional
public class EmpleadoRepositoryImpl implements IEmpleadoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
	}

	@Override
	public void actualizar(Empleado empleado) {
		this.entityManager.merge(empleado); 
		
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(buscar(id));
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id); 
	}

	@Override
	public List<Empleado> buscarPorSalario(BigDecimal salario) {
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("SELECT e from Empleado e WHERE e.salario>:salarioDato",Empleado.class);
		myQuery.setParameter("salarioDato", salario); 
		return myQuery.getResultList();
	}
	@Override
	public List<Hijo> buscarHijoEmpleado(Integer id) {
		TypedQuery<Hijo> myQuery = this.entityManager.createQuery("SELECT h from Hijo h WHERE h.empleado.id = :id",Hijo.class);
		myQuery.setParameter("id", id); 
		return myQuery.getResultList();
	}
	@Override
	public List<Empleado> buscarTodos() {
		TypedQuery<Empleado> myQuery = this.entityManager.createQuery("SELECT e from Empleado",Empleado.class);
		return myQuery.getResultList();
	}


}
