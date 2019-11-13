package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Medical_Equipment;

public interface IMedical_EquipmentDAO extends JpaRepository<Medical_Equipment, Integer> {

	@Query("from Medical_Equipment me where me.id_model.name_modiel like %:name_modiel%")
	List<Medical_Equipment> searchNameModel(@Param("name_modiel")String name_modiel);
	
	@Query("from Medical_Equipment me where me.state_description like %:state_description%")
	List<Medical_Equipment> searchDescriptionMedical_Equipment(@Param("state_description")String state_description);
}
