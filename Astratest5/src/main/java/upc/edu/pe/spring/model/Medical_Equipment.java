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
@Table(name ="Medical_Equipment")
public class Medical_Equipment  implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_medical_equipment", nullable = false)
	private int id_medical_equipment;
	
	@ManyToOne
	@JoinColumn(name="id_model", nullable = false)
	private Model id_model;
	
	@Column(name="state_description", nullable = false)
	private String state_description;
	
	@ManyToOne
	@JoinColumn(name="id_manager", nullable = false)
	private Hospital_Area_Manager id_manager;
	

	public Medical_Equipment() {
		super();
	}


	public Medical_Equipment(int id_medical_equipment, Model id_model, String state_description,
			Hospital_Area_Manager id_manager) {
		super();
		this.id_medical_equipment = id_medical_equipment;
		this.id_model = id_model;
		this.state_description = state_description;
		this.id_manager = id_manager;
	}


	public int getId_medical_equipment() {
		return id_medical_equipment;
	}


	public void setId_medical_equipment(int id_medical_equipment) {
		this.id_medical_equipment = id_medical_equipment;
	}


	public Model getId_model() {
		return id_model;
	}


	public void setId_model(Model id_model) {
		this.id_model = id_model;
	}


	public String getState_description() {
		return state_description;
	}


	public void setState_description(String state_description) {
		this.state_description = state_description;
	}


	public Hospital_Area_Manager getId_manager() {
		return id_manager;
	}


	public void setId_manager(Hospital_Area_Manager id_manager) {
		this.id_manager = id_manager;
	}
	

}
