package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Tipo_via;
import upc.edu.pe.spring.repository.ITipo_ViaDAO;




public class Tipo_ViaService implements ITipo_ViaService{

	private ITipo_ViaDAO dTipo_Via;
	@Override
	public boolean Insert(Tipo_via id) {
		Tipo_via objTipo_via=dTipo_Via.save(id);
		if(objTipo_via==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dTipo_Via.delete(id);
	}

	@Override
	public boolean modificar(Tipo_via tipo_via) {
		boolean flag=false;
		try {
			dTipo_Via.save(tipo_via);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Tipo_via listarid(int id) {
		// TODO Auto-generated method stub
		return dTipo_Via.findOne(id);
	}

	@Override
	public List<Tipo_via> listar() {
		// TODO Auto-generated method stub
		return dTipo_Via.findAll();
	}

	
	

}
