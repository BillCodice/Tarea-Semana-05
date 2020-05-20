package com.redsocial.servicio;

import java.util.List;

import com.redsocial.entidad.Medicamento;

public interface MedicamentoServicio {

	public abstract int insertaMedicamento(Medicamento obj);
	public abstract List<Medicamento> listaMedicamento(String s);
}
