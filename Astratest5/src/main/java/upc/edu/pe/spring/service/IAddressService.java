package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Address;

public interface IAddressService {
	public boolean Insert(Address id);
	public void eliminar(int id);
	public boolean modificar(Address adress);
	public Address listarid(int id);
	List<Address> listar();
	

}
