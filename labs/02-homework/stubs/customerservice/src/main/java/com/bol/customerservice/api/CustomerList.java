package com.bol.customerservice.api;

import java.util.List;

public class CustomerList {

    private List<Customer> customers;

    public CustomerList() {
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

}
