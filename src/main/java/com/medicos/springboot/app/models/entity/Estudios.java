package com.medicos.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nombre_estudios")
public class Estudios implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="estudio_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long EstudioId;
	
	@Column(name="nombre_estudio")
	private String Nombre;

	public Long getEstudioId() {
		return EstudioId;
	}

	public void setEstudioId(Long estudioId) {
		EstudioId = estudioId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
	