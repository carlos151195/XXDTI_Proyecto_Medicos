package com.medicos.springboot.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="antecedentes_personales")
public class AntecedentesPersonales {
	
			@Id
			@Column(name="antecedentespersonales_id")
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private Long AntecedentesPersonalesId;
			

			@Column(name="alimentacion")
			private String Alimentacion;
			

			@Column(name="veces_al_dia")
			private String Veces_Al_Dia;
			

			@Column(name="toxicomanias")
			private String Toxicomanias;
			
			
			@Column(name="frecuencias")
			private String Frecuencias;
			

			@Column(name="actividad_fisica")
			private String Actividad_Fisica;
			

			@Column(name="especifique")
			private String Especifique;
			
			@Column(name="grupo_recreacion")
			private String Grupo_Recreacion;
			
			@Column(name="especifique1")
			private String Especifique1;
			

			@Column(name="baño")
			private String Baño;
			
			@Column(name="otro")
			private String Otro;
			
			@Column(name="otro1")
			private String Otro1;

			@Column(name="lavado_dientes")
			private String Lavado_Dientes;
			

			@Column(name="lavado_de_manos")
			private String Lavado_De_Manos;
			
			
	
			public Long getAntecedentesPersonalesId() {
				return AntecedentesPersonalesId;
			}


			public void setAntecedentesPersonalesId(Long antecedentesPersonalesId) {
				AntecedentesPersonalesId = antecedentesPersonalesId;
			}


			public String getAlimentacion() {
				return Alimentacion;
			}


			public void setAlimentacion(String alimentacion) {
				Alimentacion = alimentacion;
			}


			public String getVeces_Al_Dia() {
				return Veces_Al_Dia;
			}


			public void setVeces_Al_Dia(String veces_Al_Dia) {
				Veces_Al_Dia = veces_Al_Dia;
			}


			public String getToxicomanias() {
				return Toxicomanias;
			}


			public void setToxicomanias(String toxicomanias) {
				Toxicomanias = toxicomanias;
			}


			public String getFrecuencias() {
				return Frecuencias;
			}


			public void setFrecuencias(String frecuencias) {
				Frecuencias = frecuencias;
			}


			public String getActividad_Fisica() {
				return Actividad_Fisica;
			}


			public void setActividad_Fisica(String actividad_Fisica) {
				Actividad_Fisica = actividad_Fisica;
			}


			public String getEspecifique() {
				return Especifique;
			}


			public void setEspecifique(String especifique) {
				Especifique = especifique;
			}


			public String getBaño() {
				return Baño;
			}


			public void setBaño(String baño) {
				Baño = baño;
			}


			


			public String getLavado_Dientes() {
				return Lavado_Dientes;
			}


			public void setLavado_Dientes(String lavado_Dientes) {
				Lavado_Dientes = lavado_Dientes;
			}


			public String getLavado_De_Manos() {
				return Lavado_De_Manos;
			}


			public void setLavado_De_Manos(String lavado_De_Manos) {
				Lavado_De_Manos = lavado_De_Manos;
			}


			public String getGrupo_Recreacion() {
				return Grupo_Recreacion;
			}


			public void setGrupo_Recreacion(String grupo_Recreacion) {
				Grupo_Recreacion = grupo_Recreacion;
			}


			public String getEspecifique1() {
				return Especifique1;
			}


			public void setEspecifique1(String especifique1) {
				Especifique1 = especifique1;
			}


			public String getOtro() {
				return Otro;
			}


			public void setOtro(String otro) {
				Otro = otro;
			}


			public String getOtro1() {
				return Otro1;
			}


			public void setOtro1(String otro1) {
				Otro1 = otro1;
			}
			
			
			

			
			
			
	
	
}
