package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Medical_Equipment;
import upc.edu.pe.spring.repository.IMedical_EquipmentDAO;



public class Medical_EquipmentService implements IMedical_EquipmentService{

	private IMedical_EquipmentDAO dMedical_Equipment;
	@Override
	public boolean Insert(Medical_Equipment id) {
		Medical_Equipment objMedical_Equipment=dMedical_Equipment.save(id);
		if(objMedical_Equipment==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dMedical_Equipment.delete(id);
	}

	@Override
	public boolean modificar(Medical_Equipment medical_equipment) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			dMedical_Equipment.save(medical_equipment);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Medical_Equipment listarid(int id) {
		// TODO Auto-generated method stub
		return dMedical_Equipment.findOne(id);
	}

	@Override
	public List<Medical_Equipment> listar() {
		// TODO Auto-generated method stub
		return dMedical_Equipment.findAll();
	}

	

}
