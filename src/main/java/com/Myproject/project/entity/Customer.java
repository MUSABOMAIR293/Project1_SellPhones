package com.Myproject.project.entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.*;

@Entity
public class Customer extends User{



    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    private List<Phone> phone;



    public Customer() {
    }

    public Customer(int id_user, String name, String phoneNumber, String adreess, String email, List<Phone> phone) {
        super(id_user, name, phoneNumber, adreess, email);
        this.phone = phone;
    }


}
