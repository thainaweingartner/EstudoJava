package com.portalstudy;

import com.portalstudy.connection.ConnectionFactory;
import com.portalstudy.model.User;
import com.portalstudy.repository.UserRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> listOfUsers = list();
        System.out.println(listOfUsers);
    }

    public static void save(){
        User user = new User("Bruno Segato", "123", "STUDENT");
        UserRepository.save(user);
    }

    public static void update(){
        User user = new User( "Bruno Segato", "1234", "STUDENT");
        user.setUser_id(2L);
        UserRepository.update(user);
    }

    public static void delete(){
        User user = new User();
        user.setUser_id(2L);
        UserRepository.delete(user);
    }

    public static List<User> list(){
        return UserRepository.findAll();
    }
}
