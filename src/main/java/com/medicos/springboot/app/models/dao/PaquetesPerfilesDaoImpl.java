package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.PaquetesPerfiles;
import com.medicos.springboot.app.models.entity.PaquetesPerfilesQ;


@Repository
public class PaquetesPerfilesDaoImpl implements IPaquetesPerfilesDao{

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	@Transactional(readOnly=true)
	public List<PaquetesPerfiles> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery ("from PaquetesPerfiles").getResultList();
	}

	@Override
	@Transactional
	public void save(PaquetesPerfiles paquetesPerfiles) {
		// TODO Auto-generated method stub
		if(paquetesPerfiles.getPaPeId() !=null &&  paquetesPerfiles.getPaPeId()>0) {
			em.merge(paquetesPerfiles);
			
		}
		else {
			em.persist(paquetesPerfiles);
		}
	}

	@Override
	@Transactional(readOnly= true)
	public PaquetesPerfiles findOne(Long id) {
		// TODO Auto-generated method stub
		return em.find(PaquetesPerfiles.class,id);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		em.remove(findOne(id));
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<PaquetesPerfilesQ> findAllById(Long id) {
		// TODO Auto-generated method stub
		return em.createNativeQuery("SELECT\r\n" + 
				"p.perfil_nombre,\r\n" + 
				"pp.pape_id,\r\n" + 
				"pp.paquete_id\r\n" + 
				"FROM\r\n" + 
				"paquetes_perfiles as pp,\r\n" + 
				"perfiles as p\r\n" + 
				"WHERE\r\n" + 
				"pp.perfil_id = p.perfil_id \r\n" + 
				"and pp.paquete_id="+id,PaquetesPerfilesQ.class).getResultList();
	}

	@Override
	public List<PaquetesPerfiles> findPaquetesPerfiles(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
}
