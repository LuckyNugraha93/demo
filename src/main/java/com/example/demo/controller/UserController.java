package com.example.demo.controller;

import com.example.demo.adapter.UserAdapter;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserAdapter userAdapter;
    @GetMapping("get-user-info/{id}")
    public @ResponseBody Object getUser(@PathVariable(value = "id")String id){
        try{
            Object response = userAdapter.getUserInfo(id);
            return response;
        }catch(Exception e){
            //e.printStackTrace();
            return null;
        }
    }
}
