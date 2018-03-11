package com.mathologic.projects.crewlink.services;

import com.mathologic.projects.crewlink.models.Users;

import java.util.List;

public interface UserService {
     void create(Users user);

     void update(Users user);

     void delete(Users user);

     void deleteAll();

     Users find(Users user);

     List< Users > findAll();
}
