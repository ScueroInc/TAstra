package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Detail_Hospital_Area;

public interface IDetail_Hospital_AreaDAO  extends JpaRepository<Detail_Hospital_Area, Integer>{

	@Query("from Detail_Hospital_Area dha where dha.id_hospital like %:id_hospital%")
	List<Detail_Hospital_Area> searchHosp(@Param("id_hospital")int id_hospital);
	
	@Query("from Detail_Hospital_Area dha where dha.id_area like %:id_area%")
	List<Detail_Hospital_Area> searchArea(@Param("id_area")int id_area);
	
	
}
