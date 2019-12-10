package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.Estudios;

@Repository

public class EstudiosDaoImpl  implements IEstudiosDao {
	
	
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	@Override
	public List<Estudios> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From Estudios").getResultList();
	}
	@Override
	public Estudios findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
