package paf.day21.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import paf.day21.model.Order;
import paf.day21.repo.OrderRepo;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    public List<Order> getOrdersByCustomerId(int id) {
        return orderRepo.getOrdersByCustomerId(id);
    }
}
