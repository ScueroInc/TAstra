package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Hospital_Area_Manager;



public interface IHospital_Area_ManagerService {

	public boolean Insert(Hospital_Area_Manager id);
	public void eliminar(int id);
	public boolean modificar(Hospital_Area_Manager hospital_area_manager);
	public Hospital_Area_Manager listarid(int id);
	List<Hospital_Area_Manager> listar();
}
