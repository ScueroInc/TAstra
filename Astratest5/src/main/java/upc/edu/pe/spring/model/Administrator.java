package upc.edu.pe.spring.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue("A")

public class Administrator extends User implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Column(name="quantity_incidents", nullable = false)
	private int quantity_incidents;
	
	@Column(name="id_plan", nullable = false)
	private Membership id_plan;
	
	

}
