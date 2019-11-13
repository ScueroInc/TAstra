package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Membership;



public interface IMembershipService {

	public boolean Insert(Membership id);
	public void eliminar(int id);
	public boolean modificar(Membership membership);
	public Membership listarid(int id);
	List<Membership> listar();
}
