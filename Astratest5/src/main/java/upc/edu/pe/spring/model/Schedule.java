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
@Table(name ="Schedule")
public class Schedule implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_schedule", nullable = false)
	private int id_schedule;
	
	@NotNull
	@Past(message = "No puede seleccionar un día que todavía no existe")
	@Temporal(TemporalType.DATE)
	@Column(name="agreed_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date agreed_date;
	
	@NotNull
	@Past(message = "No puede seleccionar un día que todavía no existe")
	@Temporal(TemporalType.DATE)
	@Column(name="arrival_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date arrival_date;
	
	@ManyToOne
	@JoinColumn(name="id_order",nullable = false)
	private Order id_order;
	
	@ManyToOne
	@JoinColumn(name="id_engineer",nullable = false)
	private Engineer id_engineer;
	
	@ManyToOne
	@JoinColumn(name=" id_administrator",nullable = false)
	private Administrator id_administrator;
	
	public Schedule() {
		super();
	}

	public Schedule(int id_schedule,
			@NotNull @Past(message = "No puede seleccionar un día que todavía no existe") Date agreed_date,
			@NotNull @Past(message = "No puede seleccionar un día que todavía no existe") Date arrival_date,
			Order id_order, Engineer id_engineer, Administrator id_administrator) {
		super();
		this.id_schedule = id_schedule;
		this.agreed_date = agreed_date;
		this.arrival_date = arrival_date;
		this.id_order = id_order;
		this.id_engineer = id_engineer;
		this.id_administrator = id_administrator;
	}

	public int getId_schedule() {
		return id_schedule;
	}

	public void setId_schedule(int id_schedule) {
		this.id_schedule = id_schedule;
	}

	public Date getAgreed_date() {
		return agreed_date;
	}

	public void setAgreed_date(Date agreed_date) {
		this.agreed_date = agreed_date;
	}

	public Date getArrival_date() {
		return arrival_date;
	}

	public void setArrival_date(Date arrival_date) {
		this.arrival_date = arrival_date;
	}

	public Order getId_order() {
		return id_order;
	}

	public void setId_order(Order id_order) {
		this.id_order = id_order;
	}

	public Engineer getId_engineer() {
		return id_engineer;
	}

	public void setId_engineer(Engineer id_engineer) {
		this.id_engineer = id_engineer;
	}

	public Administrator getId_administrator() {
		return id_administrator;
	}

	public void setId_administrator(Administrator id_administrator) {
		this.id_administrator = id_administrator;
	}

	
	
}
