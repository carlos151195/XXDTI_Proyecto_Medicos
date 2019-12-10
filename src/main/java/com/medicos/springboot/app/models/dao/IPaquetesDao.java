package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.Paquetes;

public interface IPaquetesDao {

	public List<Paquetes> findAll();
	public List<Paquetes> findBy();
	
	public void save (Paquetes paquetes);
	
	public Paquetes findOne (Long id );
	
	public void delete (Long id);
	
	public int findLastId();
}
