package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.District;

public interface IDistrictDAO extends JpaRepository<District, Integer>{

	@Query("from District d where d.id_city.name_city like %:name_city%")
	List<District> searchDistrictCity(@Param("name_city")String name_city);

	@Query("from District d where d.name_district like %:name_district%")
	List<District> searchDistrict(@Param("name_district")String name_district);

}
