package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Brand")
public class Brand implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_brand", nullable = false)
	private int id_brand;
	
	@Column(name="name_brand",length = 70,nullable = false)
	private String name_brand;
	
	
	public Brand() {
		super();
	}


	public Brand(int id_brand, String name_brand) {
		super();
		this.id_brand = id_brand;
		this.name_brand = name_brand;
	}


	public int getId_brand() {
		return id_brand;
	}


	public void setId_brand(int id_brand) {
		this.id_brand = id_brand;
	}


	public String getName_brand() {
		return name_brand;
	}


	public void setName_brand(String name_brand) {
		this.name_brand = name_brand;
	}
	

}
