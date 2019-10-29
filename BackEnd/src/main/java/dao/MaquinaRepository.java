package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import entity.Maquina;

public class MaquinaRepository  implements IMaquinaRepository , Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	
	public MaquinaRepository() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public boolean insert(Maquina t) {
		try {
			em.persist(t);
			return true;
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return false;
	}

	@Override
	@Transactional
	public boolean update(Maquina t) {
		try {
			em.merge(t);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return false;
	}

	@Override
	@Transactional
	public boolean delete(int id) {
		Maquina prod = new Maquina();
		try {
			
		prod = em.find(Maquina.class,id);
		em.remove(prod);
		return true; 
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Maquina> ListAll() {
		List<Maquina> lista= new ArrayList<Maquina>();
		try {
			Query q = em.createQuery("select c from Maquina c");
			lista = (List<Maquina>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
	}

	@Override
	public Maquina FinbyId(int id) {
		Maquina pr = new Maquina();
		try {
			pr= em.find(Maquina.class, id);
		
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return pr;
	}

	@Override
	public List<Maquina> findbyname(Maquina t) {
		// TODO Auto-generated method stub
		return null;
	}

}
