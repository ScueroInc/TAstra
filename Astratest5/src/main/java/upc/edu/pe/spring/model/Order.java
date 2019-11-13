package upc.edu.pe.spring.model;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="Order")
public class Order implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_order", nullable = false)
	private int id_order;
	
	@Column(name="priority", nullable = false)
	private int priority;
	

	@NotNull
	@Past(message = "No puede seleccionar un día que todavía no existe")
	@Temporal(TemporalType.DATE)
	@Column(name="date_order")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_order;
	
	@ManyToOne
	@JoinColumn(name="id_manager",nullable = false)
	private Hospital_Area_Manager id_manager;
	
	public Order() {
		super();
	}

	public Order(int id_order, int priority,
			@NotNull @Past(message = "No puede seleccionar un día que todavía no existe") Date date_order,
			Hospital_Area_Manager id_manager) {
		super();
		this.id_order = id_order;
		this.priority = priority;
		this.date_order = date_order;
		this.id_manager = id_manager;
	}

	public int getId_order() {
		return id_order;
	}

	public void setId_order(int id_order) {
		this.id_order = id_order;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getDate_order() {
		return date_order;
	}

	public void setDate_order(Date date_order) {
		this.date_order = date_order;
	}

	public Hospital_Area_Manager getId_manager() {
		return id_manager;
	}

	public void setId_manager(Hospital_Area_Manager id_manager) {
		this.id_manager = id_manager;
	}
	
	

}
