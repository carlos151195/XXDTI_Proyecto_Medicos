package com.medicos.springboot.app.controllers;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import com.medicos.springboot.app.models.entity.PaquetesCultivos;
import com.medicos.springboot.app.models.entity.PaquetesEstudiosApp;
import com.medicos.springboot.app.models.entity.PaquetesPerfiles;
import com.medicos.springboot.app.models.entity.Paquetes;
import com.medicos.springboot.app.models.dao.IMedicosPerfilAppDao;
import com.medicos.springboot.app.models.dao.IPaquetesCultivosDao;
import com.medicos.springboot.app.models.dao.IPaquetesDao;
import com.medicos.springboot.app.models.dao.IPaquetesEstudiosAppDao;
import com.medicos.springboot.app.models.dao.IPaquetesPerfilesDao;
import com.medicos.springboot.app.models.dao.IPerfilesAppDao;
import com.medicos.springboot.app.models.dao.IPerfilesDao;
import com.medicos.springboot.app.models.entity.MedicosPerfilApp;
import com.medicos.springboot.app.models.entity.PerfilesApp;


@Controller

public class MedicosPerfilAppController {

	


	@Autowired
	private IMedicosPerfilAppDao medicosperfilappDao;
	
	@Autowired
	private IPerfilesAppDao perfilesappDao;
	
	@Autowired
	private IPaquetesEstudiosAppDao paquetesEstudiosAppDao;
	

	@Autowired
	private IPaquetesPerfilesDao paquetesPerfilesDao;
	
	@Autowired
	private IPaquetesCultivosDao paquetesCultivosDao;
	

	@Autowired
	private IPaquetesDao paquetesDao;
	
	

	@Autowired
	private IPerfilesDao perfilesDao;


	@RequestMapping(value="/listar_perfiles", method=RequestMethod.GET)
	
	public String listar(Model model, Map<String, Object> m) {
		
		MedicosPerfilApp medicosperfilapp = new MedicosPerfilApp();
		
		model.addAttribute("titulo","Condiciones paciente");
		
		model.addAttribute("titulo1","Formulario medicos");
		model.addAttribute("crear", medicosperfilappDao.findAll());
		m.put("medicosperfilapp", medicosperfilapp);
		medicosperfilappDao.findLastMedicosPerfilAppId();
		return "listar_perfiles";
	   }
/*--------------------------------------------------------------------------------------------------------------------------------------------*/

	@RequestMapping(value="/perfiles", method=RequestMethod.GET)
	
	public String listado(Model model, Map<String, Object> m) {
		
		PerfilesApp perfilesapp = new PerfilesApp();
		
		model.addAttribute("titulo1","Condiciones paciente");
		model.addAttribute("estudios", paquetesEstudiosAppDao.findEstudios(4l));
		model.addAttribute("titulo2","Formulario medicos");
		model.addAttribute("titulo3","guardar perfiles");
		model.addAttribute("perfiles", perfilesappDao.findAll());
		PaquetesCultivos paquetesCultivos=new PaquetesCultivos();
		PaquetesEstudiosApp paquetesEstudiosApp = new PaquetesEstudiosApp();
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		m.put("paquetesCultivos",paquetesCultivos);
		m.put("paquetesEstudiosApp",paquetesEstudiosApp);
		m.put("paquetesPerfiles",paquetesPerfiles);
		m.put("perfilesapp", perfilesapp);
		perfilesappDao.findLastPerfilesAppId();
		return "perfiles";
	   }
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/perfil/{medicos_perfiles_id}")
	public String detalles(@PathVariable(value="medicos_perfiles_id") Long id, Map<String, Object> model,Model m) {
		PerfilesApp perfilesapp = null;
		if(id > 0) {
			perfilesapp = perfilesappDao.findOne(id);
		}else {
			return "redirect:/listar_perfiles";
		}
		model.put("perfilesapp", perfilesapp);
		model.put("titulo", "Editar estudio");
		m.addAttribute("titulo1","Condiciones paciente");
		
		m.addAttribute("titulo2","Formulario medicos");
		m.addAttribute("perfiles", perfilesappDao.findAll());
		return "perfiles";
		
	}
/*--------------------------------------------------------------------------------------------------------------------------------------------*/

	@RequestMapping(value = "/estudios_perfiles")
	public String crear(Map<String, Object> model,  Model m) {
		// m.addAttribute("estudios", estudiosDao.findAll());
		PaquetesEstudiosApp paquetesEstudiosApp = new PaquetesEstudiosApp();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		model.put("paquetesEstudiosApp", paquetesEstudiosApp);
		model.put("paquetesCultivos", paquetesCultivos);
		model.put("titulo3", "Guardar Perfil");
		return "perfiles";
	}

	
/*--------------------------------------------------------------------------------------------------------------------------------------------*/	
	
	@RequestMapping(value = "/perfilessapp", method = RequestMethod.POST)
	public String guardarPerfiles(Map<String, Object> m,PerfilesApp perfilesapp, BindingResult result, Model model,
			SessionStatus status) {
		if (result.hasErrors()) {
			return "perfiles";
		}
		perfilesapp.setPerfilEstatus(true);
		perfilesappDao.save(perfilesapp);
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		paquetesEstudios.setPaqueteId(perfilesapp.getMedicos_Perfil_Id());
		paquetesPerfiles.setPaqueteId(perfilesapp.getMedicos_Perfil_Id());
		paquetesCultivos.setPaqueteId(perfilesapp.getMedicos_Perfil_Id());
		m.put("paquetesEstudios",paquetesEstudios);
		m.put("paquetesPerfiles", paquetesPerfiles);
		m.put("paquetesCultivos", paquetesCultivos);
		m.put("titulo4", "Guardar Perfil");
		model.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(perfilesapp.getMedicos_Perfil_Id()));
		model.addAttribute("perfiles", paquetesPerfilesDao.findAllById(perfilesapp.getMedicos_Perfil_Id()));
		model.addAttribute("cultivos", paquetesCultivosDao.findAllById(perfilesapp.getMedicos_Perfil_Id()));
		return "perfiles";
	}

/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@RequestMapping(value="/estudios_paquetes", method=RequestMethod.POST)
	public String guardarPaquete (Map<String, Object> m, Paquetes paquetes,BindingResult result , Model model,SessionStatus status)
	{		
		//model.addAttribute("catalogos", catalogoDao.findAll());
		
		m.put("titulo","Guardar Paquete");
		
		model.addAttribute("perfiles", perfilesappDao.findAll());
		//model.addAttribute("estudioss", perfilesEstudiosDao.findAllById(perfiles.getPerfilId()));
		if(result.hasErrors()) {
			return "perfiles";
		}
		paquetes.setPaqueteEstatus(true);
		paquetes.setBeMedicaId(1);

		if(paquetes.getPaqueteIdText()=="") {
			char buf[] = new char[3];
			paquetes.getPaqueteNombre().getChars(0,3,buf,0);
			String IdText = String.valueOf(buf);
			paquetes.setPaqueteIdText(IdText.toLowerCase()+(paquetes.getPaqueteId()+10000));
		}
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		paquetesEstudios.setPaqueteId(paquetes.getPaqueteId());
		paquetesPerfiles.setPaqueteId(paquetes.getPaqueteId());
		paquetesCultivos.setPaqueteId(paquetes.getPaqueteId());
		m.put("paquetesEstudios",paquetesEstudios);
		m.put("paquetesPerfiles", paquetesPerfiles);
		m.put("paquetesCultivos", paquetesCultivos);
		model.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(paquetes.getPaqueteId()));
		model.addAttribute("perfiles", paquetesPerfilesDao.findAllById(paquetes.getPaqueteId()));
		model.addAttribute("cultivos", paquetesCultivosDao.findAllById(paquetes.getPaqueteId()));
		return "perfiles";
	}
	
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/estudios_paquetesEstudios13", method=RequestMethod.POST)
	public String guardarPaqueteEstudiosApp (Map<String, Object> m,PaquetesEstudiosApp paquetesEstudiosApp,BindingResult result , Model model,SessionStatus status)
	{	
		//model.addAttribute("catalogos", catalogoDao.findAll());
		PaquetesEstudiosApp aux=null;
		aux=paquetesEstudiosAppDao.findOne(paquetesEstudiosApp.getPaqueteId());
		if(result.hasErrors()) {
			return "perfiles";
		}
		paquetesEstudiosAppDao.save(paquetesEstudiosApp);
		m.put("paquetesEstudiosApp",paquetesEstudiosApp);
		return "perfiles";
	}

/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/estudios_paquetesPerfiles12", method=RequestMethod.POST)
	public String guardarPaquetePerfiles (Map<String, Object> m,PaquetesPerfiles paquetesPerfiles,BindingResult result , Model model,SessionStatus status)
	{	
		//model.addAttribute("catalogos", catalogoDao.findAll());
		Paquetes aux=null;
		aux=paquetesDao.findOne(paquetesPerfiles.getPaqueteId());
		if(result.hasErrors()) {
			return "estudios_perfiles";
		}
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		paquetesCultivos.setPaqueteId(aux.getPaqueteId());
		paquetesPerfiles.setPaqueteId(aux.getPaqueteId());
		paquetesEstudios.setPaqueteId(aux.getPaqueteId());
		paquetesPerfilesDao.save(paquetesPerfiles);
		m.put("titulo","Guardar Paquete");	
		m.put("paquetesPerfiles",paquetesPerfiles);
		m.put("paquetesEstudios",paquetesEstudios);
		m.put("paquetesCultivos", paquetesCultivos);
		m.put("paquetes",aux);
		model.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(aux.getPaqueteId()));
		model.addAttribute("perfiles", paquetesPerfilesDao.findAllById(aux.getPaqueteId()));
		model.addAttribute("cultivos", paquetesCultivosDao.findAllById(aux.getPaqueteId()));

		return "perfiles";
	}
	
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
	
	@RequestMapping(value="/estudios_paquetesCultivos21", method=RequestMethod.POST)
	public String guardarPaquetesCultivos (Map<String, Object> m,PaquetesCultivos paquetesCultivos,BindingResult result , Model model,SessionStatus status)
	{	
		//model.addAttribute("catalogos", catalogoDao.findAll());
		PaquetesCultivos aux=null;
		aux=paquetesCultivosDao.findOne(paquetesCultivos.getPaqueteId());
		if(result.hasErrors()) {
			return "perfiles";
		}
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		paquetesCultivos.setPaqueteId(aux.getPaqueteId());
		paquetesPerfiles.setPaqueteId(aux.getPaqueteId());
		paquetesEstudios.setPaqueteId(aux.getPaqueteId());
		paquetesCultivosDao.save(paquetesCultivos);
		m.put("titulo","Guardar Paquete");	
		m.put("paquetesCultivos", paquetesCultivos);
		m.put("paquetesPerfiles",paquetesPerfiles);
		m.put("paquetesEstudios",paquetesEstudios);
		m.put("paquetes",aux);
		model.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(aux.getPaqueteId()));
		model.addAttribute("perfiles", paquetesPerfilesDao.findAllById(aux.getPaqueteId()));
		model.addAttribute("cultivos", paquetesCultivosDao.findAllById(aux.getPaqueteId()));

		return "perfiles";
	}
	
	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@RequestMapping(value="/estudios_paquete/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model,Model m) {
		Paquetes paquetes = null;
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		if(id>0) {
			System.out.print("i´m here"+id);
			paquetes=paquetesDao.findOne(id);
		}
		else {
			return "redirect:estudios_listar/";
		}
		model.put("paquetes",paquetes);
		paquetesEstudios.setPaqueteId(id);
		paquetesCultivos.setPaqueteId(id);
		paquetesPerfiles.setPaqueteId(id);
		paquetesEstudios.setPaqueteId(id);
		model.put("paquetesCultivos", paquetesCultivos);
		model.put("paquetesPerfiles",paquetesPerfiles);
		model.put("paquetesEstudios",paquetesEstudios);
		model.put("titulo","Guardar Paquete");	
		m.addAttribute("cultivos", paquetesCultivosDao.findAllById(id));
		m.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(id));
		m.addAttribute("perfiles", paquetesPerfilesDao.findAllById(id));
		m.addAttribute("cultivos", paquetesCultivosDao.findAllById(id));
		return "perfiles";		
	}
	
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
	
	
	@RequestMapping (value="/EliminarEstPaq/{id}/{id_e}/{t}")
	public String eliminar(@PathVariable (value="id") Long id,@PathVariable (value="id_e") Long id_e,@PathVariable (value="t") int t,Model m,Map<String, Object> model,Paquetes paquetes) {
		//m.addAttribute("catalogos", catalogoDao.findAll());
		model.put("titulo","Guardar Paquete");
		Paquetes aux=null;
		aux=paquetesDao.findOne(id_e);
		PaquetesPerfiles paquetesPerfiles = new PaquetesPerfiles();
		PaquetesEstudiosApp paquetesEstudios = new PaquetesEstudiosApp();
		PaquetesCultivos paquetesCultivos = new PaquetesCultivos();
		paquetesCultivos.setPaqueteId(aux.getPaqueteId());
		paquetesPerfiles.setPaqueteId(aux.getPaqueteId());
		paquetesEstudios.setPaqueteId(aux.getPaqueteId());
		model.put("paquetesCultivos", paquetesCultivos);
		model.put("paquetesPerfiles",paquetesPerfiles);
		model.put("paquetesEstudios",paquetesEstudios);
		model.put("paquetes",aux);
		if(t==1 && id > 0) {

			paquetesEstudiosAppDao.delete(id);

		}
		else if(t==2 && id > 0) {
			
			paquetesPerfilesDao.delete(id);
			
		}
		else if(t==3 && id > 0) {
			
			paquetesCultivosDao.delete(id);
			
		}
		m.addAttribute("perfiles", paquetesPerfilesDao.findAllById(id_e));
		m.addAttribute("estudios", paquetesEstudiosAppDao.findAllById(id_e));
		m.addAttribute("cultivos", paquetesCultivosDao.findAllById(id_e));
		return "perfiles";
	}
	
	
}
