package com.Myproject.project.Service.Imp;


import com.Myproject.project.Repository.RepositoryPhone;
import com.Myproject.project.Service.interfaces.Phoneimp;
import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import com.Myproject.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService implements Phoneimp {

    @Autowired
    private RepositoryPhone repositoryPhone;

    @Override
    public Phone addPhone(Phone phone) {
        Phone phone1 = this.repositoryPhone.save(phone);
            return phone;
    }

    @Override
    public List<Phone> showAll() {
        return repositoryPhone.findAll();
    }

    @Override
    public Phone findByIdPhone(Integer id_user) {
        Optional<Phone> phone1 = this.repositoryPhone.findById(id_user);
        return phone1.orElse(null);
    }


    @Override
    public String deletePhone(Integer id_user) {
        repositoryPhone.deleteById(id_user);
        return "Record Deleted";
    }
}
