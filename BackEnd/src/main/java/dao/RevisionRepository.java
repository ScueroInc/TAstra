package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import entity.Revision;

public class RevisionRepository implements IRevisionRepository,Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	public RevisionRepository() {
		// TODO Auto-generated constructor stub
	}
	@Override
	@Transactional
	public boolean insert(Revision t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	@Transactional
	public boolean update(Revision t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	@Transactional
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<Revision> ListAll() {
		List<Revision> lista= new ArrayList<Revision>();
		try {
			Query q = em.createQuery("select c from Revision c");
			lista = (List<Revision>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
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
