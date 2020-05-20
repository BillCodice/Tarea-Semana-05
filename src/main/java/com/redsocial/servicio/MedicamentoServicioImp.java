package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Medicamento;
import com.redsocial.repositorio.MedicamentoRepositorio;

@Service
public class MedicamentoServicioImp implements MedicamentoServicio {

	
	@Autowired
	private MedicamentoRepositorio repositorio;
	
	@Override
	public int insertaMedicamento(Medicamento obj) {
	
		return repositorio.insertaMedicamento(obj);
	}

	@Override
	public List<Medicamento> listaMedicamento(String s) {
		
		return repositorio.listaMedicamento(s);
	}

}
