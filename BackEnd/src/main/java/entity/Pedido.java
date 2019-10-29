package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Pedido")
public class Pedido implements Serializable  {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPedido;
	
	@Column(name="fechaPedido",nullable = false,length = 40)
	private String fechaPedido;
	
	@ManyToOne
	@JoinColumn(name="idEncargado",nullable = false)
	private Encargado encargado;
	
	@Column(name="prioridadPedido",nullable = false,length = 40)
	private int prioridadPedido;
	
	public Pedido(int idPedido,String fechaPedido, Encargado encargado,int prioridadPedido) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.encargado = encargado;
		this.prioridadPedido = prioridadPedido;
	}
	
	public String getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getPrioridadPedido() {
		return prioridadPedido;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}



	public void setPrioridadPedido(int prioridadPedido) {
		this.prioridadPedido = prioridadPedido;
	}

	public Encargado getEncargado() {
		return encargado;
	}

	public void setEncargado(Encargado encargado) {
		this.encargado = encargado;
	}

	




}
