package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Brand;


public interface IBrandService {

	public boolean Insert(Brand id);
	public void eliminar(int id);
	public boolean modificar(Brand brand);
	public Brand listarid(int id);
	List<Brand> listar();
}
