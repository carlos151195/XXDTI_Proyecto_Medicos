package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.AntecedentesPersonales;

public interface IAntecedentesPersonalesDao {
	
	public List<AntecedentesPersonales> findAll();
	
	public AntecedentesPersonales findOne(Long AntecedentesPersonalesId); 
	
	public void delete(Long AntecedentesFamId);
	
	void save(AntecedentesPersonales antecedentespersonales);
		
	public void findLastAntecedentesPersonalesId();

}