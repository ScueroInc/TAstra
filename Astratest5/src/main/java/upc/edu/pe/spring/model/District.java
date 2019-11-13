package upc.edu.pe.spring.model;

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
@Table(name ="District")
public class District implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_city", nullable = false)
	private int id_district;
	
	
	@Column(name="name_city", nullable = false, length = 50)
	private String name_district;
	
	
	@Column(name="name_district", nullable = false)
	private int id_postal;
	
	@ManyToOne
	@JoinColumn(name = "id_city", nullable = false)
	private City id_city;
	
	public District() {
		super();
	}

	
	
	public District(int id_district, String name_district, int id_postal, City id_city) {
		super();
		this.id_district = id_district;
		this.name_district = name_district;
		this.id_postal = id_postal;
		this.id_city = id_city;
	}



	public int getId_district() {
		return id_district;
	}

	public void setId_district(int id_district) {
		this.id_district = id_district;
	}

	public String getName_district() {
		return name_district;
	}

	public void setName_district(String name_district) {
		this.name_district = name_district;
	}

	public int getId_postal() {
		return id_postal;
	}

	public void setId_postal(int id_postal) {
		this.id_postal = id_postal;
	}

	public City getId_city() {
		return id_city;
	}

	public void setId_city(City id_city) {
		this.id_city = id_city;
	}
	
	

}
