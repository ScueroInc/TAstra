package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Brand;
import upc.edu.pe.spring.repository.IBrandDAO;



public class BrandService implements IBrandService{

	private IBrandDAO dBrand;
	@Override
	public boolean Insert(Brand id) {
		Brand objBrand=dBrand.save(id);
		if(objBrand==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dBrand.delete(id);
	}

	@Override
	public boolean modificar(Brand brand) {
		boolean flag=false;
		try {
			dBrand.save(brand);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Brand listarid(int id) {
		// TODO Auto-generated method stub
		return dBrand.findOne(id);
	}

	@Override
	public List<Brand> listar() {
		// TODO Auto-generated method stub
		return dBrand.findAll();
	}

	

}
