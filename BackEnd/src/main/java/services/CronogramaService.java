package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.ICronogramaRepository;
import entity.Cronograma;

@Named
public class CronogramaService implements ICronogramaService,Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICronogramaRepository cpdao;
	

	@Override
	public boolean insert(Cronograma t) {
		
		return cpdao.insert(t);
	}

	@Override
	public boolean update(Cronograma t) {
		return cpdao.update(t);
	}

	@Override
	public boolean delete(int id) {
		
		return cpdao.delete(id);
	}

	@Override
	public List<Cronograma> ListAll() {
		
		return cpdao.ListAll();
	}

	@Override
	public Cronograma FinbyId(int id) {
	
		return cpdao.FinbyId(id);
	}

	@Override
	public List<Cronograma> findbyname(Cronograma t) {
		
		return cpdao.findbyname(t);
	}

}
