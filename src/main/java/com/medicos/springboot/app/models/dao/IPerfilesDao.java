package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.Perfiles;



public interface IPerfilesDao {
	
	public List<Perfiles> findAll();
	public List<Perfiles> findBy();
	
	
	public Perfiles findOne (Long id );
	
	public void delete (Long id);
	void save(Perfiles perfiles);
	
	
	

}
