package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.EstudiosU;
import com.medicos.springboot.app.models.entity.PaquetesEstudiosApp;

public interface IPaquetesEstudiosAppDao {
public List<PaquetesEstudiosApp> findAll();
	
	
	public PaquetesEstudiosApp findOne (Long id );
	
	public void delete (Long id);
	
	public List<Object> findAllById(Long id);

	public List<EstudiosU> findEstudios(Long id);

	void save(PaquetesEstudiosApp paquetesEstudiosApp);


}
