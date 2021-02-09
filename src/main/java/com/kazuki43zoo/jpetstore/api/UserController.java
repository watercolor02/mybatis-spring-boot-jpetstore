package com.kazuki43zoo.jpetstore.api;

import com.kazuki43zoo.jpetstore.domain.User;
import com.kazuki43zoo.jpetstore.mapper.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    @ResponseBody
    public Object getAllUsers() {
        Iterable<User> list = userRepository.findAll();
        return list;
    }
}
