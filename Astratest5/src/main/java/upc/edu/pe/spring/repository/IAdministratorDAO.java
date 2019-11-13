package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Administrator;

public interface IAdministratorDAO extends JpaRepository<Administrator,Integer>{
	
	@Query("from Administrator ad where ad.id_plan.name_plan like %:name_plan%")
	List<Administrator> searchAdministrator(@Param("name_plan")String name_plan);	
	}
