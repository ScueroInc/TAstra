package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Hospital_Area_Manager;
import upc.edu.pe.spring.repository.IHospital_Area_ManagerDAO;



public class Hospital_Area_ManagerService implements IHospital_Area_ManagerService{

	private IHospital_Area_ManagerDAO dHospital_Area_Manager;
	@Override
	public boolean Insert(Hospital_Area_Manager id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dHospital_Area_Manager.delete(id);
	}

	@Override
	public boolean modificar(Hospital_Area_Manager hospital_area_manager) {
		boolean flag=false;
		try {
			dHospital_Area_Manager.save(hospital_area_manager);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Hospital_Area_Manager listarid(int id) {
		// TODO Auto-generated method stub
		return dHospital_Area_Manager.findOne(id);
	}

	@Override
	public List<Hospital_Area_Manager> listar() {
		// TODO Auto-generated method stub
		return dHospital_Area_Manager.findAll();
	}

	

}
