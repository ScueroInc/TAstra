package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Machine_Review;



public interface IMachine_ReviewService {

	public boolean Insert(Machine_Review id);
	public void eliminar(int id);
	public boolean modificar(Machine_Review machine_review);
	public Machine_Review listarid(int id);
	List<Machine_Review> listar();
}
