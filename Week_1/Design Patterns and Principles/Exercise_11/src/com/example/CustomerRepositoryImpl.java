package com.example;

import java.util.HashMap;
import java.util.Map;

public class CustomerRepositoryImpl implements CustomerRepository {
    private Map<String, Customer> customers = new HashMap<>();

    public CustomerRepositoryImpl() {
        customers.put("C001", new Customer("C001", "Alice"));
        customers.put("C002", new Customer("C002", "Bob"));
    }

    @Override
    public Customer findCustomerById(String id) {
        return customers.get(id);
    }
}
