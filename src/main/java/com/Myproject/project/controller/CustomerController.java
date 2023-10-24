package com.Myproject.project.controller;

import com.Myproject.project.Service.Imp.CustomerService;
import com.Myproject.project.Service.Imp.PhoneService;
import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private PhoneService phoneService;

    @GetMapping("/show")
    public List<Customer> showCustomer(){
        return customerService.showAll();

    }

    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer){
        return customerService.add(customer);
    }
    @DeleteMapping("delete/{id_user}")
    public String deletCustomer(@PathVariable Integer id_user ){
        return  customerService.deletAdmin(id_user);
    }

    @GetMapping("/get-id")
    public Customer findByIdCustomer(@RequestParam Integer id){
        return customerService.findByIdCustomer(id);
    }

    @GetMapping("/allPhone")
    public List<Phone> showAllPhone(){
        return phoneService.showAll();
    }

}
