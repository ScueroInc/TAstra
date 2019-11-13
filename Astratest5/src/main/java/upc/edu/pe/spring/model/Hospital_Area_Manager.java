package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@DiscriminatorValue("M")
public class Hospital_Area_Manager implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_manager", nullable = false)
	private int id_manager;
	
	@Column(name="amount_requests", nullable = false)
	private int amount_requests;

	
	public Hospital_Area_Manager() {
		super();
	}


	public Hospital_Area_Manager(int id_manager, int amount_requests) {
		super();
		this.id_manager = id_manager;
		this.amount_requests = amount_requests;
	}


	public int getId_manager() {
		return id_manager;
	}


	public void setId_manager(int id_manager) {
		this.id_manager = id_manager;
	}


	public int getAmount_requests() {
		return amount_requests;
	}


	public void setAmount_requests(int amount_requests) {
		this.amount_requests = amount_requests;
	}

	
	
}
