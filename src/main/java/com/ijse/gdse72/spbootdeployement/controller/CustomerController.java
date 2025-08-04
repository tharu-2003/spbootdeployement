package com.ijse.gdse72.spbootdeployement.controller;

import com.ijse.gdse72.spbootdeployement.entity.Customer;
import com.ijse.gdse72.spbootdeployement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public String getCustomers() {
        return "Customer 1";
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id){
        return ResponseEntity.ok(customerService.getCustomerById(id));
    }

    @PutMapping
    public ResponseEntity<Customer> updateProduct(@RequestBody Customer customer) {
        return ResponseEntity.ok(customerService.updateCustomer(customer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> deleteProduct(@PathVariable Long id){
        customerService.deleteCustomer(id);
        return ResponseEntity.noContent().build();
    }
}
