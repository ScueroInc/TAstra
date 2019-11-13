package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Model;


public interface IModelDAO extends JpaRepository<Model, Integer> {
	
	@Query("from Model mo where mo.name_model like %:name_model%")
	List<Model> searchName(@Param("name_model")String name_model);
	
	@Query("from Model mo where mo.id_brand.name_brand like %:name_brand%")
	List<Model> searchNameBrand(@Param("name_brand")String name_brand);

}
