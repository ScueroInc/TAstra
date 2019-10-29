package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Encargado;

public class EncargadoRepository implements IEncargadoRepository,Serializable {

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	public EncargadoRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean insert(Encargado t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Encargado t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Encargado> ListAll() {
		List<Encargado> lista= new ArrayList<Encargado>();
		try {
			Query q = em.createQuery("select c from Encargado c");
			lista = (List<Encargado>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
	}

	@Override
	public Encargado FinbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Encargado> findbyname(Encargado t) {
		// TODO Auto-generated method stub
		return null;
	}

}
