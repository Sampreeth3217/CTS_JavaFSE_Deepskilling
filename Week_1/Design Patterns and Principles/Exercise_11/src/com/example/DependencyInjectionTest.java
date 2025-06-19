package com.example;

public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create repository
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService service = new CustomerService(repository);

        // Use service
        service.displayCustomer("C001");
        service.displayCustomer("C003"); // Not found
    }
}
