package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;






@Entity
@Table(name="Engineer")
public class Engineer implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_engineer;
	
	@NotEmpty(message = "No puede estar vacío")
	@NotBlank(message = "No puede estar en blanco")
	@Column(name="amount_incidents", nullable = false)
	private int amount_incidents;
	
	@NotEmpty(message = "No puede estar vacío")
	@NotBlank(message = "No puede estar en blanco")
	@Column(name="manger_reviews", nullable = false)
	private int manager_reviews;
	
	@NotEmpty(message = "No puede estar vacío")
	@NotBlank(message = "No puede estar en blanco")
	@Column(name="latitude",length = 60 ,nullable = false)
	private String latitude;
	
	@NotEmpty(message = "No puede estar vacío")
	@NotBlank(message = "No puede estar en blanco")
	@Column(name="longitude",length = 60,nullable = false)
	private String longitude;
	
	public Engineer(int id_engineer,int amount_incidents,int manager_reviews
			,String latitude, String longitude) {
		super();
		this.id_engineer = id_engineer;
		this.amount_incidents = amount_incidents;
		this.manager_reviews = manager_reviews;
		this.latitude= latitude;
		this.longitude = longitude;
	}

	public Engineer() {
		// TODO Auto-generated constructor stub
	}

	public int getId_engineer() {
		return id_engineer;
	}

	public void setId_engineer(int id_engineer) {
		this.id_engineer = id_engineer;
	}

	public int getAmount_incidents() {
		return amount_incidents;
	}

	public void setAmount_incidents(int amount_incidents) {
		this.amount_incidents = amount_incidents;
	}

	public int getManager_reviews() {
		return manager_reviews;
	}

	public void setManager_reviews(int manager_reviews) {
		this.manager_reviews = manager_reviews;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	


	
	
	

}