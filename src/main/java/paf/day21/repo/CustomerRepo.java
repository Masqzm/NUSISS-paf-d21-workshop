package paf.day21.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import paf.day21.SQLQueries;
import paf.day21.model.Customer;
import paf.day21.model.exception.ResourceNotFoundException;

@Repository
public class CustomerRepo {
    @Autowired
    JdbcTemplate template;

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<>();
        
        SqlRowSet sqlRowSet = template.queryForRowSet(SQLQueries.SQL_GET_ALLCUSTOMERS);
        
        while (sqlRowSet.next()) {
            Customer cust = new Customer(sqlRowSet.getInt("id"),
                            sqlRowSet.getString("company"),
                            sqlRowSet.getString("first_name"), 
                            sqlRowSet.getString("last_name"), 
                            sqlRowSet.getString("email_address"), 
                            sqlRowSet.getString("job_title"),
                            sqlRowSet.getString("business_phone"));
            customers.add(cust);
        }

        if(customers.isEmpty()) 
            throw new ResourceNotFoundException("No records in Customer table");

        return customers;
    }
    
    public List<Customer> getCustomers(int limit, int offset) {
        if(limit < 1)
            return getCustomers();

        List<Customer> customers = new ArrayList<>();

        // Auto-mapping mtd (ensure model attribute have same name as DB)
        customers = template.query(SQLQueries.SQL_GET_CUSTOMERS_LIMITOFFSET, BeanPropertyRowMapper.newInstance(Customer.class), limit, offset);
                
        if(customers.isEmpty()) 
            throw new ResourceNotFoundException("No records in Customer table");

        return customers;
    }

    public Customer getCustomerById(int id) {
        try {
            Customer cust = template.queryForObject(SQLQueries.SQL_GET_CUSTOMER, BeanPropertyRowMapper.newInstance(Customer.class), id);

            return cust;
        } catch (DataAccessException ex) {
            throw new ResourceNotFoundException("Customer with ID " + id + " not found");
        }
    }
}
