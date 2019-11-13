package upc.edu.pe.spring.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Schedule;

public interface IScheduleDAO extends JpaRepository<Schedule, Integer>{
	
	@Query("from Schedule sh where sh.agreed_date like %:agreed_date%")
	List<Schedule> searchDateSchedule(@Param("agreed_date") Date agreed_date);
	
}
