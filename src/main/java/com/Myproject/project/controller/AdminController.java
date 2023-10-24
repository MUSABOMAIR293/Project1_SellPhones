package com.Myproject.project.controller;


import com.Myproject.project.Service.Imp.AdminService;
import com.Myproject.project.Service.Imp.PhoneService;
import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private PhoneService phoneService;


    @GetMapping("/showAllPhone")
    public List<Phone> showPhone(){
        return adminService.showPhone();
    }

    @GetMapping("/details")
    public List<Admin> show(){
        return adminService.showAll();

    }


    @PostMapping("/add-Admin")
    public Admin add(@RequestBody Admin admin){

          return   adminService.add(admin);


    }
    @PostMapping("/Update-Admin")
    public Admin update(@RequestBody Admin admin){
        return adminService.add(admin);
    }

    @GetMapping("/get-id")
    public Admin findById(@RequestParam Integer id){
        return adminService.findByid(id);
    }

    @DeleteMapping("delete/{id_user}")
    public String deletAdmin(@PathVariable Integer id_user ){
        return  adminService.deletAdmin(id_user);
       }
}



