package com.neeraj.netflixschema.service.implemetations;

import com.neeraj.netflixschema.Model.Users;
import com.neeraj.netflixschema.repo.UserRepo;
import com.neeraj.netflixschema.service.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements MyServices {

    @Autowired
    private UserRepo userRepo;

    @Override
    public List<Users> getUsers() {
        return  userRepo.findAll();
    }

    @Override
    public void addUser(Users user) {

        userRepo.save(user);

    }
}
