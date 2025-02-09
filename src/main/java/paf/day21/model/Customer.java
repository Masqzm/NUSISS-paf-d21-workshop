package paf.day21.model;

public class Customer {
    private int id;
    private String company;
    private String first_name;
    private String last_name;
    private String email_address;
    private String job_title;
    private String business_phone;
    
    public Customer() {}
    public Customer(int id, String company, String first_name, String last_name, String email_address, String job_title,
            String business_phone) {
        this.id = id;
        this.company = company;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_address = email_address;
        this.job_title = job_title;
        this.business_phone = business_phone;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", company=" + company + ", first_name=" + first_name + ", last_name=" + last_name
                + ", email_address=" + email_address + ", job_title=" + job_title + ", business_phone=" + business_phone
                + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail_address() {
        return email_address;
    }
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    public String getJob_title() {
        return job_title;
    }
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
    public String getBusiness_phone() {
        return business_phone;
    }
    public void setBusiness_phone(String business_phone) {
        this.business_phone = business_phone;
    }
}
