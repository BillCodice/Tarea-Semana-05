package com.redsocial.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.redsocial.entidad.Medicamento;
import com.redsocial.servicio.MedicamentoServicio;

@Controller
public class MedicamentoController {

	@Autowired
	private MedicamentoServicio servicio;
	
	@RequestMapping ("/verMedicamento")
	public String mostrar() {
		return "/crudMedicamento";
	};
	
	@RequestMapping("/listaMedicamento")	
	public String lista(@RequestParam Map<String,String> params, Model m) {
		String fil = params.get("filtro");
		List<Medicamento> lista = servicio.listaMedicamento(fil);
		m.addAttribute("medicamento",lista);
		return "/crudMedicamento";
	};		
	
	@RequestMapping("/registraMedicamento")
	public String lista(Medicamento obj, Model m) {
		servicio.insertaMedicamento(obj);
		List<Medicamento> lista = servicio.listaMedicamento("");
		m.addAttribute("medicamento",lista);
		return "/crudMedicamento";
	};		
	
	
	
}


