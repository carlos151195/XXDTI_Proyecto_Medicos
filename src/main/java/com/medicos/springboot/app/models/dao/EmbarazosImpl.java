package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.Embarazos;

@Repository
public class EmbarazosImpl implements IEmbarazosDao {
	
	
	
	@PersistenceContext
	private EntityManager em;
	public List<Embarazos> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void delete(Long AntecedentesFamiliaresId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void save(Embarazos embarazos) {
		if(embarazos.getEmbarazosId() != null && embarazos.getEmbarazosId() >0) {
			em.merge(embarazos);
		}else {
			em.persist(embarazos);	
		}
	}
	@Override
	public void findLastEmbarazosId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Embarazos findOne(Long EmbarazosId) {
		// TODO Auto-generated method stub
		return null;
	}









	

	
}
