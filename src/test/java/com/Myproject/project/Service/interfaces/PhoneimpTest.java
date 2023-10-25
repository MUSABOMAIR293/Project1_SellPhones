package com.Myproject.project.Service.interfaces;

import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
@SpringBootTest
class PhoneimpTest {

    @Autowired
    private Phoneimp phoneimp;

    private Phone phone1;



    @Test
    void showAllPhone() {
        List<Phone> phoneList = phoneimp.showAll();
        assertEquals(6,phoneList.size());
    }

}