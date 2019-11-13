package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Area_Hospital;



public interface IArea_HospitalService {

	public boolean Insert(Area_Hospital id);
	public void eliminar(int id);
	public boolean modificar(Area_Hospital area_hospital);
	public Area_Hospital listarid(int id);
	List<Area_Hospital> listar();
}
