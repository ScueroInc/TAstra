package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Medical_Equipment;



public interface IMedical_EquipmentService {

	public boolean Insert(Medical_Equipment id);
	public void eliminar(int id);
	public boolean modificar(Medical_Equipment medical_equipment);
	public Medical_Equipment listarid(int id);
	List<Medical_Equipment> listar();
}
