package paf.day21;

public class SQLQueries {
    public static final String SQL_GET_ALLCUSTOMERS = "SELECT * FROM customers";
    
    public static final String SQL_GET_CUSTOMERS_LIMITOFFSET = "SELECT * FROM customers LIMIT ? OFFSET ?";
    
    public static final String SQL_GET_CUSTOMER = "SELECT * FROM customers WHERE id = ?";

    public static final String SQL_GET_ORDERS_CUSTOMERID = "SELECT * FROM orders WHERE customer_id = ?";
}
