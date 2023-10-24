package com.Myproject.project.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_user;

    private String name;

    private String phoneNumber;
    private String adreess;
    private String email;

    public User(int id_user, String name, String phoneNumber, String adreess, String email) {
        this.id_user = id_user;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.adreess = adreess;
        this.email = email;
    }

    public User() {
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdreess() {
        return adreess;
    }

    public void setAdreess(String adreess) {
        this.adreess = adreess;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id_user == user.id_user && Objects.equals(name, user.name) && Objects.equals(phoneNumber, user.phoneNumber) && Objects.equals(adreess, user.adreess) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_user, name, phoneNumber, adreess, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", adreess='" + adreess + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
