package com.Myproject.project.Repository;

import com.Myproject.project.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCustomer extends JpaRepository<Customer,Integer> {
}
