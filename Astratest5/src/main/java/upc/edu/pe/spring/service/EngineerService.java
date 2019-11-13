package upc.edu.pe.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import upc.edu.pe.spring.model.Engineer;
import upc.edu.pe.spring.repository.IEngineerDAO;


@Service
public class EngineerService implements IEngineerService{
	@Autowired
	private IEngineerDAO dEngineer;
	@Override
	@Transactional
	public boolean Insert(Engineer id) {
		Engineer objEngineer=dEngineer.save(id);
		if(objEngineer==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	@Transactional
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dEngineer.delete(id);
	}

	@Override
	@Transactional
	public boolean modificar(Engineer engineer) {
		boolean flag=false;
		try {
			dEngineer.save(engineer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Engineer listarid(int id) {
		// TODO Auto-generated method stub
		return dEngineer.findOne(id);
	}

	@Override
	public List<Engineer> listar() {
		// TODO Auto-generated method stub
		return dEngineer.findAll();
	}
}