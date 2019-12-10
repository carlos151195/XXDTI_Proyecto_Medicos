
package com.medicos.springboot.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.medicos.springboot.app.models.entity.AltaPaciente;
import com.medicos.springboot.app.models.entity.AntecedentesFamiliares;
import com.medicos.springboot.app.models.entity.AntecedentesPersonales;
import com.medicos.springboot.app.models.entity.CasaHabitacion;
import com.medicos.springboot.app.models.entity.Embarazos;
import com.medicos.springboot.app.models.entity.Estudios;
import com.medicos.springboot.app.models.dao.IAltaPacienteDao;
import com.medicos.springboot.app.models.dao.IAntecedentesFamiliaresDao;
import com.medicos.springboot.app.models.dao.IAntecedentesPersonalesDao;
import com.medicos.springboot.app.models.dao.ICasaHabitacionDao;
import com.medicos.springboot.app.models.dao.IEmbarazosDao;
import com.medicos.springboot.app.models.dao.IEstudiosDao;


@Controller

public class AltaPacienteController {

	@Autowired
	private IAltaPacienteDao altapacienteDao;


	@Autowired
	private IEstudiosDao estudiosDao;


	@RequestMapping(value="/alta_paciente", method=RequestMethod.GET)
	
	public String listar(Model model, Map<String, Object> m) {
		
		AltaPaciente altapaciente = new AltaPaciente();
		AntecedentesFamiliares antecedentesfamiliares = new AntecedentesFamiliares();
		AntecedentesPersonales antecedentespersonales = new AntecedentesPersonales();
		Embarazos embarazos = new Embarazos();
		CasaHabitacion casahabitacion = new CasaHabitacion();
		model.addAttribute("titulo","Condiciones paciente");
		
		model.addAttribute("titulo1","Formulario catalogo");
		model.addAttribute("vista", altapacienteDao.findAll());
		model.addAttribute("vistas", altapacienteDao.findAll());
		m.put("altapaciente", altapaciente);
		m.put("antecedentesfamiliares", antecedentesfamiliares);
		m.put("antecedentespersonales", antecedentespersonales);
		m.put("casahabitacion", casahabitacion);
		m.put("embarazos", embarazos);
		altapacienteDao.findLastAltaPacienteId();
		return "alta_paciente";
	   }


	
	@RequestMapping(value="/solicitud_estudios", method=RequestMethod.GET)

	public String listado(Model model,Map<String, Object> m) {
//		model.addAttribute("id",Id);
		AltaPaciente altapaciente = new AltaPaciente();
		model.addAttribute("titulo","Solicitudes");
		model.addAttribute("solicitud",altapacienteDao.findAll());
		model.addAttribute("estudios",estudiosDao.findAll());
		m.put("detalles", altapaciente);
		return "solicitud_estudios";
	  }
	
	
	
	
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
	@RequestMapping(value="/solicitud_estudios/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model) {
		AltaPaciente altapaciente = null;
		if(id > 0) {
			altapaciente = altapacienteDao.findOne(id);
		}else {
			return "redirect:/solicitud_estudios";
		}
		model.put("estudios", altapaciente);
		model.put("titulo", "Editar estudio");
		return "solicitud_estudios";
		
	}
	
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/detalles_paciente/{id}")
	public String detalles(@PathVariable(value="id") Long id, Map<String, Object> model,Model m) {
		AltaPaciente altapaciente = null;
		if(id > 0) {
			altapaciente = altapacienteDao.findOne(id);
		}else {
			return "redirect:/solicitud_estudios";
		}
		model.put("detalles", altapaciente);
		model.put("titulo", "Editar estudio");
		m.addAttribute("solicitud",altapacienteDao.findAll());
		m.addAttribute("estudios",estudiosDao.findAll());
		return "solicitud_estudios";
		
	}

	
	
	
	@RequestMapping(value="/detalles_medicos/{medicos_id}")
	public String detalles2(@PathVariable(value="medicos_id") Long id, Map<String, Object> model,Model m) {
		AltaPaciente altapaciente = null;
		if(id > 0) {
			altapaciente = altapacienteDao.findOne(id);
		}else {
			return "redirect:/solicitud_estudios";
		}
		model.put("detalles_medicos", altapaciente);
		model.put("titulo", "Editar estudio");
		m.addAttribute("solicitud",altapacienteDao.findAll());
		m.addAttribute("estudios",estudiosDao.findAll());
		return "solicitud_estudios";
		
	}
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
	@RequestMapping(value="/estudios_listar/{estudio_id}")
	public String detalles1(@PathVariable(value="id") Long id, Map<String, Object> model,Model m) {
		Estudios estudios = null;
		if(id > 0) {
			estudios = estudiosDao.findOne(id);
		}else {
			return "redirect:/solicitud_estudios";
		}
		model.put("estudios", estudios);
		model.put("titulo", "Editar estudio");
		m.addAttribute("solicitud",estudiosDao.findAll());
		m.addAttribute("estudios",estudiosDao.findAll());
		return "solicitud_estudios";
		
	}

/*-------------------------------------------------------------------------------------------------------------------------------------------*/	
	@RequestMapping(value="/solicitud_estudios")
	public String agregar(AltaPaciente ap, Map<String, Object> model, Model m ) {
	
		Long aux= ap.getAltaPacienteId();
		AltaPaciente apn;
		apn=altapacienteDao.findOne(aux);
		model.put("altapaciente", apn);
		
		return "solicitud_estudios";
		
	} 
	
/*-------------------------------------------------------------------------------------------------------------------------------------------*/	
	@RequestMapping(value="/eliminar1/{AltaPacienteId}")
	public String eliminar1(@PathVariable(value= "AltaPacienteId") Long AltaPacienteId) {
		
		if(AltaPacienteId > 0) {
			altapacienteDao.delete(AltaPacienteId);
		}
		return "redirect:/solicitud_estudios";
	}//end eliminar1
	
/*-------------------------------------------------------------------------------------------------------------------------------------------*/	
	
	@RequestMapping(value= "/form_estudios_agregar/{id}")
	public String editar(@PathVariable (value="id") Long id, Map<String, Object> model, Model m ) {
		
		Estudios estudio = null;
		
		if (id>0) {
			
			
			estudio=estudiosDao.findOne(id);
			
			m.addAttribute("vistas", altapacienteDao.findAll());
			model.put("titulo", "Editar Empleado");
			model.put("estudio", estudio);
			
			return "form_empleado";
			
		}
		
		else {
			return "redirect:/solicitud_estudios";
		}
		
		
	}
	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/

	
	
@RequestMapping(value="/antecedentes_personales", method=RequestMethod.GET)
	
	public String listar2(Model model, Map<String, Object> m) {
		
		AntecedentesPersonales antecedentespersonales = new AntecedentesPersonales();
		
		
		model.addAttribute("titulo1","Formulario catalogo");
		model.addAttribute("vista", altapacienteDao.findAll());
		model.addAttribute("vistas", altapacienteDao.findAll());
		m.put("antecedentespersonales", antecedentespersonales);
		altapacienteDao.findLastAltaPacienteId();
		return "antecedentes_personales";
	   }

/*---------------------------------------------------------------------------------------------------------------------------------------------*/


@RequestMapping(value="/antecedentes_familiares", method=RequestMethod.GET)

public String listar3(Model model, Map<String, Object> m) {
	
	AntecedentesFamiliares antecedentesfamiliares = new AntecedentesFamiliares();
	
	
	model.addAttribute("titulo1","Formulario catalogo");
	model.addAttribute("vista", altapacienteDao.findAll());
	model.addAttribute("vistas", altapacienteDao.findAll());
	m.put("antecedentesfamiliares", antecedentesfamiliares);
	altapacienteDao.findLastAltaPacienteId();
	return "antecedentes_familiares";
   }

/*---------------------------------------------------------------------------------------------------------------------------------------------*/


@RequestMapping(value="/casa_habitacion", method=RequestMethod.GET)

public String listar4(Model model, Map<String, Object> m) {
	
	CasaHabitacion casahabitacion = new CasaHabitacion();
	
	
	model.addAttribute("titulo1","Formulario catalogo");
	model.addAttribute("vista", altapacienteDao.findAll());
	model.addAttribute("vistas", altapacienteDao.findAll());
	m.put("casahabitacion", casahabitacion);
	altapacienteDao.findLastAltaPacienteId();
	return "casa_habitacion";
   }

/*---------------------------------------------------------------------------------------------------------------------------------------------*/

@RequestMapping(value="/embarazos", method=RequestMethod.GET)

public String listar5(Model model, Map<String, Object> m) {
	
	Embarazos embarazos = new Embarazos();
	
	
	model.addAttribute("titulo1","Formulario catalogo");
	model.addAttribute("vista", altapacienteDao.findAll());
	model.addAttribute("vistas", altapacienteDao.findAll());
	m.put("embarazos", embarazos);
	altapacienteDao.findLastAltaPacienteId();
	return "embarazos";
   }

	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/alta_paciente_guardar" , method=RequestMethod.POST)
	public String guardar(@Valid AltaPaciente altapaciente ,BindingResult result, Model model, SessionStatus status) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Alta Paciente");
			altapaciente.setMedico_Id("1");
			return "alta_paciente";
		}
		altapacienteDao.save(altapaciente);
		status.setComplete();
		return "redirect:/alta_paciente";
		
	}


/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@Autowired
	private IAntecedentesFamiliaresDao antecedentesfamiliaresDao;
	@RequestMapping(value="/antecedentes_familiares", method=RequestMethod.POST)
	public String guardar1(@Valid AntecedentesFamiliares antecedentesfamiliares ,BindingResult result, Model model, SessionStatus status) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Alta Paciente");
			return "alta_paciente";
		}
		antecedentesfamiliaresDao.save(antecedentesfamiliares);
		status.setComplete();
		return "redirect:/antecedentes_familiares";
		
	}

/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@Autowired
	private IAntecedentesPersonalesDao antecedentespersonalesDao;
	@RequestMapping(value="/antecedentes_personales", method=RequestMethod.POST)
	public String guardar2(@Valid AntecedentesPersonales antecedentespersonales ,BindingResult result, Model model, SessionStatus status) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Alta Paciente");
			return "alta_paciente";
		}
		antecedentespersonalesDao.save(antecedentespersonales);
		status.setComplete();
		return "redirect:/antecedentes_personales";
		
	}

/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@Autowired
	private ICasaHabitacionDao casahabitacionDao;
	@RequestMapping(value="/casa_habitacion", method=RequestMethod.POST)
	public String guardar3(@Valid CasaHabitacion casahabitacion ,BindingResult result, Model model, SessionStatus status) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Alta Paciente");
			return "alta_paciente";
		}
		casahabitacionDao.save(casahabitacion);
		status.setComplete();
		return "redirect:/casa_habitacion";
		
	}
	
	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@Autowired
	private IEmbarazosDao embarazosDao;
	@RequestMapping(value="/embarazos", method=RequestMethod.POST)
	public String guardar4(@Valid Embarazos embarazos ,BindingResult result, Model model, SessionStatus status) {
		if(result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de Alta Paciente");
			return "alta_paciente";
		}
		embarazosDao.save(embarazos);
		status.setComplete();
		return "redirect:/embarazos";
		
	}

}