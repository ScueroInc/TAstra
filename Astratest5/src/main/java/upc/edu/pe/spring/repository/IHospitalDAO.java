package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Hospital;

public interface IHospitalDAO extends JpaRepository<Hospital,Integer>{	
	
	@Query("from Hospital hs where hs.name_hospital like %:name_hospital%")
	List<Hospital> searchNameHospital(@Param("name_hospital")String name_hospital);
	
	@Query("from Hospital hs where hs.ruc_hospital like %:ruc_hospital%")
	List<Hospital> searchRucHospital(@Param("ruc_hospital")int ruc_hospital);
	
} 