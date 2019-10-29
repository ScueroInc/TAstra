package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Maquina")
public class Maquina implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idMaquina",nullable = false,length = 40)
	private int idMaquina; 
	
	@Column(name="modeloMaquina",nullable = false,length = 40)
	private String modeloMaquina;
	
	@Column(name="descripcionMaquina",nullable = false,length = 120)
	private String descripcionMaquina;
	
	@Column(name="tipoMaquina",nullable = false,length = 120)
	private String tipoMaquina;
	
	public Maquina(int idMaquina,String modeloMaquina, String descripcionMaquina,String tipoMaquina) {
		super();
		this.idMaquina = idMaquina;
		this.modeloMaquina = modeloMaquina;
		this.descripcionMaquina = descripcionMaquina;
		this.tipoMaquina = tipoMaquina;
	}
	
	public Maquina()
	{
		super();
	}

	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}

	public String getModeloMaquina() {
		return modeloMaquina;
	}

	public void setModeloMaquina(String modeloMaquina) {
		this.modeloMaquina = modeloMaquina;
	}

	public String getDescripcionMaquina() {
		return descripcionMaquina;
	}

	public void setDescripcionMaquina(String descripcionMaquina) {
		this.descripcionMaquina = descripcionMaquina;
	}

	public String getTipoMaquina() {
		return tipoMaquina;
	}

	public void setTipoMaquina(String tipoMaquina) {
		this.tipoMaquina = tipoMaquina;
	}
	

}
