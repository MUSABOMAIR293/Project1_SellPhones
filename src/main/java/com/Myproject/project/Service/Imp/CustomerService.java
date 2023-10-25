package com.Myproject.project.Service.Imp;

import com.Myproject.project.Repository.RepositoryCustomer;
import com.Myproject.project.Repository.RepositoryPhone;
import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements com.Myproject.project.Service.interfaces.CustomerService {


    @Autowired
    private RepositoryCustomer repositoryCustomer;

    @Autowired
    private RepositoryPhone repositoryPhone;


    @Override
    public Customer add(Customer customer) {
        Customer customer1 = this.repositoryCustomer.save(customer);
        return customer1;
    }

    @Override
    public List<Customer> showAll() {
        return repositoryCustomer.findAll();
    }

    @Override
    public Customer findByIdCustomer(Integer id_user) {
        Optional<Customer> customer = this.repositoryCustomer.findById(id_user);
        return customer.orElse(null);
    }


    @Override
    public String deletCusomer(Integer id_user) {
        repositoryCustomer.deleteById(id_user);
        return "Record Deleted";
    }

    @Override
    public List<Phone> showAllPhone() {
        return repositoryPhone.findAll();
    }


}
