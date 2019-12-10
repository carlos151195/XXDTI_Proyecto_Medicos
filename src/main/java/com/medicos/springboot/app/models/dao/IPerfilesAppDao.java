package com.medicos.springboot.app.models.dao;

import java.util.List;

import javax.validation.Valid;

import com.medicos.springboot.app.models.entity.Paquetes;
import com.medicos.springboot.app.models.entity.PerfilesApp;

public interface IPerfilesAppDao {
	
	
	public List<PerfilesApp> findAll();
	
	public PerfilesApp findOne(Long Medicos_Perfil_Id); 
	
	public void delete(Long Medicos_Perfil_Id);


	public void findLastPerfilesAppId();
	

	public void save( @Valid PerfilesApp perfilesapp);
	
	




	


}
