package com.medicos.springboot.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="antecedentes_familiares")
public class AntecedentesFamiliares {

	
		@Id
		@Column(name="antecedentesfam_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long AntecedentesFamId;
		
		
		@Column(name="cancer")
		private String Cancer;
		
		@Column(name="tubercolosis")
		private String 	Tubercolosis;
		
		@Column(name="diabetes")
		private String 	Diabetes;
		
		
		@Column(name="artritis")
		private String Artritis;
		
		@Column(name="problemas_cardiacos")
		private String 	Problemas_Cardiacos;
		
		@Column(name="tension_arterial_alta")
		private String Tension_Arterial_Alta;
		
		@Column(name="distrofia_muscular")
		private String 	Distrofia_Muscular;
		
		@Column(name="parkinson_alzheimer")
		private String 	Parkinson_Alzheimer;
		
		@Column(name="accidente_cerebrovascular")
		private String Accidente_Cerebrovascular;
		
		@Column(name="depresion_bipolaridad_demencia")
		private String Depresion_Bipolaridad_Demencia;
		
		@Column(name="neumonia_asma_epoc_rinitis")
		private String Neumonia_Asma_Epoc_Rinitis;
		
		@Column(name="hepatitis_cirrosis_Sx_de_reye")
		private String Hepatitis_Cirrosis_Sx_De_Reye;
		
		@Column(name="alergias")
		private String 	Alergias;
		
		@Column(name="anemia_leucemia_linfoma_mieloma")
		private String Anemia_Leucemia_Linfoma_Mieloma;
		
		@Column(name="problemas_de_tiroides")
		private String Problemas_De_Tiroides;
		
		
		@Column(name="otros")
		private String Otros;
		
		
		
		public Long getAntecedentesFamId() {
			return AntecedentesFamId;
		}

		public void setAntecedentesFamId(Long antecedentesFamId) {
			AntecedentesFamId = antecedentesFamId;
		}

		

		public String getCancer() {
			return Cancer;
		}

		public void setCancer(String cancer) {
			Cancer = cancer;
		}


		public String getTubercolosis() {
			return Tubercolosis;
		}

		public void setTubercolosis(String tubercolosis) {
			Tubercolosis = tubercolosis;
		}
		

		public String getDiabetes() {
			return Diabetes;
		}

		public void setDiabetes(String diabetes) {
			Diabetes = diabetes;
		}

		public String getArtritis() {
			return Artritis;
		}

		public void setArtritis(String artritis) {
			Artritis = artritis;
		}

		public String getProblemas_Cardiacos() {
			return Problemas_Cardiacos;
		}

		public void setProblemas_Cardiacos(String problemas_Cardiacos) {
			Problemas_Cardiacos = problemas_Cardiacos;
		}

		public String getTension_Arterial_Alta() {
			return Tension_Arterial_Alta;
		}

		public void setTension_Arterial_Alta(String tension_Arterial_Alta) {
			Tension_Arterial_Alta = tension_Arterial_Alta;
		}

		public String getDistrofia_Muscular() {
			return Distrofia_Muscular;
		}

		public void setDistrofia_Muscular(String distrofia_Muscular) {
			Distrofia_Muscular = distrofia_Muscular;
		}

		public String getParkinson_Alzheimer() {
			return Parkinson_Alzheimer;
		}

		public void setParkinson_Alzheimer(String parkinson_Alzheimer) {
			Parkinson_Alzheimer = parkinson_Alzheimer;
		}

		public String getAccidente_Cerebrovascular() {
			return Accidente_Cerebrovascular;
		}

		public void setAccidente_Cerebrovascular(String accidente_Cerebrovascular) {
			Accidente_Cerebrovascular = accidente_Cerebrovascular;
		}

		public String getDepresion_Bipolaridad_Demencia() {
			return Depresion_Bipolaridad_Demencia;
		}

		public void setDepresion_Bipolaridad_Demencia(String depresion_Bipolaridad_Demencia) {
			Depresion_Bipolaridad_Demencia = depresion_Bipolaridad_Demencia;
		}

		public String getNeumonía_Asma_Epoc_Rinitis() {
			return Neumonia_Asma_Epoc_Rinitis;
		}

		public void setNeumonía_Asma_Epoc_Rinitis(String neumonia_Asma_Epoc_Rinitis) {
			Neumonia_Asma_Epoc_Rinitis = neumonia_Asma_Epoc_Rinitis;
		}

		public String getHepatitis_Cirrosis_Sx_De_Reye() {
			return Hepatitis_Cirrosis_Sx_De_Reye;
		}

		public void setHepatitis_Cirrosis_Sx_De_Reye(String hepatitis_Cirrosis_Sx_De_Reye) {
			Hepatitis_Cirrosis_Sx_De_Reye = hepatitis_Cirrosis_Sx_De_Reye;
		}

		public String getAlergias() {
			return Alergias;
		}

		public void setAlergias(String alergias) {
			Alergias = alergias;
		}

		public String getAnemia_Leucemia_Linfoma_Mieloma() {
			return Anemia_Leucemia_Linfoma_Mieloma;
		}

		public void setAnemia_Leucemia_Linfoma_Mieloma(String anemia_Leucemia_Linfoma_Mieloma) {
			Anemia_Leucemia_Linfoma_Mieloma = anemia_Leucemia_Linfoma_Mieloma;
		}

		public String getProblemas_De_Tiroides() {
			return Problemas_De_Tiroides;
		}

		public void setProblemas_De_Tiroides(String problemas_De_Tiroides) {
			Problemas_De_Tiroides = problemas_De_Tiroides;
		}

		public String getOtros() {
			return Otros;
		}

		public void setOtros(String otros) {
			this.Otros = otros;
		}

}
