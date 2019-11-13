package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Area_Hospital;
import upc.edu.pe.spring.repository.IArea_HospitalDAO;



public class Area_HospitalService implements IArea_HospitalService{

	private IArea_HospitalDAO dArea_Hospital;
	@Override
	public boolean Insert(Area_Hospital id) {
		Area_Hospital objArea_Hospital=dArea_Hospital.save(id);
		if(objArea_Hospital==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		dArea_Hospital.delete(id);
		
	}

	@Override
	public boolean modificar(Area_Hospital area_hospital) {
		boolean flag=false;
		try {
			dArea_Hospital.save(area_hospital);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Area_Hospital listarid(int id) {
		// TODO Auto-generated method stub
		return dArea_Hospital.findOne(id);
	}

	@Override
	public List<Area_Hospital> listar() {
		return dArea_Hospital.findAll();
	}

	
}
