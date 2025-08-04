package com.ijse.gdse72.spbootdeployement.service.impl;

import com.ijse.gdse72.spbootdeployement.entity.Customer;
import com.ijse.gdse72.spbootdeployement.repository.CustomerRepository;
import com.ijse.gdse72.spbootdeployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        Customer customer1 = getCustomerById(id);
        customerRepository.delete(customer1);
    }
}
