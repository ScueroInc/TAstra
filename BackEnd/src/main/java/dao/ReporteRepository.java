package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import entity.Reporte;


public class ReporteRepository implements IReporteRepository,Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	public ReporteRepository() {
		// TODO Auto-generated constructor stub
	}
	@Override
	@Transactional
	public boolean insert(Reporte t) {
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
	public boolean update(Reporte t) {
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
		Reporte prod = new Reporte();
		try {
			
		prod = em.find(Reporte.class,id);
		em.remove(prod);
		return true; 
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Reporte> ListAll() {
		List<Reporte> lista= new ArrayList<Reporte>();
		try {
			Query q = em.createQuery("select c from Reporte c");
			lista = (List<Reporte>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
	}
	@Override
	public Reporte FinbyId(int id) {
		Reporte pr = new Reporte();
		try {
			pr= em.find(Reporte.class, id);
		
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return pr;
	}
	@Override
	public List<Reporte> findbyname(Reporte t) {
		// TODO Auto-generated method stub
		return null;
	}

}
