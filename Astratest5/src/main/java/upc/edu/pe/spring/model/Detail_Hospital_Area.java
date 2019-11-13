package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Detail_Hospital_Area")
public class Detail_Hospital_Area implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="id_hospital", nullable = false)
	private Hospital id_hospital;
	
	@ManyToOne
	@JoinColumn(name="id_area", nullable = false)
	private Area_Hospital id_area;
	
	@ManyToOne
	@JoinColumn(name="id_manager", nullable = false)
	private Hospital_Area_Manager id_manager;
	
	
	public Detail_Hospital_Area() {
		super();
	}


	public Detail_Hospital_Area(Hospital id_hospital, Area_Hospital id_area, Hospital_Area_Manager id_manager) {
		super();
		this.id_hospital = id_hospital;
		this.id_area = id_area;
		this.id_manager = id_manager;
	}


	public Hospital getId_hospital() {
		return id_hospital;
	}


	public void setId_hospital(Hospital id_hospital) {
		this.id_hospital = id_hospital;
	}


	public Area_Hospital getId_area() {
		return id_area;
	}


	public void setId_area(Area_Hospital id_area) {
		this.id_area = id_area;
	}


	public Hospital_Area_Manager getId_manager() {
		return id_manager;
	}


	public void setId_manager(Hospital_Area_Manager id_manager) {
		this.id_manager = id_manager;
	}
	
	

}
