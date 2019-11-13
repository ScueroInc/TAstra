package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Detail_Hospital_Area;
import upc.edu.pe.spring.repository.IDetail_Hospital_AreaDAO;



public class Detail_Hospital_AreaService implements IDetail_Hospital_Area{

	private IDetail_Hospital_AreaDAO dDetail_Hospital_Area;
	@Override
	public boolean Insert(Detail_Hospital_Area id) {
		Detail_Hospital_Area objDetail_Hospital_Area=dDetail_Hospital_Area.save(id);
		if(objDetail_Hospital_Area==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dDetail_Hospital_Area.delete(id);
	}

	@Override
	public boolean modificar(Detail_Hospital_Area detail_hospital_area) {
		boolean flag=false;
		try {
			dDetail_Hospital_Area.save(detail_hospital_area);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Detail_Hospital_Area listarid(int id) {
		// TODO Auto-generated method stub
		return dDetail_Hospital_Area.findOne(id);
	}

	@Override
	public List<Detail_Hospital_Area> listar() {
		// TODO Auto-generated method stub
		return dDetail_Hospital_Area.findAll();
	}

	
}
