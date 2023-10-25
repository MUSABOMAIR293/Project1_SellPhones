package com.Myproject.project.Service.interfaces;


import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {


    public Customer add(Customer customer);

    public List<Customer> showAll();

    public Customer findByIdCustomer(Integer id_user);

    public String  deletCusomer(Integer id_user);
    List<Phone> showAllPhone();
}
