 package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.IRevisionRepository;
import entity.Revision;

@Named
public class RevisionService  implements IRevisionService , Serializable{

	

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRevisionRepository rdao;

	@Override
	public boolean insert(Revision t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Revision t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Revision> ListAll() {
		
		return rdao.ListAll();
	}

	@Override
	public Revision FinbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Revision> findbyname(Revision t) {
		// TODO Auto-generated method stub
		return null;
	}

}
