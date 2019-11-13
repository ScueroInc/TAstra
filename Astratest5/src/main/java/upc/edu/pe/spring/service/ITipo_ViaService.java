package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Tipo_via;

public interface ITipo_ViaService {

	public boolean Insert(Tipo_via id);
	public void eliminar(int id);
	public boolean modificar(Tipo_via tipo_via);
	public Tipo_via listarid(int id);
	List<Tipo_via> listar();
}
