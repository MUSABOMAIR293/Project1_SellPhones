package com.Myproject.project.Service.interfaces;

import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Phone;
import org.springframework.stereotype.Service;
import  java.util.*;
@Service
public interface Adminimp {



  public   Admin add(Admin admin);

  public    List<Admin> showAll();

  public Admin findByid(Integer id_user);

  public String  deletAdmin(Integer id_user);

  List<Phone> showPhone();
}
