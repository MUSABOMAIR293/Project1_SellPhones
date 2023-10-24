package com.Myproject.project.Service.Imp;

import com.Myproject.project.Repository.RepositoryAdmin;
import com.Myproject.project.Repository.RepositoryPhone;
import com.Myproject.project.Service.interfaces.Adminimp;
import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService implements Adminimp {
    @Autowired
    private RepositoryAdmin repositoryAdmin;

    @Autowired
    private RepositoryPhone repositoryPhone;

    @Override
    public List<Admin> showAll() {
       return   repositoryAdmin.findAll();
    }

    @Override
    public Admin add(Admin admin) {
        Admin admin1 = this.repositoryAdmin.save(admin);
        return admin1;
    }

    @Override
    public String deletAdmin(Integer id_user) {
        repositoryAdmin.deleteById(id_user);
        return "Record Deleted";
    }

    @Override
    public List<Phone> showPhone() {
        return repositoryPhone.findAll();
    }


    @Override
    public Admin findByid(Integer id){
        Optional<Admin> admin = this.repositoryAdmin.findById(id);
        return  admin.orElse(null);

    }



}
