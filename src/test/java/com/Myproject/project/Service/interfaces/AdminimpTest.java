package com.Myproject.project.Service.interfaces;

import com.Myproject.project.Repository.RepositoryAdmin;
import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Phone;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

@SpringBootTest
class AdminimpTest {


    @Autowired
    private Adminimp adminimp;

    @Autowired
    private Phoneimp phoneimp;

    private RepositoryAdmin repositoryAdmin;

    private Admin admin1;
    private Admin admin2;

    @Test
    void add() {
        Admin admin1 = new Admin(25,"Naser","0584738294","Jeadah","Naser@Gmail.com");
        Admin admin2 = new Admin(25,"Mohamad","0538473827","riadh","Mohmad@Gmail.com");
        adminimp.add(admin1);
        adminimp.add(admin2);
    }

    @Test
    public void deletAdmin() {
       adminimp.deletAdmin(25);

    }

    @Test
    public  void showAllAdmin(){
        List<Admin> adminList = adminimp.showAll();
        assertEquals(12,adminList.size());

    }
    @Test
    void showPhone() {
        List<Phone> phoneList = phoneimp.showAll();
        assertEquals(6,phoneList.size());

    }
}