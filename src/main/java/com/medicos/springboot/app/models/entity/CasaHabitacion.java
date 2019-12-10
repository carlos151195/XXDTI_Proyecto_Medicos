package com.medicos.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="casa_habitacion")
public class CasaHabitacion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="casahabitacion_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CasaHabitacionId;
	
	
	@Column(name="tipo_piso")
	private String Tipo_Piso;
	
	@Column(name="ventilacion_iluminacion")
	private String Ventilacion_Iluminacion;
	
	@Column(name="material_vivienda")
	private String Material_Vivienda;
	
	@Column(name="servicios_basicos")
	private String Servicios_Basicos;
	
	@Column(name="personas_viviendo_casa")
	private String Personas_Viviendo_Casa;
	
	@Column(name="numero_mascotas")
	private String Numero_Mascotas;
	
	@Column(name="otro")
	private String Otro;
	
	@Column(name="enfermedades_infancia")
	private String Enfermedades_Infancia;
	
	@Column(name="otro1")
	private String Otro1;
	
	@Column(name="enfermedades_adulto")
	private String Enfermedades_Adulto;
	
	@Column(name="otro2")
	private String Otro2;
	
	@Column(name="alergias")
	private String Alergias;
	
	@Column(name="traumatismo")
	private String Traumatismo;
	
	@Column(name="cirugias")
	private String Cirugias;
	
	@Column(name="inmunizacion")
	private String Inmunizacion;
	
	@Column(name="toma_medicamento")
	private String Toma_Medicamento;
	
	@Column(name="cual")
	private String Cual;
	
	@Column(name="quien_receto")
	private String Quien_Receto;

	public Long getCasaHabitacionId() {
		return CasaHabitacionId;
	}

	public void setCasaHabitacionId(Long casahabitacionId) {
		CasaHabitacionId = casahabitacionId;
	}

	public String getTipo_Piso() {
		return Tipo_Piso;
	}

	public void setTipo_Piso(String tipo_Piso) {
		Tipo_Piso = tipo_Piso;
	}

	public String getVentilacion_Iluminacion() {
		return Ventilacion_Iluminacion;
	}

	public void setVentilacion_Iluminacion(String ventilacion_Iluminacion) {
		Ventilacion_Iluminacion = ventilacion_Iluminacion;
	}

	public String getMaterial_Vivienda() {
		return Material_Vivienda;
	}

	public void setMaterial_Vivienda(String material_Vivienda) {
		Material_Vivienda = material_Vivienda;
	}

	public String getServicios_Basicos() {
		return Servicios_Basicos;
	}

	public void setServicios_Basicos(String servicios_Basicos) {
		Servicios_Basicos = servicios_Basicos;
	}

	public String getPersonas_Viviendo_Casa() {
		return Personas_Viviendo_Casa;
	}

	public void setPersonas_Viviendo_Casa(String personas_Viviendo_Casa) {
		Personas_Viviendo_Casa = personas_Viviendo_Casa;
	}

	public String getNumero_Mascotas() {
		return Numero_Mascotas;
	}

	public void setNumero_Mascotas(String numero_Mascotas) {
		Numero_Mascotas = numero_Mascotas;
	}

	public String getEnfermedades_Infancia() {
		return Enfermedades_Infancia;
	}

	public void setInfermedades_Infancia(String enfermedades_Infancia) {
		Enfermedades_Infancia = enfermedades_Infancia;
	}

	public String getOtro() {
		return Otro;
	}

	public void setOtro(String otro) {
		Otro = otro;
	}

	public String getEnfermedades_Adulto() {
		return Enfermedades_Adulto;
	}

	public void setEnfermedades_Adulto(String enfermedades_Adulto) {
		Enfermedades_Adulto = enfermedades_Adulto;
	}

	

	public String getOtro2() {
		return Otro2;
	}

	public void setOtro2(String otro2) {
		Otro2 = otro2;
	}

	public String getAlergias() {
		return Alergias;
	}

	public void setAlergias(String alergias) {
		Alergias = alergias;
	}

	public String getTraumatismo() {
		return Traumatismo;
	}

	public void setTraumatismo(String traumatismo) {
		Traumatismo = traumatismo;
	}

	public String getCirugias() {
		return Cirugias;
	}

	public void setCirugias(String cirugias) {
		Cirugias = cirugias;
	}

	public String getInmunizacion() {
		return Inmunizacion;
	}

	public void setInmunizacion(String inmunizacion) {
		Inmunizacion = inmunizacion;
	}

	public String getToma_Medicamento() {
		return Toma_Medicamento;
	}

	public void setToma_Medicamento(String toma_Medicamento) {
		Toma_Medicamento = toma_Medicamento;
	}

	public String getCual() {
		return Cual;
	}

	public void setCual(String cual) {
		Cual = cual;
	}

	public String getQuien_Receto() {
		return Quien_Receto;
	}

	public void setQuien_Receto(String quien_Receto) {
		Quien_Receto = quien_Receto;
	}

	

	public String getOtro1() {
		return Otro1;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setEnfermedades_Infancia(String enfermedades_Infancia) {
		Enfermedades_Infancia = enfermedades_Infancia;
	}

	


	
	
}
