package com.Myproject.project.Service.interfaces;


import com.Myproject.project.entity.Customer;
import com.Myproject.project.entity.Phone;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Phoneimp {

    public Phone addPhone(Phone phone);

    public List<Phone> showAll();

    public Phone findByIdPhone(Integer id_user);

    public String  deletePhone(Integer id_user);

}
