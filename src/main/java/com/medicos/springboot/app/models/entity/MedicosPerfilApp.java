package com.medicos.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicos_perfiles_app")
public class MedicosPerfilApp implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="medicos_perfiles_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Medicos_Perfil_Id;
	
	
	@Column(name="medicos_id")
	private String Medico_Id;
	
	@Column(name="nombre_perfil")
	private String Nombre_Perfil;
	
	@Column(name="descripcion")
	private String Descripcion;
	
	@Column(name="costo")
	private String Costo;
	
	@Column(name="indicaciones_paci")
	private String Indicaciones_Paci;
	
	@Column(name="indicaciones_pers")
	private String Indicaciones_Pers;

	
	
	public String getIndicaciones_Paci() {
		return Indicaciones_Paci;
	}

	public void setIndicaciones_Paci(String indicaciones_Paci) {
		Indicaciones_Paci = indicaciones_Paci;
	}
	
	

	public String getIndicaciones_Pers() {
		return Indicaciones_Pers;
	}

	public void setIndicaciones_Pers(String indicaciones_Pers) {
		Indicaciones_Pers = indicaciones_Pers;
	}
	
	
	
	
	public Long getMedicos_Perfil_Id() {
		return Medicos_Perfil_Id;
	}

	public void setMedicos_Perfil_Id(Long medicos_Perfil_Id) {
		Medicos_Perfil_Id = medicos_Perfil_Id;
	}


	public String getMedico_Id() {
		return Medico_Id;
	}

	public void setMedico_Id(String medico_Id) {
		Medico_Id = medico_Id;
	}

	public String getNombre_Perfil() {
		return Nombre_Perfil;
	}

	public void setNombre_Perfil(String nombre_Perfil) {
		Nombre_Perfil = nombre_Perfil;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getCosto() {
		return Costo;
	}

	public void setCosto(String costo) {
		Costo = costo;
	}

	


	
	
}
