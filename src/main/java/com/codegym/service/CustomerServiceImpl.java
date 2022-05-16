package com.codegym.service;

import com.codegym.model.Customer;

import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "QuocAnh", "qa@gmail.com", "HaNoi"));
        customers.put(2, new Customer(2, "Dung", "dung@gmail.com", "TuyenQuang"));
        customers.put(3, new Customer(3, "Loc", "loc@gmail.com", "HaiPhong"));
        customers.put(4, new Customer(4, "Long", "long@gmail.com", "QuangNinh"));
        customers.put(5, new Customer(5, "Minh", "minh@gmail.com", "HaNoi"));
        customers.put(6, new Customer(6, "Hung", "hung@gmail.com", "PhuTho"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
