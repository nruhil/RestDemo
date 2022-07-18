package com.neeraj.netflixschema.service;

import com.neeraj.netflixschema.Model.Users;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.*;

public interface MyServices {


    List<Users> getUsers();
    void addUser(Users user);
}

