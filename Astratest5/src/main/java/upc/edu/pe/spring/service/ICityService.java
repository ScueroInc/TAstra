package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.City;



public interface ICityService {

	public boolean Insert(City id);
	public void eliminar(int id);
	public boolean modificar(City city);
	public City listarid(int id);
	List<City> listar();
}
