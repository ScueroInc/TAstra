package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.City;
import upc.edu.pe.spring.repository.ICityDAO;



public class CityService implements ICityService{

	private ICityDAO dCity;
	@Override
	public boolean Insert(City id) {
		City objCity=dCity.save(id);
		if(objCity==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dCity.delete(id);
	}

	@Override
	public boolean modificar(City city) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			dCity.save(city);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public City listarid(int id) {
		// TODO Auto-generated method stub
		return dCity.findOne(id);
	}

	@Override
	public List<City> listar() {
		// TODO Auto-generated method stub
		return dCity.findAll();
	}

	

}
