package upc.edu.pe.spring.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Area_Hospital")
public class Area_Hospital implements Serializable
{
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_area", nullable = false)
	private int id_area;
	
	@Column(name="name_area_hospital",length = 50,nullable = false)
	private String name_area_hospital;
	
	@Column(name="description",length = 50,nullable = true)
	private String description;
	
	public Area_Hospital() {
		super();
	}

	public Area_Hospital(int id_area, String name_area_hospital, String description) {
		super();
		this.id_area = id_area;
		this.name_area_hospital = name_area_hospital;
		this.description = description;
	}

	public int getId_area() {
		return id_area;
	}

	public void setId_area(int id_area) {
		this.id_area = id_area;
	}

	public String getName_area_hospital() {
		return name_area_hospital;
	}

	public void setName_area_hospital(String name_area_hospital) {
		this.name_area_hospital = name_area_hospital;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
