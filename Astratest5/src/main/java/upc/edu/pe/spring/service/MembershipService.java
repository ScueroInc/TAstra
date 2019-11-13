package upc.edu.pe.spring.service;
import java.util.List;

import upc.edu.pe.spring.model.Membership;
import upc.edu.pe.spring.repository.IMembershipDAO;



public class MembershipService implements IMembershipService{

	private IMembershipDAO dMembership;
	@Override
	public boolean Insert(Membership id) {
		Membership objMembership=dMembership.save(id);
		if(objMembership==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dMembership.delete(id);
	}

	@Override
	public boolean modificar(Membership membership) {
		boolean flag=false;
		try {
			dMembership.save(membership);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Membership listarid(int id) {
		// TODO Auto-generated method stub
		return dMembership.findOne(id);
	}

	@Override
	public List<Membership> listar() {
		// TODO Auto-generated method stub
		return dMembership.findAll();
	}

	

}
