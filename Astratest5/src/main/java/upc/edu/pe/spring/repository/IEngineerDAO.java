package upc.edu.pe.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upc.edu.pe.spring.model.Engineer;

@Repository
public interface IEngineerDAO extends JpaRepository<Engineer,Integer>{

}