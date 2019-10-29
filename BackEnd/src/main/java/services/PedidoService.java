package services;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import dao.IPedidoRepository;
import entity.Pedido;

@Named
public class PedidoService implements IPedidoService,Serializable {

	
	private static final long serialVersionUID = 1L;
	@Inject
	private IPedidoRepository pdao;
	
	@Override
	public boolean insert(Pedido t) {
		 return pdao.insert(t);
	}

	@Override
	public boolean update(Pedido t) {
		
		return pdao.update(t);
	}

	@Override
	public boolean delete(int id) {
		
		return pdao.delete(id);
	}

	@Override
	public List<Pedido> ListAll() {
		
		return pdao.ListAll();
	}

	@Override
	public Pedido FinbyId(int id) {
	
		return pdao.FinbyId(id);
	}

	@Override
	public List<Pedido> findbyname(Pedido t) {
		// TODO Auto-generated method stub
		return null;
	}

}
