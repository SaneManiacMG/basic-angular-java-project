package com.java.backend.fullstack.controller;

import com.java.backend.fullstack.model.Customers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {
    @GetMapping("/Customers")
    public List<Customers> getCustomers(Model model) {
        List<Customers> customersList = new ArrayList<Customers>();
        customersList.add(new Customers("abc", "xyz"));
        customersList.add(new Customers("a1", "b2"));

        return customersList;
    }
}
