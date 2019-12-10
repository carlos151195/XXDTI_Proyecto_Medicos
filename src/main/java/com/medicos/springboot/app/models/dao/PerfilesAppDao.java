package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.Paquetes;
import com.medicos.springboot.app.models.entity.PerfilesApp;


@Repository
public class PerfilesAppDao implements IPerfilesAppDao {
	
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	@Override
	public List<PerfilesApp> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From PerfilesApp").getResultList();
	}

	

	@Override
	@Transactional
	public void delete(Long Medicos_Perfil_Id) {
		em.remove(findOne(Medicos_Perfil_Id));
		
	}



	@Override
	public void findLastPerfilesAppId() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public PerfilesApp findOne(Long Medicos_Perfil_Id) {
		// TODO Auto-generated method stub
		return em.find(PerfilesApp.class, Medicos_Perfil_Id);
	}



	@Override
	@Transactional
	public void save(PerfilesApp perfilesapp) {
		if(perfilesapp.getMedicos_Perfil_Id() != null && perfilesapp.getMedicos_Perfil_Id() >0) {
			em.merge(perfilesapp);
		}else {
			em.persist(perfilesapp);	
		}
	}



	





	

	

}
