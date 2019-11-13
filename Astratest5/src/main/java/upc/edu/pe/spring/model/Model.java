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
@Table(name ="Model")
public class Model implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_model", nullable = false)
	private int id_model;
	
	@Column(name="name_model",length = 60,nullable = false)
	private String name_model;
	
	@Column(name="velocity_model",nullable = false)
	private int velocity_model;
	
	@Column(name="voltage",nullable = false)
	private int voltage;
	
	@Column(name="weight",nullable = false)
	private int weight;
	
	@Column(name="width",nullable = false)
	private int width;
	
	@Column(name="tall",nullable = false)
	private int tall;
	
	@ManyToOne
	@JoinColumn(name="id_brand",nullable = false)
	private Brand id_brand;
	
	public Model() {
		super();
	}

	public Model(int id_model, String name_model, int velocity_model, int voltage, int weight, int width, int tall,
			Brand id_brand) {
		super();
		this.id_model = id_model;
		this.name_model = name_model;
		this.velocity_model = velocity_model;
		this.voltage = voltage;
		this.weight = weight;
		this.width = width;
		this.tall = tall;
		this.id_brand = id_brand;
	}

	public int getId_model() {
		return id_model;
	}

	public void setId_model(int id_model) {
		this.id_model = id_model;
	}

	public String getName_model() {
		return name_model;
	}

	public void setName_model(String name_model) {
		this.name_model = name_model;
	}

	public int getVelocity_model() {
		return velocity_model;
	}

	public void setVelocity_model(int velocity_model) {
		this.velocity_model = velocity_model;
	}

	public int getVoltage() {
		return voltage;
	}

	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public Brand getId_brand() {
		return id_brand;
	}

	public void setId_brand(Brand id_brand) {
		this.id_brand = id_brand;
	}
	

}
