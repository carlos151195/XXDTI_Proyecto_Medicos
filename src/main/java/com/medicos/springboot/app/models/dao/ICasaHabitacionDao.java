package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.CasaHabitacion;
public interface ICasaHabitacionDao {
	
	public List<CasaHabitacion> findAll();
	
	public CasaHabitacion findOne(Long CasaHabitacionId); 
	
	public void delete(Long CasaHabitacionId);

	public void save( CasaHabitacion casahabitacion);

	void findLastCasaHabitacionId();
	



}
