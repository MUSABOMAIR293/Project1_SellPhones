package com.Myproject.project.Service.interfaces;

import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private Phoneimp phoneimp;
    @Test
    void showAllCusomer() {
        List<Customer> customerList=customerService.showAll();
        assertEquals(2,customerList.size());
    }

    @Test
    void deletCusomer() {
        customerService.deletCusomer(30);

    }

    @Test
    void showAllPhone() {
        List<Phone> phoneList = phoneimp.showAll();
        assertEquals(6,phoneList.size());
    }
}