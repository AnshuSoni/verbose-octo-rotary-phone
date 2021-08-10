package com.example.dbtest.initialloaders;

import com.example.dbtest.models.Users;
import com.example.dbtest.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Slf4j
public class UserDataLoaders implements CommandLineRunner {
    @Autowired
    UsersRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    private void loadUserData() {
        ArrayList<Users> usersArrayList = new ArrayList<Users>();
        usersArrayList.add(new Users("Abhishek", "Computer Science"));
        usersArrayList.add(new Users("Abhishek1", "Computer Science"));
        usersArrayList.add(new Users("Abhishek2", "Computer Science"));
        usersArrayList.add(new Users("Abhishek3", "Computer Science"));
        usersArrayList.add(new Users("Abhishek4", "Computer Science"));
        usersArrayList.add(new Users("Abhishek5", "Computer Science"));

        userRepository.saveAll(usersArrayList);
        log.info(usersArrayList.size() + " :: Records has been added to the database");
    }
}
