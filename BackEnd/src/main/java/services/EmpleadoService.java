package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.IEmpleadoRepository;
import entity.Empleado;

@Named
public class EmpleadoService implements IEmpleadoService ,Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEmpleadoRepository edao;
	public EmpleadoService() {
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

	@Override
	public List<Empleado> ListAll() {
		return edao.ListAll();
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
