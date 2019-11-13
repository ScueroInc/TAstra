package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Membership;

public interface IMembershipDAO extends JpaRepository<Membership, Integer> {

	@Query("from Membership msp where mp.name_plan like %:name_plan%")
	List<Membership> searchName(@Param("name_plan")String name_plan);
}
