package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.MedicosPerfilApp;
@Repository
public class MedicosPerfilAppDaoImpl implements IMedicosPerfilAppDao {
	
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	@Override
	public List<MedicosPerfilApp> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From MedicosPerfilApp").getResultList();
	}

	

	@Override
	@Transactional
	public void delete(Long Medicos_Perfil_Id) {
		em.remove(findOne(Medicos_Perfil_Id));
		
	}



	@Override
	public void findLastMedicosPerfilAppId() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public MedicosPerfilApp findOne(Long Medicos_Perfil_Id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void save(MedicosPerfilApp medicosperfilapp) {
		if(medicosperfilapp.getMedicos_Perfil_Id() != null && medicosperfilapp.getMedicos_Perfil_Id() >0) {
			em.merge(medicosperfilapp);
		}else {
			em.persist(medicosperfilapp);	
		}
	}









	

}
