package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Model;
import upc.edu.pe.spring.repository.IModelDAO;



public class ModelService implements IModelService{

	private IModelDAO dModel;
	@Override
	public boolean Insert(Model id) {
		Model objModel=dModel.save(id);
		if(objModel==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dModel.delete(id);
	}

	@Override
	public boolean modificar(Model model) {
		boolean flag=false;
		try {
			dModel.save(model);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Model listarid(int id) {
		// TODO Auto-generated method stub
		return dModel.findOne(id);
	}

	@Override
	public List<Model> listar() {
		// TODO Auto-generated method stub
		return dModel.findAll();
	}

	

}
