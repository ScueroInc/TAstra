package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="City")
public class City implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_city", nullable = false)
	private int id_city;
	
	@Column(name="name_city", nullable = false, length = 45)
	private String name_city;
	
	public City() {
		super();
	}

	
	
	public City(int id_city, String name_city) {
		super();
		this.id_city = id_city;
		this.name_city = name_city;
	}


	public int getId_city() {
		return id_city;
	}

	public void setId_city(int id_city) {
		this.id_city = id_city;
	}

	public String getName_city() {
		return name_city;
	}

	public void setName_city(String name_city) {
		this.name_city = name_city;
	}
	
	

}
