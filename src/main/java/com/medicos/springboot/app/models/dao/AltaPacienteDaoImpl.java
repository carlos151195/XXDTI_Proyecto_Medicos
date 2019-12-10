package com.medicos.springboot.app.models.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medicos.springboot.app.models.entity.AltaPaciente;
import com.medicos.springboot.app.models.entity.AntecedentesFamiliares;
@Repository
public class AltaPacienteDaoImpl implements IAltaPacienteDao {
	
	
	@PersistenceContext
	private EntityManager em;
	@Transactional(readOnly =true)
	@SuppressWarnings("unchecked")
	@Override
	public List<AltaPaciente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("From AltaPaciente").getResultList();
	}

	@Override
	public AltaPaciente findOne(Long CatalogoId) {
		// TODO Auto-generated method stub
		return em.find(AltaPaciente.class,CatalogoId );
	}

	@Override
	@Transactional
	public void delete(Long AltaPacienteId) {
		em.remove(findOne(AltaPacienteId));
		
	}


	@Override
	@Transactional
	public void save(AltaPaciente altapaciente) {
		if(altapaciente.getAltaPacienteId() != null && altapaciente.getAltaPacienteId() >0) {
			em.merge(altapaciente);
		}else {
			em.persist(altapaciente);	
		}
	}

	@Override
	public void findLastAltaPacienteId() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(AntecedentesFamiliares antecedentesfamiliares) {
		// TODO Auto-generated method stub
		
	}


	

}
