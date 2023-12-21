package guru.springframework.msscbrewery.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbrewery.repository.CustomerRepository;
import guru.springframework.msscbrewery.web.model.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final ObjectMapper mapper;
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(ObjectMapper mapper, CustomerRepository customerRepository) {
        this.mapper = mapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                   .id(UUID.randomUUID())
                        .name("almaz").build();
    }

    @Override
    public CustomerDto addNewCustomer(CustomerDto customerDto) {
        //ModelMapper mapper = new ModelMapper();
        Customer customer = mapper.convertValue(customerDto, Customer.class);

        Customer savedCustomer = customerRepository.addNewCustomer(customer);
        CustomerDto savedCustomerDto = mapper.convertValue(savedCustomer, CustomerDto.class);

        return savedCustomerDto;

    }
}
