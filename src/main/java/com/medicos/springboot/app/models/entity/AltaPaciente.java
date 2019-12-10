package com.medicos.springboot.app.models.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente_medico_ap")
public class AltaPaciente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AltaPacienteId;
	
	@Column(name="nombre")
	private String Nombre;
	
	@Column(name="medico_id")
	private String Medico_Id;
	
	@Column(name="apellido_paterno")
	private String Apellido_Paterno;
	
	@Column(name="apellido_materno")
	private String Apellido_Materno;
	
	@Column(name="fecha")
	private String Fecha;
	
	@Column(name="edad")
	private String Edad;
	
	@Column(name="estado_civil")
	private String Estado_Civil;
	
	@Column(name="lugar_origen")
	private String Lugar_Origen;
	
	@Column(name="direccion")
	private String Direccion;
	
	@Column(name="expediente")
	private String Expediente;
	
	@Column(name="sexo")
	private String Sexo;
	
	@Column(name="telefono")
	private String Telefono;
	
	@Column(name="tension_arterial")
	private String Tension_Aterial;
	
	@Column(name="frecuencia_cardiaca")
	private String Frecuencia_Cardiaca;
	
	@Column(name="peso")
	private String Peso;
	
	@Column(name="talla")
	private String Talla;
	
	@Column(name="temperatura")
	private String Temperatura;
	
	@Column(name="frecuencia_respiratoria")
	private String Frecuencia_Respiratoria;
	
	
	public Long getAltaPacienteId() {
		return AltaPacienteId;
	}

	public void setAltaPacienteId(Long altaPacienteId) {
		AltaPacienteId = altaPacienteId;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	public String getMedico_Id() {
		return Medico_Id;
	}

	public void setMedico_Id(String medico_Id) {
		Medico_Id = medico_Id;
	}

	public String getApellido_Paterno() {
		return Apellido_Paterno;
	}

	public void setApellido_Paterno(String apellido_Paterno) {
		Apellido_Paterno = apellido_Paterno;
	}

	public String getApellido_Materno() {
		return Apellido_Materno;
	}

	public void setApellido_Materno(String apellido_Materno) {
		Apellido_Materno = apellido_Materno;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
	}

	public String getEstado_Civil() {
		return Estado_Civil;
	}

	public void setEstado_Civil(String estado_Civil) {
		Estado_Civil = estado_Civil;
	}

	public String getLugar_Origen() {
		return Lugar_Origen;
	}

	public void setLugar_Origen(String lugar_Origen) {
		Lugar_Origen = lugar_Origen;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getExpediente() {
		return Expediente;
	}

	public void setExpediente(String expediente) {
		Expediente = expediente;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTension_Aterial() {
		return Tension_Aterial;
	}

	public void setTension_Aterial(String tension_Aterial) {
		Tension_Aterial = tension_Aterial;
	}

	public String getFrecuencia_Cardiaca() {
		return Frecuencia_Cardiaca;
	}

	public void setFrecuencia_Cardiaca(String frecuencia_Cardiaca) {
		Frecuencia_Cardiaca = frecuencia_Cardiaca;
	}

	public String getPeso() {
		return Peso;
	}

	public void setPeso(String peso) {
		Peso = peso;
	}

	public String getTalla() {
		return Talla;
	}

	public void setTalla(String talla) {
		Talla = talla;
	}

	public String getTemperatura() {
		return Temperatura;
	}

	public void setTemperatura(String temperatura) {
		Temperatura = temperatura;
	}

	public String getFrecuencia_Respiratoria() {
		return Frecuencia_Respiratoria;
	}

	public void setFrecuencia_Respiratoria(String frecuencia_Respiratoria) {
		Frecuencia_Respiratoria = frecuencia_Respiratoria;
	}

	
	

	
}
	