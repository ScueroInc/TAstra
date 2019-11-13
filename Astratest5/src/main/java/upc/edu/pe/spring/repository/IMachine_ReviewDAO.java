package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Machine_Review;

public interface IMachine_ReviewDAO extends JpaRepository<Machine_Review,Integer>{
	
	@Query("from Machine_Review mr where mr.id_medical_equipment.state_description like %:state_description%")
	List<Machine_Review> searchStateDescription(@Param("state_description")String state_description);

	@Query("from Machine_Review mr where mr.id_engineer.manager_reviews like %:manager_reviews%")
	List<Machine_Review> searchManageReviews(@Param("manager_reviews")float manager_reviews);
}