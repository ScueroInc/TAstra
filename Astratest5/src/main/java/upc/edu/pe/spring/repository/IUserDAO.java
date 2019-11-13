package upc.edu.pe.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import upc.edu.pe.spring.model.User;

public interface IUserDAO extends JpaRepository<User, Integer> {
	
	@Query("from User u where u.first_name like %:first_name%")
	List<User> searchFirstName(@Param("first_name")String first_name);

	@Query("from User u where u.last_name like %:last_name%")
	List<User> searchLastName(@Param("last_name")String last_name);
	
	@Query("from User u where u.phone like %:phone%")
	List<User> searchPhone(@Param("phone")int phone);
}
