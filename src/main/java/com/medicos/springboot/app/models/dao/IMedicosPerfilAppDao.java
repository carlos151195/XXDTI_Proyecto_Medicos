package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.MedicosPerfilApp;
public interface IMedicosPerfilAppDao {
	
	public List<MedicosPerfilApp> findAll();
	
	public MedicosPerfilApp findOne(Long Medicos_Perfil_Id); 
	
	public void delete(Long Medicos_Perfil_Id);


	public void findLastMedicosPerfilAppId();

	void save(MedicosPerfilApp medicosperfilapp);



	
}
