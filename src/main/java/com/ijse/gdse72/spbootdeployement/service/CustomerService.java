package com.ijse.gdse72.spbootdeployement.service;

import com.ijse.gdse72.spbootdeployement.entity.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAllCustomers();
    Customer getCustomerById(Long id);
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long id);
}
