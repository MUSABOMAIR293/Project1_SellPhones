package com.Myproject.project.entity;


import jakarta.persistence.*;

import java.util.Objects;
import java.util.*;

@Entity
public class Admin extends User {


    @OneToMany(mappedBy = "admin")
    private List<Phone> phone;

    public Admin(int id_user, String name, String phoneNumber, String adreess, String email) {
        super(id_user, name, phoneNumber, adreess, email);
    }

    public Admin() {
    }




}
