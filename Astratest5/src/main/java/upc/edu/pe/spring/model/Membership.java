package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Membership")
public class Membership implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_plan", nullable = false)
	private int id_plan;
	
	@Column(name="name_plan", nullable = false)
	private String name_plan;
	
	@Column(name="quantity_engineers", nullable = false)
	private int quantity_engineers;
	
	@Column(name="price", nullable = false)
	private float price;
	
	public Membership() {
		super();
	}

	public Membership(int id_plan, String name_plan, int quantity_engineers, float price) {
		super();
		this.id_plan = id_plan;
		this.name_plan = name_plan;
		this.quantity_engineers = quantity_engineers;
		this.price = price;
	}

	public int getId_plan() {
		return id_plan;
	}

	public void setId_plan(int id_plan) {
		this.id_plan = id_plan;
	}

	public String getName_plan() {
		return name_plan;
	}

	public void setName_plan(String name_plan) {
		this.name_plan = name_plan;
	}

	public int getQuantity_engineers() {
		return quantity_engineers;
	}

	public void setQuantity_engineers(int quantity_engineers) {
		this.quantity_engineers = quantity_engineers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	

}
