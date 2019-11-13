package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.District;



public interface IDistrictService {

	public boolean Insert(District id);
	public void eliminar(int id);
	public boolean modificar(District district);
	public District listarid(int id);
	List<District> listar();
}
