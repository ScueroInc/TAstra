package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Hospital;
import upc.edu.pe.spring.repository.IHospitalDAO;

public class HospitalService implements IHospitalService{

	private IHospitalDAO dHospital;
	@Override
	public boolean Insert(Hospital id) {
		Hospital objHospital=dHospital.save(id);
		if(objHospital==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dHospital.delete(id);
	}

	@Override
	public boolean modificar(Hospital hospital) {
		boolean flag=false;
		try {
			dHospital.save(hospital);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Hospital listarid(int id) {
		// TODO Auto-generated method stub
		return dHospital.findOne(id);
	}

	@Override
	public List<Hospital> listar() {
		// TODO Auto-generated method stub
		return dHospital.findAll();
	}

	

}
