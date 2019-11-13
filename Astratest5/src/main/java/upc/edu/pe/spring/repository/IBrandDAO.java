package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Brand;

public interface IBrandDAO extends JpaRepository<Brand,Integer>{
	
	@Query("from Brand b where b.name_brand llike %:name_brand%")
	List<Brand> searchBrand(@Param("name_brand")String name_brand);	
}