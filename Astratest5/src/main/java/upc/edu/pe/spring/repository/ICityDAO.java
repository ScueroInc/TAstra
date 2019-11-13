package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.City;

public interface ICityDAO extends JpaRepository<City, Integer>{
	
	@Query("from City c where c.name_city like %:name_city%")
	List<City> searchCity(@Param("name_city")String name_city);	

}
