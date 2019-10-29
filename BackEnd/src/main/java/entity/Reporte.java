package entity;

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
@Table(name="Reporte")
public class Reporte implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReporte;
	
	@Column(name="descripcionReporte",nullable = false,length = 120)
	private String descripcionReporte;
	
	@Column(name="fechaReporte",nullable = false,length = 40)
	private String fechaReporte;
	
	@ManyToOne
	@JoinColumn(name="idRevision",nullable = false)
	private Revision revision;
	
	public Reporte(int idReporte,String descripcionReporte,String fechaReporte, Revision revision) {
		super();
		this.idReporte = idReporte;
		this.descripcionReporte = descripcionReporte;
		this.fechaReporte = fechaReporte;
		this.revision = revision ;
	}
	
	public Reporte() {
		super();
	}

	public int getIdReporte() {
		return idReporte;
	}

	public void setIdReporte(int idReporte) {
		this.idReporte = idReporte;
	}

	public String getDescripcionReporte() {
		return descripcionReporte;
	}

	public void setDescripcionReporte(String descripcionReporte) {
		this.descripcionReporte = descripcionReporte;
	}

	public String getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(String fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public Revision getRevision() {
		return revision;
	}

	public void setRevision(Revision revision) {
		this.revision = revision;
	}

}
