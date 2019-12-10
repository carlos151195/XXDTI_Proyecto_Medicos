package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.Estudios;

public interface IEstudiosDao {
	
	public List<Estudios> findAll();

	public Estudios findOne(Long id);

}
