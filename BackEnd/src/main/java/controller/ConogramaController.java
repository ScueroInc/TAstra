package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


import entity.Cronograma;
import entity.Empleado;
import entity.Encargado;
import entity.Pedido;
import services.ICronogramaService;
import services.IEncargadoService;
import services.IPedidoService;
import services.IEmpleadoService;

@Named
@SessionScoped
public class ConogramaController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IEmpleadoService empleadoService;
	
	@Inject
	private IEncargadoService encargadoService;
	
	@Inject
	private IPedidoService pedidoService;
	
	@Inject
	private ICronogramaService cronogramaService;
	
	
	private Encargado encargado;
	private List<Encargado> listaEncargados;
	
	private Pedido pedido;
	private List<Pedido> listaPedidos;
	
	private Empleado empleado;
	private List<Empleado> listaEmpleados;
	
	private Cronograma cronograma;
	private List<Cronograma> listaCronogramas;
	
	@PostConstruct
	public void init() {
		pedido= new Pedido();
		empleado = new Empleado();
		encargado = new Encargado();
		cronograma = new Cronograma();
		
		listaPedidos = new ArrayList<Pedido>();
		listaEmpleados = new ArrayList<Empleado>();
		listaCronogramas = new ArrayList<Cronograma>();
		this.listarCronograma();
		this.listarEmpleado();
		this.listarPedido();
		this.listarEncargado();
		
	}

	public String nuevoCronograma() {
		this.setCronograma(new Cronograma());
		return "cronograma.xhtml";
	}

	
	public void insertarActualizar() {
		try {
			if (cronograma.getIdCronograma() > 0) {
				cronogramaService.update(cronograma);
				limpiarCronograma();
			} else {
				cronogramaService.insert(cronograma);
				limpiarCronograma();
			}
			this.listarCronograma();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void eliminar(Cronograma cronograma) {
		try {
			cronogramaService.delete(cronograma.getIdCronograma());
			listarCronograma();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarCronograma() {
		try {
			listaCronogramas = cronogramaService.ListAll();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarEmpleado() {
		try {
			listaEmpleados= empleadoService.ListAll();
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

	public void mostrar(Cronograma p) {
		try {
			this.empleado.setIdEmpleado(p.getEmpleado().getIdEmpleado());
			this.empleado.setNameEmpleado(p.getEmpleado().getNameEmpleado());
			
			this.pedido.setIdPedido(p.getPedido().getIdPedido());
			this.pedido.setFechaPedido(p.getPedido().getFechaPedido());
			this.encargado.setNameEncargado(p.getPedido().getEncargado().getNameEncargado());
			this.pedido.setPrioridadPedido(p.getPedido().getPrioridadPedido());

			this.cronograma.setIdCronograma(p.getIdCronograma());
			this.cronograma.setFechaCronograma(p.getFechaCronograma());
			this.cronograma.setEmpleado(empleado);
			this.cronograma.setPedido(pedido);
			

		} catch (Exception e) {
			e.getStackTrace();
		}
	}



	public void limpiarCronograma() {
		this.init();
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

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Cronograma getCronograma() {
		return cronograma;
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

	public void setCronograma(Cronograma cronograma) {
		this.cronograma = cronograma;
	}

	public List<Cronograma> getListaCronogramas() {
		return listaCronogramas;
	}

	public void setListaCronogramas(List<Cronograma> listaCronogramas) {
		this.listaCronogramas = listaCronogramas;
	}

	
}
