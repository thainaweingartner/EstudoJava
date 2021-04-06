package com.portalstudy;

import com.portalstudy.connection.ConnectionFactory;
import com.portalstudy.model.User;
import com.portalstudy.repository.UserRepository;

public class Main {

    public static void main(String[] args) {
        update();
    }

    public static void save(){
        User user = new User("Bruno Segato", "123", "STUDENT");
        UserRepository.save(user);
    }

    public static void update(){
        User user = new User(2L, "Bruno Segato", "1234", "STUDENT");
        UserRepository.update(user);
    }
}
