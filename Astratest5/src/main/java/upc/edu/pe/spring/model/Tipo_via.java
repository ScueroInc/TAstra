package upc.edu.pe.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Tipo_via")
public class Tipo_via implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_via", nullable = false)
	private int id_via;
	
	@Column(name="name_via", nullable = false, length = 50)
	private String name_via;

	public Tipo_via() 
	{
		super();
	}

	public Tipo_via(int id_via, String name_via) {
		super();
		this.id_via = id_via;
		this.name_via = name_via;
	}

	public int getId_via() {
		return id_via;
	}

	public void setId_via(int id_via) {
		this.id_via = id_via;
	}

	public String getName_via() {
		return name_via;
	}

	public void setName_via(String name_via) {
		this.name_via = name_via;
	}
	
	

}
