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
@Table(name="Cronograma")
public class Cronograma implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCronograma;
	
	@Column(name="fechaCronograma",nullable = false,length = 40)
	private String fechaCronograma;
	
	@ManyToOne
	@JoinColumn(name="idEmpleado",nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name="idPeticion",nullable = false)
	private Pedido pedido;

	public Cronograma( int idCronograma, String fechaCronograma,Empleado empleado, Pedido pedido) {
		super();
		this.idCronograma = idCronograma;
		this.fechaCronograma = fechaCronograma;
		this.empleado = empleado;
		this.pedido = pedido;
	}

	public Cronograma() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCronograma() {
		return idCronograma;
	}

	public void setIdCronograma(int idCronograma) {
		this.idCronograma = idCronograma;
	}

	public String getFechaCronograma() {
		return fechaCronograma;
	}

	public void setFechaCronograma(String fechaCronograma) {
		this.fechaCronograma = fechaCronograma;
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
