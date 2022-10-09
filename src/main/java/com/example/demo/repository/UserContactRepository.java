package com.example.demo.repository;

import com.example.demo.entity.User;
import com.example.demo.entity.UserContact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserContactRepository extends JpaRepository<UserContact, String> {
    List<UserContact> findUserContactsByUser(User user);
}
