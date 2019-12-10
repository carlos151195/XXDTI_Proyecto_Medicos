package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.medicos.springboot.app.models.entity.AntecedentesPersonales;

@Repository
public class AntecedentesPersonalesDaoImpl implements IAntecedentesPersonalesDao {
	
	
	@PersistenceContext
	private EntityManager em;
	@Override
	public List<AntecedentesPersonales> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AntecedentesPersonales findOne(Long AntecedentesFamId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long AntecedentesFamiliaresId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void save(AntecedentesPersonales antecedentespersonales) {
		if(antecedentespersonales.getAntecedentesPersonalesId() != null && antecedentespersonales.getAntecedentesPersonalesId() >0) {
			em.merge(antecedentespersonales);
		}else {
			em.persist(antecedentespersonales);	
		}
	}

	
	@Override
	public void findLastAntecedentesPersonalesId() {
		// TODO Auto-generated method stub
		
	}
	
}
