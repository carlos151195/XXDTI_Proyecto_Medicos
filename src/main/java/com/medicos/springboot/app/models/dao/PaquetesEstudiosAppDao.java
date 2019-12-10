package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.EstudiosU;
import com.medicos.springboot.app.models.entity.PaquetesEstudiosApp;
import com.medicos.springboot.app.models.entity.PaquetesEstudiosQ;

@Repository
public class PaquetesEstudiosAppDao implements IPaquetesEstudiosAppDao{
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<PaquetesEstudiosApp> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery ("from PaquetesEstudiosApp").getResultList();
	}
	
	@Override
	@Transactional
	public void save(PaquetesEstudiosApp paquetesEstudiosApp) {
		// TODO Auto-generated method stub
		if(paquetesEstudiosApp.getPaqueteId() !=null &&  paquetesEstudiosApp.getPeId()>0) {
			em.merge(paquetesEstudiosApp);
			
		}
		else {
			em.persist(paquetesEstudiosApp);
		}
	}

	@Override
	@Transactional(readOnly= true)
	public PaquetesEstudiosApp findOne(Long id) {
		// TODO Auto-generated method stub
		return em.find(PaquetesEstudiosApp.class,id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		em.remove(findOne(id));
	}

	@Override
	public List<Object> findAllById(Long id) {
		// TODO Auto-generated method stub
		Query query =em.createNativeQuery("SELECT\r\n" + 
				"pe.pe_id,\r\n" + 
				"pe.paquete_id,\r\n" + 
				"es.estudio_nombre\r\n" + 
				"FROM\r\n" + 
				"estudios AS es ,\r\n" + 
				"paquetes_estudios AS pe\r\n" + 
				"WHERE\r\n" + 
				"es.estudio_id = pe.estudio_id and pe.paquete_id="+id,PaquetesEstudiosQ.class);
		@SuppressWarnings("unchecked")
		List<Object> res= query.getResultList();

		return res;
	}
	@SuppressWarnings("unchecked")
	@Override
	
	public List<EstudiosU> findEstudios(Long id) {
		// TODO Auto-generated method stub
		return em.createQuery("From EstudiosU").getResultList();
	}

	

	
}
