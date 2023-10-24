package com.Myproject.project.Service.Imp;

import com.Myproject.project.Repository.RepositoryUser;
import com.Myproject.project.entity.Admin;
import com.Myproject.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class UserService {

    @Autowired
    private RepositoryUser repositoryUser;

    public User add(User user){
        User  user1 = this.repositoryUser.save(user);
        return user1;
    }

    public List<User> showUser(){
        return repositoryUser.findAll();
    }
}
