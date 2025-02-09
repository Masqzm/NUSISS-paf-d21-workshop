package paf.day21.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import paf.day21.SQLQueries;
import paf.day21.model.Order;

@Repository
public class OrderRepo {
    @Autowired
    JdbcTemplate template;

    public List<Order> getOrdersByCustomerId(int customerId) {
        List<Order> orders = new ArrayList<>();

        orders = template.query(SQLQueries.SQL_GET_ORDERS_CUSTOMERID, BeanPropertyRowMapper.newInstance(Order.class), customerId);

        return orders;
    }
}
