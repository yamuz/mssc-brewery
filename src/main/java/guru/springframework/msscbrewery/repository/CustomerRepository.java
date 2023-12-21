package guru.springframework.msscbrewery.repository;

import guru.springframework.msscbrewery.web.model.Customer;

/**
 * created by Almaz on 21.12.2023
 */
public interface CustomerRepository {

    Customer addNewCustomer(Customer customer);
}
