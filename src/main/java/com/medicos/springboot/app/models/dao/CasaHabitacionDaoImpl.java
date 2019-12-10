package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.CasaHabitacion;

@Repository
public class CasaHabitacionDaoImpl implements ICasaHabitacionDao {
	
	
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<CasaHabitacion> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void delete(Long AntecedentesFamiliaresId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void save(CasaHabitacion casahabitacion) {
		if(casahabitacion.getCasaHabitacionId() != null && casahabitacion.getCasaHabitacionId() >0) {
			em.merge(casahabitacion);
		}else {
			em.persist(casahabitacion);	
		}
	}
	@Override
	public void findLastCasaHabitacionId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CasaHabitacion findOne(Long CasaHabitacionId) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
