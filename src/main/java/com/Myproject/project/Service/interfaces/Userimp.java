package com.Myproject.project.Service.interfaces;


import com.Myproject.project.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Userimp {



    public User add(User user);

    public List<User> showUser();


}
