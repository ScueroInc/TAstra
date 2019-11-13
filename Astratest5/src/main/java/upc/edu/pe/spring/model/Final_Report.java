package upc.edu.pe.spring.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="Final_Report")
public class Final_Report implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_report", nullable = false)
	private int id_report;
	
	@ManyToOne
	@JoinColumn(name="id_administrator",nullable = false)
	private Administrator id_administrator;
	
	@Column(name="description", nullable = false)
	private String description;
	
	@NotNull
	@Past(message = "No puede seleccionar un día que todavía no existe")
	@Temporal(TemporalType.DATE)
	@Column(name="report_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date report_date;
	
	@ManyToOne
	@JoinColumn(name="id_review",nullable = false)
	private Machine_Review id_review;

	public Final_Report() {
		super();
	}

	public Final_Report(int id_report, Administrator id_administrator, String description,
			@NotNull @Past(message = "No puede seleccionar un día que todavía no existe") Date report_date,
			Machine_Review id_review) {
		super();
		this.id_report = id_report;
		this.id_administrator = id_administrator;
		this.description = description;
		this.report_date = report_date;
		this.id_review = id_review;
	}

	public int getId_report() {
		return id_report;
	}

	public void setId_report(int id_report) {
		this.id_report = id_report;
	}

	public Administrator getId_administrator() {
		return id_administrator;
	}

	public void setId_administrator(Administrator id_administrator) {
		this.id_administrator = id_administrator;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getReport_date() {
		return report_date;
	}

	public void setReport_date(Date report_date) {
		this.report_date = report_date;
	}

	public Machine_Review getId_review() {
		return id_review;
	}

	public void setId_review(Machine_Review id_review) {
		this.id_review = id_review;
	}
	
	

}
