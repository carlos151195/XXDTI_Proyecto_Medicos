package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.PaquetesPerfiles;
import com.medicos.springboot.app.models.entity.PaquetesPerfilesQ;

public interface IPaquetesPerfilesDao {

	public List<PaquetesPerfiles> findAll();
	
	public void save (PaquetesPerfiles paquetesPerfiles);
	
	public PaquetesPerfiles findOne (Long id );
	
	public void delete (Long id);
	
	
	public List<PaquetesPerfilesQ> findAllById(Long id);

	List<PaquetesPerfiles> findPaquetesPerfiles(Long id);

	
	
	
	
}
