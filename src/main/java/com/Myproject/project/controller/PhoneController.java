package com.Myproject.project.controller;

import com.Myproject.project.Service.Imp.PhoneService;
import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/phone")
public class PhoneController {

    @Autowired
    private PhoneService phoneService;
    @GetMapping("/showall")
    public List<Phone> showphone(){
        return phoneService.showAll();
    }


    @PostMapping("/add-phone")
    public Phone add(@RequestBody Phone phone){
        return phoneService.addPhone(phone);
    }

    @DeleteMapping("delete/{id_user}")
    public String deletePhone(@PathVariable Integer id_user ){
        return  phoneService.deletePhone(id_user);
    }


    @GetMapping("/get-id")
    public Phone findByIdPhone(@RequestParam Integer id){
        return phoneService.findByIdPhone(id);
    }





}
