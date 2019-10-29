package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.IMaquinaRepository;
import entity.Maquina;

@Named
public class MaquinaService implements IMaquinaService,Serializable{

	private static final long serialVersionUID = 1L;
	@Inject
	private IMaquinaRepository mdao;
	@Override
	public boolean insert(Maquina t) {
	  
		return mdao.insert(t);
	}

	@Override
	public boolean update(Maquina t) {
		
		return mdao.update(t);
	}

	@Override
	public boolean delete(int id) {
		
		return mdao.delete(id);
	}

	@Override
	public List<Maquina> ListAll() {
		
		return mdao.ListAll();
	}

	@Override
	public Maquina FinbyId(int id) {
		
		return mdao.FinbyId(id);
	}

	@Override
	public List<Maquina> findbyname(Maquina t) {
		
		return null;
	}

}
