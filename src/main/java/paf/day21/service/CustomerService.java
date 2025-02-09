package paf.day21.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paf.day21.model.Customer;
import paf.day21.repo.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers(int limit, int offset) {
        return customerRepo.getCustomers(limit, offset);
    }

    public Customer getCustomerById(int id) {
        return customerRepo.getCustomerById(id);
    }
    
}
