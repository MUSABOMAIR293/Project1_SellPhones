package com.Myproject.project.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_phone;

    private String namePhone;

    private String Size;

    private String color;

    private String deic;

    //fetch = FetchType.LAZY
    @ManyToOne
    @JoinColumn(name = "AdminAdet")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "Customer")
    private Customer customer;

    public Phone(int id_phone, String namePhone, String size, String color, String deic, Admin admin, Customer customer) {
        this.id_phone = id_phone;
        this.namePhone = namePhone;
        Size = size;
        this.color = color;
        this.deic = deic;
        this.admin = admin;
        this.customer = customer;
    }

    public Phone() {
    }

    public int getId_phone() {
        return id_phone;
    }

    public void setId_phone(int id_phone) {
        this.id_phone = id_phone;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDeic() {
        return deic;
    }

    public void setDeic(String deic) {
        this.deic = deic;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id_phone == phone.id_phone && Objects.equals(namePhone, phone.namePhone) && Objects.equals(Size, phone.Size) && Objects.equals(color, phone.color) && Objects.equals(deic, phone.deic) && Objects.equals(admin, phone.admin) && Objects.equals(customer, phone.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_phone, namePhone, Size, color, deic, admin, customer);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id_phone=" + id_phone +
                ", namePhone='" + namePhone + '\'' +
                ", Size='" + Size + '\'' +
                ", color='" + color + '\'' +
                ", deic='" + deic + '\'' +
                ", admin=" + admin +
                ", customer=" + customer +
                '}';
    }
}
