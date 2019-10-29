package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


import entity.Encargado;
import entity.Pedido;
import services.IEncargadoService;
import services.IPedidoService;

@Named
@SessionScoped
public class PedidoController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IEncargadoService encargadoService;
	
	@Inject
	private IPedidoService pedidoService;
	
	private Encargado encargado;
	private List<Encargado> listaEncargados;
	
	private Pedido pedido;
	private List<Pedido> listaPedidos;
	
	@PostConstruct
	public void init() {
		encargado = new Encargado();
        pedido = new Pedido();
		
		listaEncargados = new ArrayList<Encargado>();
		listaPedidos = new ArrayList<Pedido>();
		this.listarEncargado();
		this.listarPedido();	
	}
	
	public String nuevoPedido() {
		this.setPedido(new Pedido());
		return "pedido.xhtml";
	}
	
	public void insertarActualizar() {
		try {
			if (pedido.getIdPedido() > 0) {
				pedidoService.update(pedido);
				limpiarPedido();
			} else {
				pedidoService.insert(pedido);
				limpiarPedido();
			}
			this.listarPedido();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminar(Pedido t) {
		try {
			pedidoService.delete(t.getIdPedido());
			listarPedido();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listarPedido() {
		try {
			listaPedidos= pedidoService.ListAll();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listarEncargado() {
		try {
			listaEncargados= encargadoService.ListAll();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void mostrar(Pedido p)
	{
		try {
		this.encargado.setIdEncargado(p.getEncargado().getIdEncargado());
		this.encargado.setNameEncargado(p.getEncargado().getNameEncargado());
		
		this.pedido.setIdPedido(p.getIdPedido());
		this.pedido.setFechaPedido(p.getFechaPedido());
		this.pedido.setEncargado(encargado);
		this.pedido.setPrioridadPedido(p.getPrioridadPedido());
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void limpiarPedido() {
		this.init();
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}

	public List<Encargado> getListaEncargados() {
		return listaEncargados;
	}

	public void setListaEncargados(List<Encargado> listaEncargados) {
		this.listaEncargados = listaEncargados;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(List<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}
	

}
