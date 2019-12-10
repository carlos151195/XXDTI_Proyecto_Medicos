package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.AntecedentesFamiliares;

@Repository
public class AntecedentesFamiliaresDaoImpl implements IAntecedentesFamiliaresDao {
	
	
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<AntecedentesFamiliares> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AntecedentesFamiliares findOne(Long AntecedentesFamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long AntecedentesFamiliaresId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void save(AntecedentesFamiliares antecedentesfamiliares) {
		if(antecedentesfamiliares.getAntecedentesFamId() != null && antecedentesfamiliares.getAntecedentesFamId() >0) {
			em.merge(antecedentesfamiliares);
		}else {
			em.persist(antecedentesfamiliares);	
		}
	}
	@Override
	public void findLastAntecedentesFamiiaresId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findLastAntecedentesFamiliaresId() {
		// TODO Auto-generated method stub
		
	}
	
}
