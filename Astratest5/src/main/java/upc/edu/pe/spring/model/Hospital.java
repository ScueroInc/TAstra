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
@Table(name ="Hospital")
public class Hospital implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_via", nullable = false)
	private int id_hospital;
	
	
	@Column(name="name_hospital",length = 50,nullable = false)
	private String name_hospital;
	
	@Column(name="ruc_hospital", nullable = false)
	private int ruc_hospital;
	
	@ManyToOne
	@JoinColumn(name="id_address", nullable = false)
	private Address id_address;

	public Hospital() {
		super();
	}

	public Hospital(int id_hospital, String name_hospital, int ruc_hospital, Address id_address) {
		super();
		this.id_hospital = id_hospital;
		this.name_hospital = name_hospital;
		this.ruc_hospital = ruc_hospital;
		this.id_address = id_address;
	}

	public int getId_hospital() {
		return id_hospital;
	}

	public void setId_hospital(int id_hospital) {
		this.id_hospital = id_hospital;
	}

	public String getName_hospital() {
		return name_hospital;
	}

	public void setName_hospital(String name_hospital) {
		this.name_hospital = name_hospital;
	}

	public int getRuc_hospital() {
		return ruc_hospital;
	}

	public void setRuc_hospital(int ruc_hospital) {
		this.ruc_hospital = ruc_hospital;
	}

	public Address getId_address() {
		return id_address;
	}

	public void setId_address(Address id_address) {
		this.id_address = id_address;
	}

	
	
}
