package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Hospital_Area_Manager;

public interface IHospital_Area_ManagerDAO extends JpaRepository<Hospital_Area_Manager,Integer>{	
	
	@Query("from Hospital_Area_Manager ham where ham.amount_requests like %:amount_requests%")
	List<Hospital_Area_Manager> searchAmountRequest(@Param("amount_requests")int amount_requests);
	
} 