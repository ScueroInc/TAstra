package upc.edu.pe.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Final_Report;

public interface IFinal_ReportDAO extends JpaRepository<Final_Report,Integer>{
	
	@Query("from Final_Report fr where fr.id_administrator.name_administrator like %:name_administrator%")
	List<Final_Report> searchNameAdministrator(@Param("name_administrator")String name_administrator);
	
	@Query("from Final_Report fr where fr.report_date like %:report_date%")
	List<Final_Report> searchDate(@Param("report_date")Date report_date);	
} 