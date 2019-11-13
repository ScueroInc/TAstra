package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.Order;

public interface IOrderDAO extends JpaRepository<Order, Integer>{
	
	@Query("from Order o where o.id_manager.amount_requests like %:amount_requests%")
	List<Order> searchAmountRequestHospitalArea(@Param("amount_requests")int amount_requests);
	
	@Query("from Order o where o.priority like %:priority%")
	List<Order> searchPriority(@Param("priority")int priority);

}
