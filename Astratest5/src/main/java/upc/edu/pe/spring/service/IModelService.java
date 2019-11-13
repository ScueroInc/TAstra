package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Model;



public interface IModelService {

	public boolean Insert(Model id);
	public void eliminar(int id);
	public boolean modificar(Model model);
	public Model listarid(int id);
	List<Model> listar();
}
