package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.IEncargadoRepository;
import entity.Encargado;

@Named
public class EncargadoService implements IEncargadoService,Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IEncargadoRepository endao;
	public EncargadoService() {
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

	@Override
	public List<Encargado> ListAll() {
	 return endao.ListAll();
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
