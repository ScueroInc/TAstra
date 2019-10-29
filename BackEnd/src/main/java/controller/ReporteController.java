package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import entity.Empleado;
import entity.Pedido;
import entity.Reporte;
import entity.Revision;
import services.IEmpleadoService;
import services.IPedidoService;
import services.IReporteService;
import services.IRevisionService;

@Named
@SessionScoped

public class ReporteController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IEmpleadoService empleadoService;

	@Inject
	private IPedidoService pedidoService;
	
	@Inject
	private IRevisionService revisionService;
	
	@Inject
	private IReporteService reporteService;
	
	private Reporte reporte;
	private List<Reporte> listaReportes;
	
	private Revision revision;
	private List<Revision> listaRevisiones;
	
	private Pedido pedido;
	private List<Pedido> listaPedidos;
	
	
	private Empleado empleado;
	private List<Empleado> listaEmpleados;
	
	@PostConstruct
	public void init() {
		
		revision = new Revision();
		reporte = new Reporte();
		empleado = new Empleado();
		pedido = new Pedido();
		listaRevisiones= new ArrayList<Revision>();
		listaReportes = new ArrayList<Reporte>();
		this.listarReporte();
		this.listarRevision();
		this.listarEmpleado();
		this.listarPedido();

	}
	
	public String nuevoReporte() {
		this.setReporte(new Reporte());
		return "reporte.xhtml";
	}
	
	public void insertarActualizar() {
		try {
			if (reporte.getIdReporte() > 0) {
				reporteService.update(reporte);
				limpiarReporte();
			} else {
				reporteService.insert(reporte);
				limpiarReporte();
			}
			this.listarReporte();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	
	public void eliminar(Reporte t) {
		try {
			reporteService.delete(t.getIdReporte());
			listarReporte();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listarReporte() {
		try {
			listaReportes = reporteService.ListAll();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void listarRevision() {
		try {
			listaRevisiones = revisionService.ListAll();
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
	
	
	public void mostrar(Reporte p) {
		try {
			this.revision.setIdRevision(p.getRevision().getIdRevision());
			this.revision.setFechaRevision(p.getRevision().getFechaRevision());
			this.revision.setDescripcionRevision(p.getRevision().getDescripcionRevision());
			this.empleado.setNameEmpleado(p.getRevision().getEmpleado().getNameEmpleado());
			this.pedido.setIdPedido(p.getRevision().getPedido().getIdPedido());
			
			this.reporte.setIdReporte(p.getIdReporte());
			this.reporte.setDescripcionReporte(p.getDescripcionReporte());
			this.reporte.setFechaReporte(p.getFechaReporte());
			this.reporte.setRevision(revision);
			

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public void limpiarReporte() {
		this.init();
	}

	public Revision getRevision() {
		return revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

	public List<Revision> getListaRevisiones() {
		return listaRevisiones;
	}

	public void setListaRevisiones(List<Revision> listaRevisiones) {
		this.listaRevisiones = listaRevisiones;
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

	public Reporte getReporte() {
		return reporte;
	}

	public void setReporte(Reporte reporte) {
		this.reporte = reporte;
	}

	public List<Reporte> getListaReportes() {
		return listaReportes;
	}

	public void setListaReportes(List<Reporte> listaReportes) {
		this.listaReportes = listaReportes;
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
	

	}


