package com.senai.engSecurity.service;

import com.senai.engSecurity.model.User;
import com.senai.engSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public User findByUsernameAndPassword(User user) {
        return this.userRepository
                .findByUsernameAndPassword(user.getUsername(), user.getPassword())
                .orElseThrow(() -> new UsernameNotFoundException(user.getUsername()));
    }

    // Novo método para buscar todos os usuários
    public List<User> findAllUsers() {
        return userRepository.findAll();  // Retorna todos os usuários
    }
}
