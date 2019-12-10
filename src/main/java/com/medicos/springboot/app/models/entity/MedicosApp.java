package com.medicos.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicos_app")
public class MedicosApp  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="medicos_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long MedicosId;
	
	@Column(name="nombre_doc")
	private String NombreDoc;
	
	@Column(name="apellidop_doc")
	private String ApellidoP;
	
	@Column(name="apellidom_doc")
	private String ApellidoM;
	
	@Column(name="especialidad_doc")
	private String EspecialidadDoc;
	
	@Column(name="cedula_doc")
	private String CedulaDoc;
	
	@Column(name="direccion_doc")
	private String DireccionDoc;
	
	@Column(name="telefono_doc")
	private String TelefonoDoc;
	
	@Column(name="movil_doc")
	private String MovilDoc;
	
	
	@Column(name="primer_consulta")
	private String PrimerConsulta;
	
	@Column(name="control_consulta")
	private String ControlConsulta;
	
	@Column(name="domicilio_consulta")
	private String Domicilio;
	
	@Column(name="foto_doc")
	private String FotoDoc;
	
	@Column(name="usuario_Id")
	private Long usuario;
	
/*getter-setter----------------------------------------------------------------------------*/
	
	

	

	public Long getMedicosId() {
		return MedicosId;
	}

	public void setMedicosId(Long medicosId) {
		MedicosId = medicosId;
	}
	
	public String getNombreDoc() {
		return NombreDoc;
	}

	public void setNombreDoc(String nombreDoc) {
		NombreDoc = nombreDoc;
	}

	public String getApellidoP() {
		return ApellidoP;
	}

	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}

	public String getApellidoM() {
		return ApellidoM;
	}

	public void setApellidoM(String apellidoM) {
		ApellidoM = apellidoM;
	}

	public String getEspecialidadDoc() {
		return EspecialidadDoc;
	}

	public void setEspecialidadDoc(String especialidadDoc) {
		EspecialidadDoc = especialidadDoc;
	}

	public String getCedulaDoc() {
		return CedulaDoc;
	}

	public void setCedulaDoc(String cedulaDoc) {
		CedulaDoc = cedulaDoc;
	}

	public String getDireccionDoc() {
		return DireccionDoc;
	}

	public void setDireccionDoc(String direccionDoc) {
		DireccionDoc = direccionDoc;
	}

	public String getTelefonoDoc() {
		return TelefonoDoc;
	}

	public void setTelefonoDoc(String telefonoDoc) {
		TelefonoDoc = telefonoDoc;
	}

	public String getMovilDoc() {
		return MovilDoc;
	}

	public void setMovilDoc(String movilDoc) {
		MovilDoc = movilDoc;
	}

	

	public String getPrimerConsulta() {
		return PrimerConsulta;
	}

	public void setPrimerConsulta(String primerConsulta) {
		PrimerConsulta = primerConsulta;
	}

	public String getControlConsulta() {
		return ControlConsulta;
	}

	public void setControlConsulta(String controlConsulta) {
		ControlConsulta = controlConsulta;
	}

	public String getDomicilio() {
		return Domicilio;
	}

	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}

	public String getFotoDoc() {
		return FotoDoc;
	}

	public void setFotoDoc(String fotoDoc) {
		FotoDoc = fotoDoc;
	}

	public Long getUsuario() {
		return usuario;
	}

	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}
	
	
	
	
}
