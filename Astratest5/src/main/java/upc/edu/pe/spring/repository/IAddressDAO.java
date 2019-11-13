package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Address;

public interface IAddressDAO extends JpaRepository<Address,Integer>{
	
	@Query("from Adress a where a.id_district.name_district like %:name_disctrict%")
	List<Address> searchDisctrict(@Param("name_district")String name_district);

	@Query("from Adress a where a.id_via.name_via like %:name_via%")
	List<Address> searchTipeVia(@Param("name_via")String name_via);
}