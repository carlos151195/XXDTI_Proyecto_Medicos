package com.medicos.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="embarazos")
public class Embarazos implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="embarazos_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long EmbarazosId;
	
	@Column(name="numero_embarazos")
	private String Numero_Embarazos;
	
	@Column(name="numero_abortos")
	private String Numero_Abortos;
	
	@Column(name="partos_naturales")
	private String Partos_Naturales;
	
	@Column(name="cesareas")
	private String Cesareas;
	
	@Column(name="metodo_anticonceptivos")
	private String Metodo_Anticonceptivos;
	
	@Column(name="exploracion_fisica")
	private String Exploracion_Fisica;
	
	@Column(name="resultados_previos")
	private String Resultados_Previos;
	
	@Column(name="diagnosticos_problemas")
	private String Diagnosticos_Problemas;
	
	@Column(name="pronostico")
	private String Pronostico;
	
	@Column(name="indicacion_terapeutica")
	private String 	Indicacion_Terapeutica;

	public Long getEmbarazosId() {
		return EmbarazosId;
	}

	public void setEmbarazosId(Long embarazosId) {
		EmbarazosId = embarazosId;
	}

	public String getNumero_Embarazos() {
		return Numero_Embarazos;
	}

	public void setNumero_Embarazos(String numero_Embarazos) {
		Numero_Embarazos = numero_Embarazos;
	}

	
	

	public String getNumero_Abortos() {
		return Numero_Abortos;
	}

	public void setNumero_Abortos(String numero_Abortos) {
		Numero_Abortos = numero_Abortos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPartos_Naturales() {
		return Partos_Naturales;
	}

	public void setPartos_Naturales(String partos_Naturales) {
		Partos_Naturales = partos_Naturales;
	}

	public String getCesareas() {
		return Cesareas;
	}

	public void setCesareas(String cesareas) {
		Cesareas = cesareas;
	}

	public String getMetodo_Anticonceptivos() {
		return Metodo_Anticonceptivos;
	}

	public void setMetodo_Anticonceptivos(String metodo_Anticonceptivos) {
		Metodo_Anticonceptivos = metodo_Anticonceptivos;
	}

	public String getExploracion_Fisica() {
		return Exploracion_Fisica;
	}

	public void setExploracion_Fisica(String exploracion_Fisica) {
		Exploracion_Fisica = exploracion_Fisica;
	}

	public String getResultados_Previos() {
		return Resultados_Previos;
	}

	public void setResultados_Previos(String resultados_Previos) {
		Resultados_Previos = resultados_Previos;
	}

	public String getDiagnosticos_Problemas() {
		return Diagnosticos_Problemas;
	}

	public void setDiagnosticos_Problemas(String diagnosticos_Problemas) {
		Diagnosticos_Problemas = diagnosticos_Problemas;
	}

	public String getPronostico() {
		return Pronostico;
	}

	public void setPronostico(String pronostico) {
		Pronostico = pronostico;
	}

	public String getIndicacion_Terapeutica() {
		return Indicacion_Terapeutica;
	}

	public void setIndicacion_Terapeutica(String indicacion_Terapeutica) {
		Indicacion_Terapeutica = indicacion_Terapeutica;
	}

	
	
	

}
