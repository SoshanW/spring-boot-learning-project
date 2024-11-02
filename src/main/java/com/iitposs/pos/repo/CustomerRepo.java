package com.iitposs.pos.repo;

import com.iitposs.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    //The generic parameters would be the object (entity) and the primary key of the object
    List<Customer> findAllByActiveStateEquals(boolean state);


}
