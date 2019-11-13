package upc.edu.pe.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import upc.edu.pe.spring.model.Administrator;
import upc.edu.pe.spring.repository.IAdministratorDAO;

@Service
public class AdministratorService implements IAdministratorService{

	private IAdministratorDAO dAdministrator;
	@Override
	public boolean insert(Administrator administrator) {
		Administrator objAdministrator = dAdministrator.save(administrator);
		if(objAdministrator==null)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean modificar(Administrator administrator) {
		boolean flag = false;
		try {
			dAdministrator.save(administrator);
			flag=true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		 return flag;
	}

	@Override
	@Transactional
	public void eliminar(int idAdministrator) {


		
	}

	@Override
	public Administrator listarId(int idAdministrator) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Administrator> listar() {
		
		return dAdministrator.findAll();
	}

	@Override
	public List<Administrator> buscarNombre(String nameAdministrator) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
