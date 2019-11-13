package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Tipo_via;

public interface ITipo_ViaDAO extends JpaRepository<Tipo_via, Integer>{

	@Query("from Tipo_via tv where tv.name_via like %:name_via%")
	List<Tipo_via> searchName(@Param("name_via")String name_via);
}
