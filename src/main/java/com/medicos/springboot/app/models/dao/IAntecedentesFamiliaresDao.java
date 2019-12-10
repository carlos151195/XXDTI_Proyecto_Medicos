package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.AntecedentesFamiliares;

public interface IAntecedentesFamiliaresDao {
	
	public List<AntecedentesFamiliares> findAll();
	
	public AntecedentesFamiliares findOne(Long AntecedentesFamId); 
	
	public void delete(Long AntecedentesFamId);
	
	void save(AntecedentesFamiliares antecedentesfamiliares);
		
	public void findLastAntecedentesFamiiaresId();

	
	public void findLastAntecedentesFamiliaresId();

}