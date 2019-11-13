package upc.edu.pe.spring.service;

import java.util.List;

import upc.edu.pe.spring.model.Order;



public interface IOrderService {

	public boolean Insert(Order id);
	public void eliminar(int id);
	public boolean modificar(Order order);
	public Order listarid(int id);
	List<Order> listar();
}
