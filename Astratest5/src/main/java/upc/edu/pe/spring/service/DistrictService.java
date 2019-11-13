package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.District;
import upc.edu.pe.spring.repository.IDistrictDAO;


public class DistrictService implements IDistrictService{

	private IDistrictDAO dDistrict;
	@Override
	public boolean Insert(District id) {
		District objDistrict=dDistrict.save(id);
		if(objDistrict==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dDistrict.delete(id);
	}

	@Override
	public boolean modificar(District district) {
		boolean flag=false;
		try {
			dDistrict.save(district);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public District listarid(int id) {
		// TODO Auto-generated method stub
		return dDistrict.findOne(id);
	}

	@Override
	public List<District> listar() {
		// TODO Auto-generated method stub
		return dDistrict.findAll();
	}

	

}
