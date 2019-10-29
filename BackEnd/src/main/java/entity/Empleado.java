package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idEmpleado",nullable = false,length = 40)
	private int idEmpleado; 
	
	@Column(name="nameEmpleado",nullable = false,length = 40)
	private String nameEmpleado;

	public Empleado(int idEmpleado, String nameEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.nameEmpleado = nameEmpleado;
	}
	public Empleado() {
		super();
	}
	
	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNameEmpleado() {
		return nameEmpleado;
	}
	public void setNameEmpleado(String nameEmpleado) {
		this.nameEmpleado = nameEmpleado;
	}
	


}
