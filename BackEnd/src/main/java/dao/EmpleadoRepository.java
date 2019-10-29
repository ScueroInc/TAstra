package dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Empleado;

public class EmpleadoRepository implements IEmpleadoRepository ,Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(name="OPEN_SOURCE")
	private EntityManager em;
	public EmpleadoRepository() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean insert(Empleado t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(Empleado t) {
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
	public List<Empleado> ListAll() {
		List<Empleado> lista= new ArrayList<Empleado>();
		try {
			Query q = em.createQuery("select c from Empleado c");
			lista = (List<Empleado>)q.getResultList();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		
		return lista;
	}
	@Override
	public Empleado FinbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Empleado> findbyname(Empleado t) {
		// TODO Auto-generated method stub
		return null;
	}

}
