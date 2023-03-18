package com.neeraj.netflixschema.contoller;

import com.neeraj.netflixschema.Model.Users;
import com.neeraj.netflixschema.service.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestEndpoint {
    @Autowired
    private MyServices myServices;

    @RequestMapping("/users")
    public List<Users> getAllUser(){

        return myServices.getUsers();
    }
    @RequestMapping(method = RequestMethod.POST, value = "/user/add")
    public String saveUser(@RequestBody Users user){
        if ( user == null)
            return "error";
        myServices.addUser(user);
        return "succes";
    }
}
