package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Revision")

public class Revision implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRevision;
	
	
	@Column(name="fechaRevision",nullable = false,length = 40)
	private String fechaRevision;
	
	@Column(name="descripcionRevision",nullable = false,length = 120)
	private String descripcionRevision;
	
	@ManyToOne
	@JoinColumn(name="idTrabajador",nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name="idPedido",nullable = false)
	private Pedido pedido;
	
	public Revision(int idRevision,String fechaRevision,String descripcionRevision,Empleado empleado,Pedido pedido)
	{
		super();
		this.idRevision = idRevision;
		this.fechaRevision = fechaRevision;
		this.empleado = empleado;
		this.pedido = pedido;
	}

	public Revision() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public String getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(String fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public String getDescripcionRevision() {
		return descripcionRevision;
	}

	public void setDescripcionRevision(String descripcionRevision) {
		this.descripcionRevision = descripcionRevision;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
