package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Order;
import upc.edu.pe.spring.repository.IOrderDAO;

public class OrderService implements IOrderService{

	private IOrderDAO dOrder;
	@Override
	public boolean Insert(Order id) {
		Order objOrder=dOrder.save(id);
		if(objOrder==null)
		{
			return false;
		}
		
		return true;
	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dOrder.delete(id);
	}

	@Override
	public boolean modificar(Order order) {
		boolean flag=false;
		try {
			dOrder.save(order);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return flag;
	}

	@Override
	public Order listarid(int id) {
		// TODO Auto-generated method stub
		return dOrder.findOne(id);
	}

	@Override
	public List<Order> listar() {
		// TODO Auto-generated method stub
		return dOrder.findAll();
	}

	

}
