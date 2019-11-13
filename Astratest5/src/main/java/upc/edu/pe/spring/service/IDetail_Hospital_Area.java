package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Detail_Hospital_Area;



public interface IDetail_Hospital_Area {

	public boolean Insert(Detail_Hospital_Area id);
	public void eliminar(int id);
	public boolean modificar(Detail_Hospital_Area detail_hospital_area);
	public Detail_Hospital_Area listarid(int id);
	List<Detail_Hospital_Area> listar();
}
