package paf.day21.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import paf.day21.model.Customer;
import paf.day21.model.Order;
import paf.day21.service.CustomerService;
import paf.day21.service.OrderService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
    @Autowired
    private CustomerService customerSvc;
    @Autowired
    private OrderService orderSvc;

    // GET /api/customers 
    // Accept: application/json
    @GetMapping(path="/customers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> getAllCustomersWLimitOffset(
        @RequestParam(defaultValue="0") int limit, 
        @RequestParam(defaultValue="0") int offset) {

        List<Customer> customers = customerSvc.getAllCustomers(limit, offset);

        return ResponseEntity.ok().body(customers);
    }

    // GET /api/customer/<customer_id>  
    // Accept: application/json
    @GetMapping(path="/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        Customer customer = customerSvc.getCustomerById(id);

        return ResponseEntity.ok().body(customer);
    }

    // GET /api/customer/<customer_id>/orders  
    // Accept: application/json
    @GetMapping(path="/customer/{id}/orders", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Order>> getCustomerByIdOrders(@PathVariable int id) {
        Customer customer = customerSvc.getCustomerById(id);    // throws exception if customer not found

        List<Order> orders = orderSvc.getOrdersByCustomerId(customer.getId());   // returns empty array if no orders avail

        return ResponseEntity.ok().body(orders);
    }
}
