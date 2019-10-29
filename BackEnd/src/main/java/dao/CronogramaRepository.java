package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import entity.Cronograma;


public class CronogramaRepository implements ICronogramaRepository,Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	
	@Override
	@Transactional
	public boolean insert(Cronograma t) {
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
	public boolean update(Cronograma t) {
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
		Cronograma prod = new Cronograma();
		try {
			
		prod = em.find(Cronograma.class,id);
		em.remove(prod);
		return true; 
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Cronograma> ListAll() {
		List<Cronograma> lista= new ArrayList<Cronograma>();
		try {
			Query q = em.createQuery("select c from Cronograma c");
			lista = (List<Cronograma>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
	}
	
	@Override
	public Cronograma FinbyId(int id) {
		Cronograma pr = new Cronograma();
		try {
			pr= em.find(Cronograma.class, id);
		
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return pr;
	}
	
	@Override
	public List<Cronograma> findbyname(Cronograma t) {
		List<Cronograma> lista= new ArrayList<Cronograma>();
		return lista;
	}
	
}
