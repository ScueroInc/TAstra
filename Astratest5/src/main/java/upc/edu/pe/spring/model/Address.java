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
@Table(name ="Address")
public class Address  implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_city", nullable = false)
	private int id_address;
	
	@ManyToOne
	@JoinColumn(name = "id_district", nullable = false)
	private District id_district;
	
	@ManyToOne
	@JoinColumn(name = "id_via", nullable = false)
	private Tipo_via id_via;

	public Address() {
		super();
	}

	public Address(int id_address, District id_district, Tipo_via id_via) {
		super();
		this.id_address = id_address;
		this.id_district = id_district;
		this.id_via = id_via;
	}

	public int getId_address() {
		return id_address;
	}

	public void setId_address(int id_address) {
		this.id_address = id_address;
	}

	public District getId_district() {
		return id_district;
	}

	public void setId_district(District id_district) {
		this.id_district = id_district;
	}

	public Tipo_via getId_via() {
		return id_via;
	}

	public void setId_via(Tipo_via id_via) {
		this.id_via = id_via;
	}
	
	

}
