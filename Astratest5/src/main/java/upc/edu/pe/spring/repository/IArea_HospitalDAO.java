package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Area_Hospital;

public interface IArea_HospitalDAO extends JpaRepository<Area_Hospital,Integer>{
	@Query("from Area_Hospital ah where ah.name_area_hospital like %:name_area_hospital%")
	List<Area_Hospital> buscarNombreHosítal(@Param("name_area_hospital")String name_area_hospital);
}
