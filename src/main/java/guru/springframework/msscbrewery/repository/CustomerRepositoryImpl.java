package guru.springframework.msscbrewery.repository;

import guru.springframework.msscbrewery.web.model.Customer;
import org.springframework.stereotype.Repository;

/**
 * created by Almaz on 21.12.2023
 */
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer addNewCustomer(Customer customer) {
        //TODO
        return new Customer();
    }
}
