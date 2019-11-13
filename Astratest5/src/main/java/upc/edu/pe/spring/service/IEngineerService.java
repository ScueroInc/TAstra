package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Engineer;

public interface IEngineerService {

	public boolean Insert(Engineer id);
	public void eliminar(int id);
	public boolean modificar(Engineer engineer);
	public Engineer listarid(int id);
	List<Engineer> listar();
}
