package paf.day21.model;

import java.sql.Date;

public class Order {
    private int id;
    private int customer_id;
    private Date order_date;
    private Date shipped_date;
    private Date paid_date;
    private float shipping_fee;
    private float taxes;
    private double tax_rate;
    private String ship_name;
    private String ship_address;
    private String ship_city;
    private String ship_state_province;
    private String ship_zip_postal_code;
    private String ship_country_region;

    public Order() {}
    public Order(int id, int customer_id, Date order_date, Date shipped_date, Date paid_date, float shipping_fee,
            float taxes, double tax_rate, String ship_name, String ship_address, String ship_city,
            String ship_state_province, String ship_zip_postal_code, String ship_country_region) {
        this.id = id;
        this.customer_id = customer_id;
        this.order_date = order_date;
        this.shipped_date = shipped_date;
        this.paid_date = paid_date;
        this.shipping_fee = shipping_fee;
        this.taxes = taxes;
        this.tax_rate = tax_rate;
        this.ship_name = ship_name;
        this.ship_address = ship_address;
        this.ship_city = ship_city;
        this.ship_state_province = ship_state_province;
        this.ship_zip_postal_code = ship_zip_postal_code;
        this.ship_country_region = ship_country_region;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public Date getOrder_date() {
        return order_date;
    }
    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
    public Date getShipped_date() {
        return shipped_date;
    }
    public void setShipped_date(Date shipped_date) {
        this.shipped_date = shipped_date;
    }
    public Date getPaid_date() {
        return paid_date;
    }
    public void setPaid_date(Date paid_date) {
        this.paid_date = paid_date;
    }
    public float getShipping_fee() {
        return shipping_fee;
    }
    public void setShipping_fee(float shipping_fee) {
        this.shipping_fee = shipping_fee;
    }
    public float getTaxes() {
        return taxes;
    }
    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }
    public double getTax_rate() {
        return tax_rate;
    }
    public void setTax_rate(double tax_rate) {
        this.tax_rate = tax_rate;
    }
    public String getShip_name() {
        return ship_name;
    }
    public void setShip_name(String ship_name) {
        this.ship_name = ship_name;
    }
    public String getShip_address() {
        return ship_address;
    }
    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }
    public String getShip_city() {
        return ship_city;
    }
    public void setShip_city(String ship_city) {
        this.ship_city = ship_city;
    }
    public String getShip_state_province() {
        return ship_state_province;
    }
    public void setShip_state_province(String ship_state_province) {
        this.ship_state_province = ship_state_province;
    }
    public String getShip_zip_postal_code() {
        return ship_zip_postal_code;
    }
    public void setShip_zip_postal_code(String ship_zip_postal_code) {
        this.ship_zip_postal_code = ship_zip_postal_code;
    }
    public String getShip_country_region() {
        return ship_country_region;
    }
    public void setShip_country_region(String ship_country_region) {
        this.ship_country_region = ship_country_region;
    }

    
}