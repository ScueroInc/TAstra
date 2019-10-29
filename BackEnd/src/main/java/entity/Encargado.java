package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Encargado")
public class Encargado implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEncargado",nullable = false,length = 40)
	private int idEncargado; 
	
	@Column(name="nameEncargado",nullable = false,length = 40)
	private String nameEncargado;

	public Encargado(int idEncargado, String nameEncargado) {
		super();
		this.idEncargado = idEncargado;
		this.nameEncargado = nameEncargado;
	}
	
	public Encargado()
	{
		super();
	}
	

	public int getIdEncargado() {
		return idEncargado;
	}

	public void setIdEncargado(int idEncargado) {
		this.idEncargado = idEncargado;
	}

	public String getNameEncargado() {
		return nameEncargado;
	}

	public void setNameEncargado(String nameEncargado) {
		this.nameEncargado = nameEncargado;
	}


	
}
