package br.com.beecrowd.uri2602.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.beecrowd.uri2602.dto.CustomerMinDTO;
import br.com.beecrowd.uri2602.entities.Customer;
import br.com.beecrowd.uri2602.projections.CustomerMinProjection;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	@Query(nativeQuery = true, value = "SELECT name " 
			+ "FROM customers "
			+ "WHERE UPPER(state) = UPPER(:state)")
	List<CustomerMinProjection> search1(String state);

	@Query("SELECT new br.com.beecrowd.uri2602.dto.CustomerMinDTO(obj.name) "
			+ "FROM Customer obj "
			+ "WHERE UPPER(obj.state) = UPPER(:state)")
	List<CustomerMinDTO> search2(String state);
}
