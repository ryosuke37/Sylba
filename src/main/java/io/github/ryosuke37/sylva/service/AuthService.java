package io.github.ryosuke37.sylva.service;

import io.github.ryosuke37.sylva.repository.UserRepository;
import io.github.ryosuke37.sylva.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {
    private final UserRepository userRepository;

    @Autowired
    AuthService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void signUp(User user){
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }
}