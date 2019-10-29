package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;


import entity.Pedido;

public class PedidoRepository implements IPedidoRepository,Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	

	@Override
	@Transactional
	public boolean insert(Pedido t) {
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
	public boolean update(Pedido t) {
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
		Pedido prod = new Pedido();
		try {
			
		prod = em.find(Pedido.class,id);
		em.remove(prod);
		return true; 
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pedido> ListAll() {
		List<Pedido> lista= new ArrayList<Pedido>();
		try {
			Query q = em.createQuery("select c from Pedido c");
			lista = (List<Pedido>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
	}

	@Override
	public Pedido FinbyId(int id) {
		Pedido pr = new Pedido();
		try {
			pr= em.find(Pedido.class, id);
		
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return pr;
	}

	@Override
	public List<Pedido> findbyname(Pedido t) {
		// TODO Auto-generated method stub
		return null;
	}

}
