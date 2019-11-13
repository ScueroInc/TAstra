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
@Table(name ="Machine_Review")
public class Machine_Review implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_review", nullable = false)
	private int id_review;
	
	@ManyToOne
	@JoinColumn(name="id_medical_equipment",nullable = false)
	private Medical_Equipment id_medical_equipment;
	
	@ManyToOne
	@JoinColumn(name="id_engineer",nullable = false)
	private Engineer id_engineer;
	
	@NotNull
	@Past(message = "No puede seleccionar un día que todavía no existe")
	@Temporal(TemporalType.DATE)
	@Column(name="review_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date review_date;
	
	@NotNull
	@Past(message = "No puede seleccionar un día que todavía no existe")
	@Temporal(TemporalType.DATE)
	@Column(name="return_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date return_date;
	
	
	//private Blob medical_equipment_photo;
	
	@ManyToOne
	@JoinColumn(name="id_order",nullable = false)
	private Order id_order;
	
	public Machine_Review() {
		super();
	}

}
