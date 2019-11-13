package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.User;
import upc.edu.pe.spring.repository.IUserDAO;



public class UserService implements IUserService{

	private IUserDAO dUser;
	@Override
	public boolean Insert(User id) {
		User objUser=dUser.save(id);
		if(objUser==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dUser.delete(id);
	}

	@Override
	public boolean modificar(User user) {
		boolean flag=false;
		try {
			dUser.save(user);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public User listarid(int id) {
		// TODO Auto-generated method stub
		return dUser.findOne(id);
	}

	@Override
	public List<User> listar() {
		// TODO Auto-generated method stub
		return dUser.findAll();
	}

	

}
