package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Hospital;




public interface IHospitalService {

	public boolean Insert(Hospital id);
	public void eliminar(int id);
	public boolean modificar(Hospital hospital);
	public Hospital listarid(int id);
	List<Hospital> listar();
}
