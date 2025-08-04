package com.ijse.gdse72.spbootdeployement.repository;

import com.ijse.gdse72.spbootdeployement.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
