package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.IReporteRepository;
import entity.Reporte;

@Named
public class ReporteService implements IReporteService,Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IReporteRepository rdao;

	@Override
	public boolean insert(Reporte t) {
		
		return rdao.insert(t);
	}

	@Override
	public boolean update(Reporte t) {
		
		return rdao.update(t);
	}

	@Override
	public boolean delete(int id) {
		
		return rdao.delete(id);
	}

	@Override
	public List<Reporte> ListAll() {
		
		return rdao.ListAll();
	}

	@Override
	public Reporte FinbyId(int id) {
		
		return rdao.FinbyId(id);
	}

	@Override
	public List<Reporte> findbyname(Reporte t) {
		// TODO Auto-generated method stub
		return null;
	}

}
