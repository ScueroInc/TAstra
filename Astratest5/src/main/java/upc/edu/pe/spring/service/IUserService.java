package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.User;


public interface IUserService {

	public boolean Insert(User id);
	public void eliminar(int id);
	public boolean modificar(User user);
	public User listarid(int id);
	List<User> listar();
}
