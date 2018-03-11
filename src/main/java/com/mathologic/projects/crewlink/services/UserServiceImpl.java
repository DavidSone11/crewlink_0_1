package com.mathologic.projects.crewlink.services;

import com.mathologic.projects.crewlink.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserService userService;

    @Override
    public void create(Users user) {
        userService.create(user);
    }

    @Override
    public void update(Users user) {
        userService.update(user);
    }

    @Override
    public void delete(Users user) {
        userService.delete(user);
    }

    @Override
    public void deleteAll() {
        userService.deleteAll();
    }

    @Override
    public Users find(Users user) {
        return userService.find(user);
    }

    @Override
    public List<Users> findAll() {
        return findAll();
    }
}
