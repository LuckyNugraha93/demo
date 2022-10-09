package com.example.demo.adapter;

import com.example.demo.entity.User;
import com.example.demo.entity.UserContact;
import com.example.demo.repository.UserContactRepository;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserAdapter {
    private final UserRepository userRepository;
    private final UserContactRepository userContactRepository;
    public User getUserInfo(String id) {
        User user = userRepository.getById(id);
        List<UserContact> userContactList = userContactRepository.findUserContactsByUser(user);
        user.setUserContacts(userContactList);
        return user;
    }
}
