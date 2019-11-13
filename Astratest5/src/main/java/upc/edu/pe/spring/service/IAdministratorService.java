package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Administrator;

public interface IAdministratorService {

	public boolean insert(Administrator administrator);
	public boolean modificar(Administrator administrator);
	public void eliminar(int idAdministrator);
	public Administrator listarId(int idAdministrator);
	List<Administrator>listar();
	List<Administrator>buscarNombre(String nameAdministrator);
}
