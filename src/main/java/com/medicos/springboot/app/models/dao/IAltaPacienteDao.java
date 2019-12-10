package com.medicos.springboot.app.models.dao;

import java.util.List;

import com.medicos.springboot.app.models.entity.AltaPaciente;
import com.medicos.springboot.app.models.entity.AntecedentesFamiliares;
public interface IAltaPacienteDao {
	
	public List<AltaPaciente> findAll();
	
	public AltaPaciente findOne(Long AltaPacienteId); 
	
	public void delete(Long AltaPacienteId);

	public void save( AltaPaciente altapaciente);

	public void findLastAltaPacienteId();

	void save(AntecedentesFamiliares antecedentesfamiliares);
	


}
